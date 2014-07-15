
### Homework Week 1 Text Questions
Monica Quaintance



1. Weiss, Exercise 2.1
>>>Order the following functions by growth rate: N, √N, N^1.5, N^2, NlogN,
>>> Nloglog N, N log^2 N, N log(N2), 2/N, 2^N, 2^(N/2), 37, N^2 log N, N^3.
>>> Indicate which functions grow at the same rate.

2/N, 37, √N, N, NloglogN, NlogN, Nlog(N^2), N log^2 N, N^1.5, N^2, N^2 logN,
N^3, 2^(N/2), 2^N.

growth(Nlog(N^2)) = growth(NlogN)


2. Weiss, Exercise 2.6
>>>In a recent court case, a judge cited a city for contempt and ordered a
>>> fine of $2 for the first day. Each subsequent day, until the city 
>>>followed the judge’s order, the fine was squared (that is, the fine 
>>>progressed as follows: $2, $4, $16, $256, $65, 536, . . .).
>>>a. What would be the fine on day N?

2^(N)

>>>b. How many days would it take the fine to reach D dollars? 
>>>(A Big-Oh answer will do.)

2^(N) = D
N = log(D)
log(D) days


3. Weiss, Exercise 2.7 - note that part b of this problem is actually 
  part of the programming assignment. Place your answers to part a, 
  and part c in the written solutions.

>>> For each of the following six program fragments:
>>> a. Give an analysis of the running time (Big-Oh will do).

(1) N
(2) 
(3)
(4)
(5)
(6)


>>> b. Implement the code in Java, and give the running time for several 
>>> values of N. 

(1) N = 500, time is 0.0
  N = 1000, time is 0.0
  N = 5000, time is 0.0
  N = 10000, time is 0.0

(2) N = 500, time is 0.003
  N = 1000, time is 0.0
  N = 5000, time is 0.0
  N = 10000, time is 0.001

(3) N = 500, time is 0.004
  N = 1000, time is 0.0
  N = 5000, time is 0.0
  N = 10000, time is 0.0

(4) N = 500, time is 0.004
  N = 1000, time is 0.0
  N = 5000, time is 0.0
  N = 10000, time is 0.0

(5) N = 500, time is 0.115
  N = 1000, time is 0.932
  N = 5000, time is 31.282
  N = 10000, time is 235.27

(6) N = 500, time is 0.135
  N = 1000, time is 1.05
  N = 5000, time is 135.148
  N = 10000, time is 1090.551


>>>c. Compare your analysis with the actual running times.



4. Weiss, Exercise 2.10 (part a)
>>> Determine, for the typical algorithms that you use to perform calculations
>>> by hand, the running time to do the following:
>>> a. Add two N-digit integers.




5. Weiss, Exercise 2.11

>>> An algorithm takes 0.5 ms for input size 100. How long will it take 
>>> for input size 500 if the running time is the following (assume low-order
>>> terms are negligible): 
>>> a. linear


>>> b. O(NlogN)



>>> c. quadratic 


>>> d. cubic



6. Weiss, Exercise 2.15 
>>> Give an efficient algorithm to determine if there exists an integer
>>> i such that Ai = i in an array of integers A1 < A2 < A3 <···< AN.
>>> What is the running time of your algorithm?



