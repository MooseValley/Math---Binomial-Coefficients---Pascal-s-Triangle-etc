# Math - Binomial Coefficients - Pascal's Triangle, etc

## Binomial Coefficients:
<pre>
(x-1)^2 	= x^2 - 2x + 1
(x-1)^3 	= x^3 - 3x^2 + 3x + 3
(x-1)^4 	= (x-1)(x-1)(x-1)(x-1)
			= (x^2 - 2x + 1)(x^2 - 2x + 1)
			= x^4 - 2x^3 + x^2 - 2x^3 + 4x^2 - 2x + x^2 - 2x + 1
			= x^4 - 4x^3 + 6x^2 - 4x + 1
(x-1)^5 	= x^5 - 5x^4 + 10x^3 - 10x^2 + 5x - 1
(x-1)^6	= x^6 - 6x^5 + 15x^4 - 20x^3 + 15x^2 - 6x + 1
(x-1)^7	= x^7 - 7x^6 + 21x^5 - 35x^4 + 35x^3 - 21x^2 + 7x - 1
:::
</pre>


## Pascal's Triangle:

<pre>
0									1
1								1		1
2							1		2		1
3						1		3		3		1
4					1		4		6		4		1
5				1		5		10		10		5		1
6			1		6		15		20		15		6		1
7		1		7		21		35		35		21		7		1
8	1		8		28		56		70		56		28		8		1
</pre>

* for (x+1)^8 - read off the coefficients above
* for (x-1)^8 - read off the coefficients above, but toggle +/- as you go item


## Binomial coefficient - shortcut using factorials

(nk) = x^k = n! / k!(n-k)!

Consider
	(x+1)^4

* 1st term, k = 0, n = 4
=> coefficient for x^4 = 4! / 0!4! = 1

* 2nd term, k = 1, n = 4
=> coefficient for x^3 = 4! / 1!3! = 4

* 3rd term, k = 2, n = 4
=> coefficient for x^2 = 4! / 2!2! = 6

* 4th term, k = 3, n = 4
=> coefficient for x^1 = 4! / 3!1! = 4

* 5th term, k = 4, n = 4
=> coefficient for x^1 = 4! / 4!0! = 1


## Sample Output: BinomialCoefficientsGenerator.java

Binomial Coefficients for: (x+1)^1: 1, 1,
<br>Binomial Coefficients for: (x+1)^2: 1, 2, 1,
<br>Binomial Coefficients for: (x+1)^3: 1, 3, 3, 1,
<br>Binomial Coefficients for: (x+1)^4: 1, 4, 6, 4, 1,
<br>Binomial Coefficients for: (x+1)^5: 1, 5, 10, 10, 5, 1,
<br>Binomial Coefficients for: (x+1)^6: 1, 6, 15, 20, 15, 6, 1,
<br>Binomial Coefficients for: (x+1)^7: 1, 7, 21, 35, 35, 21, 7, 1,
<br>Binomial Coefficients for: (x+1)^8: 1, 8, 28, 56, 70, 56, 28, 8, 1,


## References / further reading:
* https://en.wikipedia.org/wiki/Binomial_coefficient
* https://en.wikipedia.org/wiki/Pascal%27s_triangle

## Author:
**Moose OMalley**
<br>**Moose's Software Valley - Established July, 1996.**
<br>**https://moosevalley.github.io/**
