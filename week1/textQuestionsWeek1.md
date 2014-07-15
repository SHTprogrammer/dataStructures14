
### Homework Week 1 Text Questions
Monica Quaintance
mjq2102@columbia.edu



>>>1. Weiss, Exercise 2.1

>>>Order the following functions by growth rate: N, √N, N^1.5, N^2, NlogN,
>>> Nloglog N, N log^2 N, N log(N2), 2/N, 2^N, 2^(N/2), 37, N^2 log N, N^3.
>>> Indicate which functions grow at the same rate.

2/N, 37, √N, N, NloglogN, NlogN, Nlog(N^2), N log^2 N, N^1.5, N^2, N^2 logN,
N^3, 2^(N/2), 2^N.

growth(Nlog(N^2)) = growth(NlogN)


>>>2. Weiss, Exercise 2.6

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


>>>3. Weiss, Exercise 2.7 - note that part b of this problem is actually 
>>>part of the programming assignment. Place your answers to part a, 
>>>and part c in the written solutions.

>>> For each of the following six program fragments:
>>> a. Give an analysis of the running time (Big-Oh will do).

1. O(N)

2. O(N) * O(N) = O(N^2)

3. O(N) * O(N^2) = O(N^3)

4. O(N) * O(N) = O(N^2)

5. O(N) * O(N^2) * O(N^2) = O(N^5)

6. O(N) * O(N^2) * O(N) = O(N^4)


>>> b. Implement the code in Java, and give the running time for several 
>>> values of N. 

1. N = 500, time is 0.0

  N = 1000, time is 0.0

  N = 5000, time is 0.0

  N = 10000, time is 0.0


2. N = 500, time is 0.003

  N = 1000, time is 0.0

  N = 5000, time is 0.0

  N = 10000, time is 0.001

3. N = 500, time is 0.004

  N = 1000, time is 0.0

  N = 5000, time is 0.0

  N = 10000, time is 0.0

4. N = 500, time is 0.004

  N = 1000, time is 0.0

  N = 5000, time is 0.0

  N = 10000, time is 0.0

5. N = 500, time is 0.115

  N = 1000, time is 0.932

  N = 5000, time is 31.282

  N = 10000, time is 235.27

6. N = 500, time is 0.135

  N = 1000, time is 1.05

  N = 5000, time is 135.148

  N = 10000, time is 1090.551


>>>c. Compare your analysis with the actual running times.

Everything below N^4 runs too quickly to judge. I would expect 5 to be slower 
than 6, but my computer could have been trying to run something else at 
the same time which is why I got odd results. In a real test situation 
I would use a dedicated machine. 5 and 6 did underperform quite 
drastically compared to the others, which mirrors their abysmal growth
rates.


>>>4. Weiss, Exercise 2.10 (part a)

>>> Determine, for the typical algorithms that you use to perform calculations
>>> by hand, the running time to do the following:
>>> a. Add two N-digit integers.

Given case, adding d and e:

d = 9999
e = 99

* Add digits d.last, e.last
* Carry 1
* Add digits d.last-1, e.last-1,1
* Carry 1
* Add 1 and d.last - 2

Perform operations for (d.length - e.length) + carry term

Operation is O(n) 


>>>5. Weiss, Exercise 2.11

>>> An algorithm takes 0.5 ms for input size 100. How long will it take 
>>> for input size 500 if the running time is the following (assume low-order
>>> terms are negligible): 
>>> a. linear

T/0.5 = 500/100, T = 2.5

>>> b. O(NlogN)

T/0.5 = 500log(500)/100log(100), T = 3.374

>>> c. quadratic 

T/0.5 = 500^2/100^2, T = 12.5

>>> d. cubic

T/0.5 = 500^3/100^3, T = 62.5


>>>6. Weiss, Exercise 2.15 

>>> Give an efficient algorithm to determine if there exists an integer
>>> i such that Ai = i in an array of integers A1 < A2 < A3 <···< AN.
>>> What is the running time of your algorithm?

Since A(N-1) < A(N), A(N) cannot be a duplicate of A(N). The series of A cannot decrease or be constant, it can only increase. The increase of the index is always perfectly linear (i++), while the slowest that the terms of the array can increase is also perfectly linear. Therefore, for all A(i), either A(i) > i or A(i) = i. 

Also, it follows that if A(N-1) > (N-1), then A(N) > N. A(N) cannot decrease or be = A(N-1), so A(N) >= A(N-1) + 1; Since (N-1) + 1 = N, (A(N-1)+1)/((N-1)+1) <= A(N) / N . By the reverse, if A(N) < N, then A(N-1) < (N-1) as well.

Therefore, if we find a number that is bigger than its index, no terms following that term can be a success, and if we find a number smaller than its index no terms preceeding that term can be a success.

We can use an implementation like binary search for this--check the first element, if it is greater than its index then quit, otherwise check the middle of the array. If it is less than its index, check the right side of the array, if it is greater, the left. Continue until you have found a success or have run out of array.

The runtime for this algorithm is O(logN).

    left = 0, right = a.length

    if (a[0] > 1)
        return -1;

    while( left <= right ) {

        int mid = (left + right)/2;

        if a[mid] = mid + 1
            return (mid+1);

        else if (a[mid] > (mid+1))
            right = mid - 1;

        else (a[mid] < (mid+1))
            left = mid + 1;
      }
      return -1;

