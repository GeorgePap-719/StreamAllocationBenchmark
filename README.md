# Stream benchmark 

Benchmarking the stream API vs simple transformations vs sequence API 

Another interesting metric would be to count the actual allocations.

## Results
Environment

````text
Macbook Air 
m3
java Corretto-17.0.14.7.1
````

````text
Benchmark                                                        (n)  Mode  Cnt   Score    Error  Units
# -----------------------------------------------------------------------------------------------------
AllocationBenchmark.oneStepsequenceAllocationBenchmark            10  avgt    8   4.619 ±  0.007  ns/op
AllocationBenchmark.oneStepsequenceAllocationBenchmark           100  avgt    8   4.470 ±  0.011  ns/op
AllocationBenchmark.oneStepsequenceAllocationBenchmark          1000  avgt    8   4.548 ±  0.007  ns/op
AllocationBenchmark.oneStepsequenceAllocationBenchmark         10000  avgt    8   5.126 ±  0.013  ns/op
AllocationBenchmark.oneStepsequenceAllocationBenchmark        100000  avgt    8   1.063 ±  0.001  ns/op
AllocationBenchmark.oneStepsequenceAllocationBenchmark       1000000  avgt    8   0.916 ±  0.001  ns/op

AllocationBenchmark.oneStepstdlibAllocationBenchmark              10  avgt    8   4.813 ±  0.004  ns/op
AllocationBenchmark.oneStepstdlibAllocationBenchmark             100  avgt    8   4.549 ±  0.013  ns/op
AllocationBenchmark.oneStepstdlibAllocationBenchmark            1000  avgt    8   4.826 ±  0.095  ns/op
AllocationBenchmark.oneStepstdlibAllocationBenchmark           10000  avgt    8   4.545 ±  0.006  ns/op
AllocationBenchmark.oneStepstdlibAllocationBenchmark          100000  avgt    8   5.073 ±  0.003  ns/op
AllocationBenchmark.oneStepstdlibAllocationBenchmark         1000000  avgt    8   4.826 ±  0.007  ns/op

AllocationBenchmark.oneStepstreamAllocationBenchmark              10  avgt    8  16.787 ±  0.037  ns/op
AllocationBenchmark.oneStepstreamAllocationBenchmark             100  avgt    8  16.908 ±  0.080  ns/op
AllocationBenchmark.oneStepstreamAllocationBenchmark            1000  avgt    8  17.436 ±  0.060  ns/op
AllocationBenchmark.oneStepstreamAllocationBenchmark           10000  avgt    8  18.347 ±  0.028  ns/op
AllocationBenchmark.oneStepstreamAllocationBenchmark          100000  avgt    8  18.319 ±  0.038  ns/op
AllocationBenchmark.oneStepstreamAllocationBenchmark         1000000  avgt    8  18.326 ±  0.026  ns/op
# -----------------------------------------------------------------------------------------------------
AllocationBenchmark.shortCircuitsequenceAllocationBenchmark       10  avgt    8  18.598 ±  0.027  ns/op
AllocationBenchmark.shortCircuitsequenceAllocationBenchmark      100  avgt    8  18.895 ±  0.284  ns/op
AllocationBenchmark.shortCircuitsequenceAllocationBenchmark     1000  avgt    8  18.683 ±  0.029  ns/op
AllocationBenchmark.shortCircuitsequenceAllocationBenchmark    10000  avgt    8  18.555 ±  0.046  ns/op
AllocationBenchmark.shortCircuitsequenceAllocationBenchmark   100000  avgt    8  18.903 ±  0.137  ns/op
AllocationBenchmark.shortCircuitsequenceAllocationBenchmark  1000000  avgt    8  18.555 ±  0.025  ns/op

AllocationBenchmark.shortCircuitstdlibAllocationBenchmark         10  avgt    8   8.341 ±  0.019  ns/op
AllocationBenchmark.shortCircuitstdlibAllocationBenchmark        100  avgt    8   8.358 ±  0.021  ns/op
AllocationBenchmark.shortCircuitstdlibAllocationBenchmark       1000  avgt    8   8.079 ±  0.007  ns/op
AllocationBenchmark.shortCircuitstdlibAllocationBenchmark      10000  avgt    8   8.343 ±  0.021  ns/op
AllocationBenchmark.shortCircuitstdlibAllocationBenchmark     100000  avgt    8   8.090 ±  0.020  ns/op
AllocationBenchmark.shortCircuitstdlibAllocationBenchmark    1000000  avgt    8   8.341 ±  0.038  ns/op

