# Stream allocation benchmark 

## Results

 Environment

````text
Fedora Linux 39 (Workstation Edition)
Intel® Core™ i7-4770K × 8
java 11.0.15-trava
````

````text
Benchmark                                        (n)  Mode  Cnt      Score        Error  Units
AllocationBenchmark.stdlibAllocationBenchmark     10    ss    8  50110.250 ± 260297.732  ns/op
AllocationBenchmark.stdlibAllocationBenchmark    100    ss    8  82276.625 ± 430459.192  ns/op
AllocationBenchmark.stdlibAllocationBenchmark   1000    ss    8  42425.375 ± 202908.258  ns/op
AllocationBenchmark.stdlibAllocationBenchmark  10000    ss    8  59598.625 ± 301949.663  ns/op

AllocationBenchmark.streamAllocationBenchmark     10    ss    8  25707.250 ±  25753.444  ns/op
AllocationBenchmark.streamAllocationBenchmark    100    ss    8  25976.875 ±  22759.163  ns/op
AllocationBenchmark.streamAllocationBenchmark   1000    ss    8  33520.750 ±  23673.220  ns/op
AllocationBenchmark.streamAllocationBenchmark  10000    ss    8  30468.875 ±  36984.278  ns/op
````

### One step

````text
Benchmark                                                   (n)  Mode  Cnt    Score    Error  Units

AllocationBenchmark.oneStepstdlibAllocationBenchmark         10  avgt    8    5.878 ±  0.375  ns/op
AllocationBenchmark.oneStepstdlibAllocationBenchmark        100  avgt    8    6.220 ±  0.466  ns/op
AllocationBenchmark.oneStepstdlibAllocationBenchmark       1000  avgt    8    6.980 ±  2.582  ns/op
AllocationBenchmark.oneStepstdlibAllocationBenchmark      10000  avgt    8    5.930 ±  1.714  ns/op
AllocationBenchmark.oneStepstdlibAllocationBenchmark     100000  avgt    8    5.703 ±  0.979  ns/op
AllocationBenchmark.oneStepstdlibAllocationBenchmark    1000000  avgt    8    6.200 ±  1.214  ns/op

AllocationBenchmark.oneStepstreamAllocationBenchmark         10  avgt    8   48.010 ±  5.983  ns/op
AllocationBenchmark.oneStepstreamAllocationBenchmark        100  avgt    8   50.860 ± 11.052  ns/op
AllocationBenchmark.oneStepstreamAllocationBenchmark       1000  avgt    8   50.297 ±  7.584  ns/op
AllocationBenchmark.oneStepstreamAllocationBenchmark      10000  avgt    8   56.785 ±  6.938  ns/op
AllocationBenchmark.oneStepstreamAllocationBenchmark     100000  avgt    8   53.480 ± 10.863  ns/op
AllocationBenchmark.oneStepstreamAllocationBenchmark    1000000  avgt    8   52.388 ±  6.955  ns/op
````

### Two steps

````text
Benchmark                                                   (n)  Mode  Cnt    Score    Error  Units

AllocationBenchmark.twoStepstdlibAllocationBenchmark         10  avgt    8    9.003 ±  1.171  ns/op
AllocationBenchmark.twoStepstdlibAllocationBenchmark        100  avgt    8    9.517 ±  0.750  ns/op
AllocationBenchmark.twoStepstdlibAllocationBenchmark       1000  avgt    8    8.986 ±  1.044  ns/op
AllocationBenchmark.twoStepstdlibAllocationBenchmark      10000  avgt    8    9.254 ±  0.631  ns/op
AllocationBenchmark.twoStepstdlibAllocationBenchmark     100000  avgt    8    8.868 ±  0.917  ns/op
AllocationBenchmark.twoStepstdlibAllocationBenchmark    1000000  avgt    8    9.197 ±  0.835  ns/op

AllocationBenchmark.twoStepstreamAllocationBenchmark         10  avgt    8   69.748 ±  5.834  ns/op
AllocationBenchmark.twoStepstreamAllocationBenchmark        100  avgt    8   72.393 ±  9.862  ns/op
AllocationBenchmark.twoStepstreamAllocationBenchmark       1000  avgt    8   73.731 ±  9.130  ns/op
AllocationBenchmark.twoStepstreamAllocationBenchmark      10000  avgt    8   74.247 ±  8.394  ns/op
AllocationBenchmark.twoStepstreamAllocationBenchmark     100000  avgt    8   73.677 ± 11.231  ns/op
AllocationBenchmark.twoStepstreamAllocationBenchmark    1000000  avgt    8   76.810 ±  5.125  ns/op
````


### Three steps

````text
Benchmark                                                   (n)  Mode  Cnt    Score    Error  Units

AllocationBenchmark.threeStepstdlibAllocationBenchmark       10  avgt    8   11.834 ±  1.531  ns/op
AllocationBenchmark.threeStepstdlibAllocationBenchmark      100  avgt    8   12.607 ±  1.450  ns/op
AllocationBenchmark.threeStepstdlibAllocationBenchmark     1000  avgt    8   13.596 ±  1.157  ns/op
AllocationBenchmark.threeStepstdlibAllocationBenchmark    10000  avgt    8   12.471 ±  1.861  ns/op
AllocationBenchmark.threeStepstdlibAllocationBenchmark   100000  avgt    8   12.327 ±  1.359  ns/op
AllocationBenchmark.threeStepstdlibAllocationBenchmark  1000000  avgt    8   12.534 ±  2.071  ns/op

AllocationBenchmark.threeStepstreamAllocationBenchmark       10  avgt    8   93.649 ±  9.808  ns/op
AllocationBenchmark.threeStepstreamAllocationBenchmark      100  avgt    8  101.722 ± 10.959  ns/op
AllocationBenchmark.threeStepstreamAllocationBenchmark     1000  avgt    8  100.889 ± 11.680  ns/op
AllocationBenchmark.threeStepstreamAllocationBenchmark    10000  avgt    8  103.034 ± 12.193  ns/op
AllocationBenchmark.threeStepstreamAllocationBenchmark   100000  avgt    8  100.552 ± 12.893  ns/op
AllocationBenchmark.threeStepstreamAllocationBenchmark  1000000  avgt    8   99.963 ± 11.646  ns/op
````