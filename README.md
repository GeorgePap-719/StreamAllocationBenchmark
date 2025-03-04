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
Benchmark                                                     (size)  Mode  Cnt   Score   Error  Units
# ----------------------------------------------------------------------------------------------------
AllocationBenchmark.oneStepsequenceAllocationBenchmark            10  avgt    8   1.960 ± 0.054  ns/op
AllocationBenchmark.oneStepsequenceAllocationBenchmark           100  avgt    8   1.983 ± 0.263  ns/op
AllocationBenchmark.oneStepsequenceAllocationBenchmark          1000  avgt    8   1.963 ± 0.151  ns/op
AllocationBenchmark.oneStepsequenceAllocationBenchmark         10000  avgt    8   1.979 ± 0.151  ns/op
AllocationBenchmark.oneStepsequenceAllocationBenchmark        100000  avgt    8   2.256 ± 0.161  ns/op
AllocationBenchmark.oneStepsequenceAllocationBenchmark       1000000  avgt    8   2.416 ± 0.371  ns/op

AllocationBenchmark.oneStepstdlibAllocationBenchmark              10  avgt    8   5.370 ± 0.063  ns/op
AllocationBenchmark.oneStepstdlibAllocationBenchmark             100  avgt    8   5.387 ± 0.193  ns/op
AllocationBenchmark.oneStepstdlibAllocationBenchmark            1000  avgt    8   5.355 ± 0.040  ns/op
AllocationBenchmark.oneStepstdlibAllocationBenchmark           10000  avgt    8   5.401 ± 0.204  ns/op
AllocationBenchmark.oneStepstdlibAllocationBenchmark          100000  avgt    8   5.364 ± 0.072  ns/op
AllocationBenchmark.oneStepstdlibAllocationBenchmark         1000000  avgt    8   5.394 ± 0.213  ns/op

AllocationBenchmark.oneStepstreamAllocationBenchmark              10  avgt    8  17.408 ± 1.014  ns/op
AllocationBenchmark.oneStepstreamAllocationBenchmark             100  avgt    8  17.385 ± 0.810  ns/op
AllocationBenchmark.oneStepstreamAllocationBenchmark            1000  avgt    8  17.366 ± 0.981  ns/op
AllocationBenchmark.oneStepstreamAllocationBenchmark           10000  avgt    8  17.646 ± 1.422  ns/op
AllocationBenchmark.oneStepstreamAllocationBenchmark          100000  avgt    8  17.783 ± 1.522  ns/op
AllocationBenchmark.oneStepstreamAllocationBenchmark         1000000  avgt    8  17.708 ± 0.676  ns/op
# ----------------------------------------------------------------------------------------------------
AllocationBenchmark.shortCircuitsequenceAllocationBenchmark       10  avgt    8  17.380 ± 0.325  ns/op
AllocationBenchmark.shortCircuitsequenceAllocationBenchmark      100  avgt    8  20.063 ± 7.405  ns/op
AllocationBenchmark.shortCircuitsequenceAllocationBenchmark     1000  avgt    8  19.191 ± 0.209  ns/op
AllocationBenchmark.shortCircuitsequenceAllocationBenchmark    10000  avgt    8  19.232 ± 0.233  ns/op
AllocationBenchmark.shortCircuitsequenceAllocationBenchmark   100000  avgt    8  19.172 ± 0.235  ns/op
AllocationBenchmark.shortCircuitsequenceAllocationBenchmark  1000000  avgt    8  18.883 ± 1.507  ns/op

AllocationBenchmark.shortCircuitstdlibAllocationBenchmark         10  avgt    8   7.660 ± 1.076  ns/op
AllocationBenchmark.shortCircuitstdlibAllocationBenchmark        100  avgt    8   7.719 ± 0.202  ns/op
AllocationBenchmark.shortCircuitstdlibAllocationBenchmark       1000  avgt    8   7.516 ± 0.702  ns/op
AllocationBenchmark.shortCircuitstdlibAllocationBenchmark      10000  avgt    8   7.729 ± 0.277  ns/op
AllocationBenchmark.shortCircuitstdlibAllocationBenchmark     100000  avgt    8   7.443 ± 0.445  ns/op
AllocationBenchmark.shortCircuitstdlibAllocationBenchmark    1000000  avgt    8   7.780 ± 0.216  ns/op