AllocationBenchmark.shortCircuitstreamAllocationBenchmark         10  avgt    8  55.737 ±  0.086  ns/op
AllocationBenchmark.shortCircuitstreamAllocationBenchmark        100  avgt    8  55.326 ±  0.133  ns/op
AllocationBenchmark.shortCircuitstreamAllocationBenchmark       1000  avgt    8  55.252 ±  0.201  ns/op
AllocationBenchmark.shortCircuitstreamAllocationBenchmark      10000  avgt    8  54.866 ±  0.283  ns/op
AllocationBenchmark.shortCircuitstreamAllocationBenchmark     100000  avgt    8  55.192 ±  0.617  ns/op
AllocationBenchmark.shortCircuitstreamAllocationBenchmark    1000000  avgt    8  54.732 ±  0.065  ns/op
# -----------------------------------------------------------------------------------------------------
AllocationBenchmark.threeStepsequenceAllocationBenchmark          10  avgt    8  14.926 ±  0.018  ns/op
AllocationBenchmark.threeStepsequenceAllocationBenchmark         100  avgt    8  14.949 ±  0.006  ns/op
AllocationBenchmark.threeStepsequenceAllocationBenchmark        1000  avgt    8  17.587 ±  0.608  ns/op
AllocationBenchmark.threeStepsequenceAllocationBenchmark       10000  avgt    8  13.746 ±  0.053  ns/op
AllocationBenchmark.threeStepsequenceAllocationBenchmark      100000  avgt    8  13.539 ±  1.097  ns/op
AllocationBenchmark.threeStepsequenceAllocationBenchmark     1000000  avgt    8  13.338 ±  0.115  ns/op

AllocationBenchmark.threeStepstdlibAllocationBenchmark            10  avgt    8   7.802 ±  0.011  ns/op
AllocationBenchmark.threeStepstdlibAllocationBenchmark           100  avgt    8   8.088 ±  0.016  ns/op
AllocationBenchmark.threeStepstdlibAllocationBenchmark          1000  avgt    8   7.849 ±  0.024  ns/op
AllocationBenchmark.threeStepstdlibAllocationBenchmark         10000  avgt    8   8.088 ±  0.022  ns/op
AllocationBenchmark.threeStepstdlibAllocationBenchmark        100000  avgt    8   7.883 ±  0.038  ns/op
AllocationBenchmark.threeStepstdlibAllocationBenchmark       1000000  avgt    8   8.131 ±  0.019  ns/op

AllocationBenchmark.threeStepstreamAllocationBenchmark            10  avgt    8  41.267 ±  0.788  ns/op
AllocationBenchmark.threeStepstreamAllocationBenchmark           100  avgt    8  41.305 ±  0.623  ns/op
AllocationBenchmark.threeStepstreamAllocationBenchmark          1000  avgt    8  50.247 ±  0.237  ns/op
AllocationBenchmark.threeStepstreamAllocationBenchmark         10000  avgt    8  42.436 ±  0.263  ns/op
AllocationBenchmark.threeStepstreamAllocationBenchmark        100000  avgt    8  42.520 ±  2.138  ns/op
AllocationBenchmark.threeStepstreamAllocationBenchmark       1000000  avgt    8  42.488 ±  0.157  ns/op
# -----------------------------------------------------------------------------------------------------
AllocationBenchmark.twoStepsequenceAllocationBenchmark            10  avgt    8   8.940 ±  0.033  ns/op
AllocationBenchmark.twoStepsequenceAllocationBenchmark           100  avgt    8   8.751 ±  0.016  ns/op
AllocationBenchmark.twoStepsequenceAllocationBenchmark          1000  avgt    8   9.025 ±  0.030  ns/op
AllocationBenchmark.twoStepsequenceAllocationBenchmark         10000  avgt    8   8.719 ±  0.019  ns/op
AllocationBenchmark.twoStepsequenceAllocationBenchmark        100000  avgt    8  10.055 ±  0.059  ns/op
AllocationBenchmark.twoStepsequenceAllocationBenchmark       1000000  avgt    8   9.804 ±  0.065  ns/op

