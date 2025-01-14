package github.io

import kotlinx.benchmark.*
import org.openjdk.jmh.annotations.Fork
import org.openjdk.jmh.annotations.Level
import java.util.*
import java.util.concurrent.TimeUnit
import kotlin.random.Random

@OutputTimeUnit(TimeUnit.NANOSECONDS)
@BenchmarkMode(Mode.AverageTime)
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
    var n: Int = 0

    private val random = Random

    @Setup
    fun setup() {
        dataSet = buildList {
            repeat(n) { add(random.nextInt(100_000)) }
        }
    }

    @TearDown(Level.Iteration)
    fun teardown() {
        dataSet = emptyList()
    }

    // -- stdlib --

    @Benchmark
    fun oneStepstdlibAllocationBenchmark(): List<Int> {
        return dataSet.filter { it > random.nextInt(100_000) }
    }

    @Benchmark
    fun twoStepstdlibAllocationBenchmark(): List<Int> {
        return dataSet
            .filter { it > random.nextInt(100_000) }
            .map { it + random.nextInt(100_000) }
    }

    @Benchmark
    fun threeStepstdlibAllocationBenchmark(): List<Int> {
        return dataSet
            .filter { it > random.nextInt(100_000) }
            .map { it + random.nextInt(100_000) }
            .map { it + random.nextInt(100_000) }
    }

    // -- stream --

    @Benchmark
    fun oneStepstreamAllocationBenchmark(): List<Int> {
        return dataSet.stream().filter { it > random.nextInt(100_000) }.toList()
    }

    @Benchmark
    fun twoStepstreamAllocationBenchmark(): List<Int> {
        return dataSet.stream()
            .filter { it > random.nextInt(100_000) }
            .map { it + random.nextInt(100_000) }
            .toList()
    }

    @Benchmark
    fun threeStepstreamAllocationBenchmark(): List<Int> {
        return dataSet.stream()
            .filter { it > random.nextInt(100_000) }
            .map { it + random.nextInt(100_000) }
            .map { it + random.nextInt(100_000) }
            .toList()
    }

}