#Question 1A
1.0
#[1] 1

#Question 1B
#1
0.5 * 2
#1.1

#Question 1C
7/2 #Modulus 1
3/2 #Modulus 1
1/2 #Modulus 1
#111

#Question 1D
#0.625 is in the form of 2/n^m so it can be exactly stored
0.625 #0
0.625 * 2 #0.1
0.25 * 2  #0.10
0.5 * 2   #0.101

#Question 1E
1/9
#0.111111111...
0.11111 * 2  #0.0
0.22222 * 2  #0.00
0.44444 * 2  #0.000
0.88888 * 2  #0.0001
0.77777 * 2  #0.00011
...
#000111000111000 up to 15 decimal places

#Question 2A
2^0 + 2^1 + 2^2 + 2^3
#[1] 15

#Question 2B
2^1 + 2^3 
#[1] 10

#Question 2C
2^3 + 2^1 + 2^-2 + 2^-4
#[1] 10.3125

#Question 2D
2^0 + sum(2^-(seq(2,50,2)))
#[1] 1.333333333333333...repeated

#Question 3A
6/7 #0.8571
0.8571 * 2 #0.1
0.7142 * 2 #0.11
0.4284 * 2 #0.110
0.8568 * 2 #0.1101
#0.1101

#Question 3B
1/7 #0.1428
0.1428 * 2 #0.0
0.2856 * 2 #0.00
0.5712 * 2 #0.001
0.1424 * 2 #0.0010
0.2848 * 2 #0.00100
0.5696 * 2 #0.001001

#Question 3C
0.001001 + 0.1101
#[1] 0.1111
#As decimal value:
2^-1 + 2^-2 + 2^-3 + 2^-4
#[1] 0.9375 (considerable error here)

#Question 3D
#6 as binary is:
6/2 #Modulus = 0
2/2 #Modulus = 1
1/2 #Modulus = 1
#6 as binary is 110
#1 as binary is 1
110 + 1
#[1] 111
#7 as binary is 111 (obtained in Q1C)
111/111
#[1] 1 is the result obtained, which is correct

#Question 4
#Using R:
(101^6 + 97^6)*(101^6 - 97^6) - (101^12 - 97^12)
#[1] 0
(101^7 + 97^7)*(101^7 - 97^7) - (101^14 - 97^14)
#[1] 1099511627776

#Using Algebra (Factoring):
(101^12 - 97^12) - (101^12 - 97^12)
#Answer is 0
(101^14 - 97^14) - (101^14 - 97^14)
#Answer is also 0
#In the second case, we see a big error, because a very large number is being subtracted from another very large number; 
#there are not enough digits in the foating-point representations of these numbers. At least 28 places are needed,
#instead of the usual 16, leading to an error that contains 12 digits. 
#In the first case, we are just lucky that number has an exact representation.