AllocationBenchmark.twoStepstdlibAllocationBenchmark              10  avgt    8   6.529 ±  0.050  ns/op
AllocationBenchmark.twoStepstdlibAllocationBenchmark             100  avgt    8   6.996 ±  0.043  ns/op
AllocationBenchmark.twoStepstdlibAllocationBenchmark            1000  avgt    8   6.739 ±  0.022  ns/op
AllocationBenchmark.twoStepstdlibAllocationBenchmark           10000  avgt    8   6.744 ±  0.036  ns/op
AllocationBenchmark.twoStepstdlibAllocationBenchmark          100000  avgt    8   6.728 ±  0.031  ns/op
AllocationBenchmark.twoStepstdlibAllocationBenchmark         1000000  avgt    8   6.488 ±  0.024  ns/op

AllocationBenchmark.twoStepstreamAllocationBenchmark              10  avgt    8  27.609 ±  0.188  ns/op
AllocationBenchmark.twoStepstreamAllocationBenchmark             100  avgt    8  27.019 ±  0.215  ns/op
AllocationBenchmark.twoStepstreamAllocationBenchmark            1000  avgt    8  33.414 ±  0.594  ns/op
AllocationBenchmark.twoStepstreamAllocationBenchmark           10000  avgt    8  34.953 ±  0.437  ns/op
AllocationBenchmark.twoStepstreamAllocationBenchmark          100000  avgt    8  35.907 ±  0.180  ns/op
AllocationBenchmark.twoStepstreamAllocationBenchmark         1000000  avgt    8  35.494 ±  0.346  ns/op
# -----------------------------------------------------------------------------------------------------
AllocationBenchmark.zeroStepsequenceAllocationBenchmark           10  avgt    8   1.092 ±  0.001  ns/op
AllocationBenchmark.zeroStepsequenceAllocationBenchmark          100  avgt    8   1.062 ±  0.001  ns/op
AllocationBenchmark.zeroStepsequenceAllocationBenchmark         1000  avgt    8   1.063 ±  0.003  ns/op
AllocationBenchmark.zeroStepsequenceAllocationBenchmark        10000  avgt    8   1.063 ±  0.001  ns/op
AllocationBenchmark.zeroStepsequenceAllocationBenchmark       100000  avgt    8   1.328 ±  0.001  ns/op
AllocationBenchmark.zeroStepsequenceAllocationBenchmark      1000000  avgt    8   1.327 ±  0.001  ns/op

AllocationBenchmark.zeroStepstdlibAllocationBenchmark             10  avgt    8   4.547 ±  0.002  ns/op
AllocationBenchmark.zeroStepstdlibAllocationBenchmark            100  avgt    8   4.813 ±  0.004  ns/op
AllocationBenchmark.zeroStepstdlibAllocationBenchmark           1000  avgt    8   5.342 ±  0.008  ns/op
AllocationBenchmark.zeroStepstdlibAllocationBenchmark          10000  avgt    8   5.342 ±  0.007  ns/op
AllocationBenchmark.zeroStepstdlibAllocationBenchmark         100000  avgt    8   5.342 ±  0.011  ns/op
AllocationBenchmark.zeroStepstdlibAllocationBenchmark        1000000  avgt    8   4.826 ±  0.014  ns/op

AllocationBenchmark.zeroStepstreamAllocationBenchmark             10  avgt    8  16.050 ±  0.046  ns/op
AllocationBenchmark.zeroStepstreamAllocationBenchmark            100  avgt    8  15.840 ±  0.033  ns/op
AllocationBenchmark.zeroStepstreamAllocationBenchmark           1000  avgt    8  19.148 ±  0.045  ns/op
AllocationBenchmark.zeroStepstreamAllocationBenchmark          10000  avgt    8  19.399 ±  0.046  ns/op
AllocationBenchmark.zeroStepstreamAllocationBenchmark         100000  avgt    8  19.928 ±  0.071  ns/op
AllocationBenchmark.zeroStepstreamAllocationBenchmark        1000000  avgt    8  16.988 ±  0.091  ns/op
# -----------------------------------------------------------------------------------------------------
````