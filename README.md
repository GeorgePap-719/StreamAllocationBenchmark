# Stream benchmark 

Benchmarking the stream API vs simple transformations vs sequence API 

Another interesting metric would be to count the actual allocations.

## Results
Environment

````text
Macbook Air 
m3 8-core
java Corretto-17.0.14.7.1
````

````text
Benchmark                                                        (n)  Mode  Cnt         Score         Error  Units
# ----------------------------------------------------------------------------------------------------------------
AllocationBenchmark.oneStepsequenceAllocationBenchmark            10  avgt    8        35.564 ±       0.425  ns/op
AllocationBenchmark.oneStepsequenceAllocationBenchmark           100  avgt    8       336.163 ±       1.842  ns/op
AllocationBenchmark.oneStepsequenceAllocationBenchmark          1000  avgt    8      3337.885 ±      33.876  ns/op
AllocationBenchmark.oneStepsequenceAllocationBenchmark         10000  avgt    8     51397.907 ±    1536.607  ns/op
AllocationBenchmark.oneStepsequenceAllocationBenchmark        100000  avgt    8    373014.763 ±   11980.450  ns/op
AllocationBenchmark.oneStepsequenceAllocationBenchmark       1000000  avgt    8  13493811.052 ± 2607446.347  ns/op

AllocationBenchmark.oneStepstdlibAllocationBenchmark              10  avgt    8        25.986 ±       0.173  ns/op
AllocationBenchmark.oneStepstdlibAllocationBenchmark             100  avgt    8       255.223 ±       2.623  ns/op
AllocationBenchmark.oneStepstdlibAllocationBenchmark            1000  avgt    8      3640.813 ±      52.185  ns/op
AllocationBenchmark.oneStepstdlibAllocationBenchmark           10000  avgt    8     35073.120 ±     309.840  ns/op
AllocationBenchmark.oneStepstdlibAllocationBenchmark          100000  avgt    8    350184.090 ±    1379.069  ns/op
AllocationBenchmark.oneStepstdlibAllocationBenchmark         1000000  avgt    8   8706848.945 ± 1394347.027  ns/op

AllocationBenchmark.oneStepstreamAllocationBenchmark              10  avgt    8        55.599 ±       4.919  ns/op
AllocationBenchmark.oneStepstreamAllocationBenchmark             100  avgt    8       328.305 ±       2.626  ns/op
AllocationBenchmark.oneStepstreamAllocationBenchmark            1000  avgt    8      4445.158 ±     108.520  ns/op
AllocationBenchmark.oneStepstreamAllocationBenchmark           10000  avgt    8     30277.209 ±     122.629  ns/op
AllocationBenchmark.oneStepstreamAllocationBenchmark          100000  avgt    8    292653.300 ±    1799.509  ns/op
AllocationBenchmark.oneStepstreamAllocationBenchmark         1000000  avgt    8   8350151.318 ±  159278.330  ns/op
# ----------------------------------------------------------------------------------------------------------------
AllocationBenchmark.shortCircuitsequenceAllocationBenchmark       10  avgt    8        24.496 ±       0.262  ns/op
AllocationBenchmark.shortCircuitsequenceAllocationBenchmark      100  avgt    8        24.802 ±       1.810  ns/op
AllocationBenchmark.shortCircuitsequenceAllocationBenchmark     1000  avgt    8        24.681 ±       0.913  ns/op
AllocationBenchmark.shortCircuitsequenceAllocationBenchmark    10000  avgt    8        24.522 ±       0.281  ns/op
AllocationBenchmark.shortCircuitsequenceAllocationBenchmark   100000  avgt    8        49.696 ±      47.152  ns/op
AllocationBenchmark.shortCircuitsequenceAllocationBenchmark  1000000  avgt    8        26.260 ±       1.479  ns/op

AllocationBenchmark.shortCircuitstdlibAllocationBenchmark         10  avgt    8       135.546 ±       1.486  ns/op
AllocationBenchmark.shortCircuitstdlibAllocationBenchmark        100  avgt    8      1183.878 ±       5.849  ns/op
AllocationBenchmark.shortCircuitstdlibAllocationBenchmark       1000  avgt    8     12986.000 ±     193.440  ns/op
AllocationBenchmark.shortCircuitstdlibAllocationBenchmark      10000  avgt    8    123722.954 ±    3100.829  ns/op
AllocationBenchmark.shortCircuitstdlibAllocationBenchmark     100000  avgt    8    812981.179 ±    5847.577  ns/op
AllocationBenchmark.shortCircuitstdlibAllocationBenchmark    1000000  avgt    8  26292766.770 ± 3117363.595  ns/op

