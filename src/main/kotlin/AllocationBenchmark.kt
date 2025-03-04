package github.io

import kotlinx.benchmark.*
import org.openjdk.jmh.annotations.Fork
import org.openjdk.jmh.annotations.Level
import java.util.*
import java.util.concurrent.TimeUnit
import kotlin.random.Random

@OutputTimeUnit(TimeUnit.NANOSECONDS)
@BenchmarkMode(Mode.AverageTime)
/*
 * Since this benchmark is GC-intensive, it is important to fix the GC algorithm
 * and heap sizes to avoid surprises with heuristics that may change behavior unexpectedly.
 * This is especially important for comparisons between JDK versions, and for benchmarks that incur lots of allocations.
 * Note how we lock down Parallel GC, with static 1 Gb heap
 * // jvmArgsAppend = ["-XX:+UseParallelGC", "-Xms1g", "-Xmx1g"]
 * // check this later: https://github.com/openjdk/jmh/blob/master/jmh-samples/src/main/java/org/openjdk/jmh/samples/JMHSample_35_Profilers.java
 */
@Fork(1)
@Warmup(iterations = 1)
@Measurement(iterations = 8, time = 1, timeUnit = TimeUnit.SECONDS)
@State(Scope.Benchmark)
class AllocationBenchmark {
    private var dataSet: List<Int> = emptyList()

    @Param(
        "10",
        "100",
        "1000",
        "10000",
        "100000",
        "1000000",
    )
    var size: Int = 0

    private val random = Random

    @Setup
    fun setup() {
        dataSet = buildList {
            for (number in 1..size) add(number)
        }
    }

    @TearDown(Level.Iteration)
    fun teardown() {
        dataSet = emptyList()
    }

    // On each run use the same random `Int` to make computations.
    // An effort to remove the `random factor`.
    val randomInt = random.nextInt(100_000)

    // -- stdlib --

    @Benchmark
    fun oneStepstdlibAllocationBenchmark(): List<Int> {
        return dataSet.map { it + randomInt }
    }

    @Benchmark
    fun twoStepstdlibAllocationBenchmark(): List<Int> {
        return dataSet
            .map { it + randomInt }
            .map { it + randomInt }
    }

    @Benchmark
    fun threeStepstdlibAllocationBenchmark(): List<Int> {
        return dataSet
            .map { it + randomInt }
            .map { it + randomInt }
            .map { it + randomInt }
    }

    @Benchmark
    fun shortCircuitstdlibAllocationBenchmark(): List<Int> {
        return dataSet
            .map { it + randomInt }
            .map { it + randomInt }
            .map { it + randomInt }
            .take(1)
    }

    @Benchmark
    fun zeroStepstdlibAllocationBenchmark(blackhole: Blackhole) {
        dataSet.map { it + randomInt }
            .forEach { blackhole.consume(it) }
    }

    // -- sequence --

    @Benchmark
    fun oneStepsequenceAllocationBenchmark(): List<Int> {
        return dataSet
            .asSequence()
            .map { it + randomInt }
            .toList()
    }

    @Benchmark
    fun twoStepsequenceAllocationBenchmark(): List<Int> {
        return dataSet.asSequence()
            .map { it + randomInt }
            .map { it + randomInt }
            .toList()
    }

    @Benchmark
    fun threeStepsequenceAllocationBenchmark(): List<Int> {
        return dataSet.asSequence()
            .map { it + randomInt }
            .map { it + randomInt }
            .map { it + randomInt }
            .toList()
    }

    @Benchmark
    fun shortCircuitsequenceAllocationBenchmark(): List<Int> {
        return dataSet.asSequence()
            .map { it + randomInt }
            .map { it + randomInt }
            .map { it + randomInt }
            .take(1)
            .toList()
    }

    @Benchmark
    fun zeroStepsequenceAllocationBenchmark(blackhole: Blackhole) {
        dataSet.asSequence()
            .map { it + randomInt }
            .forEach { blackhole.consume(it) }
    }

    // -- stream --

    @Benchmark
    fun oneStepstreamAllocationBenchmark(): List<Int> {
        return dataSet.stream()
            .map { it + randomInt }
            .toList()
    }

    @Benchmark
    fun twoStepstreamAllocationBenchmark(): List<Int> {
        return dataSet.stream()
            .map { it + randomInt }
            .map { it + randomInt }
            .toList()
    }

    @Benchmark
    fun threeStepstreamAllocationBenchmark(): List<Int> {
        return dataSet.stream()
            .map { it + randomInt }
            .map { it + randomInt }
            .map { it + randomInt }
            .toList()
    }

    @Benchmark
    fun shortCircuitstreamAllocationBenchmark(): List<Int> {
        return dataSet.stream()
            .map { it + randomInt }
            .map { it + randomInt }
            .map { it + randomInt }
            .limit(1)
            .toList()
    }

    @Benchmark
    fun zeroStepstreamAllocationBenchmark(blackhole: Blackhole) {
        dataSet.stream()
            .map { it + randomInt }
            .forEach { blackhole.consume(it) }
    }
}