AllocationBenchmark.shortCircuitstreamAllocationBenchmark         10  avgt    8  52.430 ± 1.708  ns/op
AllocationBenchmark.shortCircuitstreamAllocationBenchmark        100  avgt    8  52.918 ± 1.550  ns/op
AllocationBenchmark.shortCircuitstreamAllocationBenchmark       1000  avgt    8  52.731 ± 1.882  ns/op
AllocationBenchmark.shortCircuitstreamAllocationBenchmark      10000  avgt    8  52.766 ± 3.731  ns/op
AllocationBenchmark.shortCircuitstreamAllocationBenchmark     100000  avgt    8  52.141 ± 1.881  ns/op
AllocationBenchmark.shortCircuitstreamAllocationBenchmark    1000000  avgt    8  52.043 ± 1.959  ns/op
# ----------------------------------------------------------------------------------------------------
AllocationBenchmark.threeStepsequenceAllocationBenchmark          10  avgt    8  16.082 ± 6.956  ns/op
AllocationBenchmark.threeStepsequenceAllocationBenchmark         100  avgt    8  14.971 ± 1.651  ns/op
AllocationBenchmark.threeStepsequenceAllocationBenchmark        1000  avgt    8  13.301 ± 1.644  ns/op
AllocationBenchmark.threeStepsequenceAllocationBenchmark       10000  avgt    8  15.428 ± 4.053  ns/op
AllocationBenchmark.threeStepsequenceAllocationBenchmark      100000  avgt    8  17.848 ± 1.759  ns/op
AllocationBenchmark.threeStepsequenceAllocationBenchmark     1000000  avgt    8  17.502 ± 2.886  ns/op

AllocationBenchmark.threeStepstdlibAllocationBenchmark            10  avgt    8   8.604 ± 0.760  ns/op
AllocationBenchmark.threeStepstdlibAllocationBenchmark           100  avgt    8   8.729 ± 0.266  ns/op
AllocationBenchmark.threeStepstdlibAllocationBenchmark          1000  avgt    8   8.505 ± 0.435  ns/op
AllocationBenchmark.threeStepstdlibAllocationBenchmark         10000  avgt    8   8.289 ± 0.477  ns/op
AllocationBenchmark.threeStepstdlibAllocationBenchmark        100000  avgt    8   8.579 ± 0.692  ns/op
AllocationBenchmark.threeStepstdlibAllocationBenchmark       1000000  avgt    8   8.450 ± 0.422  ns/op

AllocationBenchmark.threeStepstreamAllocationBenchmark            10  avgt    8  42.238 ± 1.063  ns/op
AllocationBenchmark.threeStepstreamAllocationBenchmark           100  avgt    8  40.466 ± 1.609  ns/op
AllocationBenchmark.threeStepstreamAllocationBenchmark          1000  avgt    8  50.265 ± 3.779  ns/op
AllocationBenchmark.threeStepstreamAllocationBenchmark         10000  avgt    8  49.970 ± 0.778  ns/op
AllocationBenchmark.threeStepstreamAllocationBenchmark        100000  avgt    8  42.501 ± 1.399  ns/op
AllocationBenchmark.threeStepstreamAllocationBenchmark       1000000  avgt    8  44.869 ± 6.616  ns/op
# ----------------------------------------------------------------------------------------------------
AllocationBenchmark.twoStepsequenceAllocationBenchmark            10  avgt    8   7.676 ± 0.381  ns/op
AllocationBenchmark.twoStepsequenceAllocationBenchmark           100  avgt    8   7.827 ± 0.057  ns/op
AllocationBenchmark.twoStepsequenceAllocationBenchmark          1000  avgt    8   7.727 ± 0.128  ns/op
AllocationBenchmark.twoStepsequenceAllocationBenchmark         10000  avgt    8   7.410 ± 0.153  ns/op
AllocationBenchmark.twoStepsequenceAllocationBenchmark        100000  avgt    8   7.600 ± 0.263  ns/op
AllocationBenchmark.twoStepsequenceAllocationBenchmark       1000000  avgt    8   7.500 ± 0.156  ns/op