AllocationBenchmark.shortCircuitstreamAllocationBenchmark         10  avgt    8        78.300 ±       1.488  ns/op
AllocationBenchmark.shortCircuitstreamAllocationBenchmark        100  avgt    8        76.444 ±       1.602  ns/op
AllocationBenchmark.shortCircuitstreamAllocationBenchmark       1000  avgt    8        77.689 ±       0.909  ns/op
AllocationBenchmark.shortCircuitstreamAllocationBenchmark      10000  avgt    8        76.991 ±       0.890  ns/op
AllocationBenchmark.shortCircuitstreamAllocationBenchmark     100000  avgt    8        77.618 ±       0.983  ns/op
AllocationBenchmark.shortCircuitstreamAllocationBenchmark    1000000  avgt    8        79.131 ±       1.848  ns/op
# ----------------------------------------------------------------------------------------------------------------
AllocationBenchmark.threeStepsequenceAllocationBenchmark          10  avgt    8       128.946 ±       0.995  ns/op
AllocationBenchmark.threeStepsequenceAllocationBenchmark         100  avgt    8      1120.063 ±       2.703  ns/op
AllocationBenchmark.threeStepsequenceAllocationBenchmark        1000  avgt    8     10539.122 ±      32.191  ns/op
AllocationBenchmark.threeStepsequenceAllocationBenchmark       10000  avgt    8    127404.240 ±     447.360  ns/op
AllocationBenchmark.threeStepsequenceAllocationBenchmark      100000  avgt    8   1162178.429 ±   13299.450  ns/op
AllocationBenchmark.threeStepsequenceAllocationBenchmark     1000000  avgt    8  24644681.727 ± 6514525.606  ns/op

AllocationBenchmark.threeStepstdlibAllocationBenchmark            10  avgt    8       130.224 ±       1.325  ns/op
AllocationBenchmark.threeStepstdlibAllocationBenchmark           100  avgt    8      1194.343 ±       9.273  ns/op
AllocationBenchmark.threeStepstdlibAllocationBenchmark          1000  avgt    8     13689.874 ±     286.922  ns/op
AllocationBenchmark.threeStepstdlibAllocationBenchmark         10000  avgt    8    124956.748 ±     411.002  ns/op
AllocationBenchmark.threeStepstdlibAllocationBenchmark        100000  avgt    8    806182.512 ±    7469.647  ns/op
AllocationBenchmark.threeStepstdlibAllocationBenchmark       1000000  avgt    8  26879265.684 ± 3730277.024  ns/op

AllocationBenchmark.threeStepstreamAllocationBenchmark            10  avgt    8       161.720 ±      12.564  ns/op
AllocationBenchmark.threeStepstreamAllocationBenchmark           100  avgt    8      1212.878 ±     115.377  ns/op
AllocationBenchmark.threeStepstreamAllocationBenchmark          1000  avgt    8     20493.485 ±    6933.508  ns/op
AllocationBenchmark.threeStepstreamAllocationBenchmark         10000  avgt    8     97847.965 ±    9541.886  ns/op
AllocationBenchmark.threeStepstreamAllocationBenchmark        100000  avgt    8   1004255.675 ±    9042.739  ns/op
AllocationBenchmark.threeStepstreamAllocationBenchmark       1000000  avgt    8  18402976.694 ± 3258385.072  ns/op
# ----------------------------------------------------------------------------------------------------------------
AllocationBenchmark.twoStepsequenceAllocationBenchmark            10  avgt    8       106.175 ±       1.124  ns/op
AllocationBenchmark.twoStepsequenceAllocationBenchmark           100  avgt    8       802.366 ±       0.648  ns/op
AllocationBenchmark.twoStepsequenceAllocationBenchmark          1000  avgt    8      7720.794 ±      17.232  ns/op
AllocationBenchmark.twoStepsequenceAllocationBenchmark         10000  avgt    8     80111.508 ±     220.645  ns/op
AllocationBenchmark.twoStepsequenceAllocationBenchmark        100000  avgt    8    686936.341 ±    1545.384  ns/op
AllocationBenchmark.twoStepsequenceAllocationBenchmark       1000000  avgt    8  19010913.939 ± 2788906.124  ns/op