AllocationBenchmark.twoStepstdlibAllocationBenchmark              10  avgt    8   7.401 ± 0.249  ns/op
AllocationBenchmark.twoStepstdlibAllocationBenchmark             100  avgt    8   7.407 ± 0.309  ns/op
AllocationBenchmark.twoStepstdlibAllocationBenchmark            1000  avgt    8   7.593 ± 0.468  ns/op
AllocationBenchmark.twoStepstdlibAllocationBenchmark           10000  avgt    8   7.449 ± 0.554  ns/op
AllocationBenchmark.twoStepstdlibAllocationBenchmark          100000  avgt    8   7.466 ± 0.787  ns/op
AllocationBenchmark.twoStepstdlibAllocationBenchmark         1000000  avgt    8   7.633 ± 0.107  ns/op

AllocationBenchmark.twoStepstreamAllocationBenchmark              10  avgt    8  30.161 ± 2.642  ns/op
AllocationBenchmark.twoStepstreamAllocationBenchmark             100  avgt    8  30.618 ± 1.142  ns/op
AllocationBenchmark.twoStepstreamAllocationBenchmark            1000  avgt    8  30.526 ± 3.462  ns/op
AllocationBenchmark.twoStepstreamAllocationBenchmark           10000  avgt    8  29.932 ± 1.492  ns/op
AllocationBenchmark.twoStepstreamAllocationBenchmark          100000  avgt    8  29.801 ± 1.524  ns/op
AllocationBenchmark.twoStepstreamAllocationBenchmark         1000000  avgt    8  29.741 ± 1.280  ns/op
# ----------------------------------------------------------------------------------------------------
AllocationBenchmark.zeroStepsequenceAllocationBenchmark           10  avgt    8   0.819 ± 0.118  ns/op
AllocationBenchmark.zeroStepsequenceAllocationBenchmark          100  avgt    8   0.837 ± 0.187  ns/op
AllocationBenchmark.zeroStepsequenceAllocationBenchmark         1000  avgt    8   0.869 ± 0.082  ns/op
AllocationBenchmark.zeroStepsequenceAllocationBenchmark        10000  avgt    8   1.029 ± 0.621  ns/op
AllocationBenchmark.zeroStepsequenceAllocationBenchmark       100000  avgt    8   0.875 ± 0.086  ns/op
AllocationBenchmark.zeroStepsequenceAllocationBenchmark      1000000  avgt    8   0.819 ± 0.116  ns/op

AllocationBenchmark.zeroStepstdlibAllocationBenchmark             10  avgt    8   4.465 ± 0.584  ns/op
AllocationBenchmark.zeroStepstdlibAllocationBenchmark            100  avgt    8   4.382 ± 0.427  ns/op
AllocationBenchmark.zeroStepstdlibAllocationBenchmark           1000  avgt    8   4.633 ± 0.439  ns/op
AllocationBenchmark.zeroStepstdlibAllocationBenchmark          10000  avgt    8   4.595 ± 0.250  ns/op
AllocationBenchmark.zeroStepstdlibAllocationBenchmark         100000  avgt    8   4.589 ± 0.240  ns/op
AllocationBenchmark.zeroStepstdlibAllocationBenchmark        1000000  avgt    8   4.645 ± 0.392  ns/op

AllocationBenchmark.zeroStepstreamAllocationBenchmark             10  avgt    8  21.667 ± 3.536  ns/op
AllocationBenchmark.zeroStepstreamAllocationBenchmark            100  avgt    8  21.894 ± 4.741  ns/op
AllocationBenchmark.zeroStepstreamAllocationBenchmark           1000  avgt    8  21.293 ± 4.026  ns/op
AllocationBenchmark.zeroStepstreamAllocationBenchmark          10000  avgt    8  21.474 ± 4.148  ns/op
AllocationBenchmark.zeroStepstreamAllocationBenchmark         100000  avgt    8  21.694 ± 5.114  ns/op
AllocationBenchmark.zeroStepstreamAllocationBenchmark        1000000  avgt    8  21.531 ± 4.606  ns/op
````