AllocationBenchmark.twoStepstdlibAllocationBenchmark              10  avgt    8        68.188 ±       1.154  ns/op
AllocationBenchmark.twoStepstdlibAllocationBenchmark             100  avgt    8       648.993 ±       3.366  ns/op
AllocationBenchmark.twoStepstdlibAllocationBenchmark            1000  avgt    8      7360.921 ±      46.905  ns/op
AllocationBenchmark.twoStepstdlibAllocationBenchmark           10000  avgt    8     75486.408 ±     738.558  ns/op
AllocationBenchmark.twoStepstdlibAllocationBenchmark          100000  avgt    8    550855.989 ±    8536.930  ns/op
AllocationBenchmark.twoStepstdlibAllocationBenchmark         1000000  avgt    8  18699633.035 ± 3551984.291  ns/op

AllocationBenchmark.twoStepstreamAllocationBenchmark              10  avgt    8       127.660 ±       0.372  ns/op
AllocationBenchmark.twoStepstreamAllocationBenchmark             100  avgt    8       922.852 ±       6.044  ns/op
AllocationBenchmark.twoStepstreamAllocationBenchmark            1000  avgt    8      6136.717 ±       7.546  ns/op
AllocationBenchmark.twoStepstreamAllocationBenchmark           10000  avgt    8     56896.079 ±     240.535  ns/op
AllocationBenchmark.twoStepstreamAllocationBenchmark          100000  avgt    8    590251.837 ±    5646.961  ns/op
AllocationBenchmark.twoStepstreamAllocationBenchmark         1000000  avgt    8  13037335.467 ± 1317001.427  ns/op
# ----------------------------------------------------------------------------------------------------------------
AllocationBenchmark.zeroStepsequenceAllocationBenchmark           10  avgt    8         7.199 ±       0.008  ns/op
AllocationBenchmark.zeroStepsequenceAllocationBenchmark          100  avgt    8        43.362 ±       0.133  ns/op
AllocationBenchmark.zeroStepsequenceAllocationBenchmark         1000  avgt    8       415.843 ±       0.709  ns/op
AllocationBenchmark.zeroStepsequenceAllocationBenchmark        10000  avgt    8      4663.008 ±     207.971  ns/op
AllocationBenchmark.zeroStepsequenceAllocationBenchmark       100000  avgt    8     43641.318 ±    1897.395  ns/op
AllocationBenchmark.zeroStepsequenceAllocationBenchmark      1000000  avgt    8    432464.490 ±   11436.331  ns/op

AllocationBenchmark.zeroStepstdlibAllocationBenchmark             10  avgt    8        48.541 ±       0.329  ns/op
AllocationBenchmark.zeroStepstdlibAllocationBenchmark            100  avgt    8       432.642 ±       5.197  ns/op
AllocationBenchmark.zeroStepstdlibAllocationBenchmark           1000  avgt    8      4478.554 ±      56.738  ns/op
AllocationBenchmark.zeroStepstdlibAllocationBenchmark          10000  avgt    8     49055.069 ±     386.530  ns/op
AllocationBenchmark.zeroStepstdlibAllocationBenchmark         100000  avgt    8    409109.860 ±  199773.584  ns/op
AllocationBenchmark.zeroStepstdlibAllocationBenchmark        1000000  avgt    8   9489576.058 ± 1131504.254  ns/op

AllocationBenchmark.zeroStepstreamAllocationBenchmark             10  avgt    8        48.446 ±       0.108  ns/op
AllocationBenchmark.zeroStepstreamAllocationBenchmark            100  avgt    8       314.808 ±       0.313  ns/op
AllocationBenchmark.zeroStepstreamAllocationBenchmark           1000  avgt    8      2915.247 ±       5.853  ns/op
AllocationBenchmark.zeroStepstreamAllocationBenchmark          10000  avgt    8     28611.017 ±      22.825  ns/op
AllocationBenchmark.zeroStepstreamAllocationBenchmark         100000  avgt    8    268562.999 ±     253.378  ns/op
AllocationBenchmark.zeroStepstreamAllocationBenchmark        1000000  avgt    8   2740537.575 ± 2594515.021  ns/op
# ----------------------------------------------------------------------------------------------------------------
````