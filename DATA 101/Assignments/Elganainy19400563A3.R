#Question 1
#0.101 as a decimal number would be:
0 + 2^-1 + 0 + 2^-3 
#[1] 0.625

#Question 2
#0.101 as a binary fraction would be:
#Since it starts with a 0, we put integer part0, to find decimal places:
0.101 * 2       #0.0
0.202 * 2       #0.00
0.404 * 2       #0.000
0.808 * 2       #0.0001
(1.616 - 1) * 2 #0.00011
(1.232 - 1) * 2 #0.000110
0.464 * 2       #0.0001100
0.928 * 2       #0.00011001
(1.856 - 1) * 2 #0.000110011
(1.712 - 1) * 2 #0.0001100111
(1.424 - 1) * 2 #0.00011001110
0.848 * 2       #0.000110011101
(1.696 - 1) * 2 #0.0001100111011
(1.392 - 1) * 2 #0.00011001110110
0.784 * 2       #0.000110011101101
(1.568 - 1) * 2 #0.0001100111011011
(1.136 - 1) * 2 #0.00011001110110110
0.272 * 2       #0.000110011101101100
0.544 * 2       #0.0001100111011011001
#Final answer is 0.0001100111011011001

#Question 3
options(digits = 18)
x <- 1000000
y <- 999999
A <- x^4 - y^4
B <- (x^2+y^2)*(x+y)*(x-y)
A #3999993999971581952
B #3999994000003999744
#As predicted, A is more accurate since it involves less operations and smaller numbers

#Question 4A
primes[-9900:0]
#prints primes, excluding the first 9900 values so it prints the last 100

#Question 4B
sum(primes[1:9000])
#prints the sum of the first 9000 values of primes

#Question 5
#The true value of the expression is not found by replacing values on R console, 
#it needs to be solved on paper and simplified, after simplifying:
#x^16 * [ ( (x^4 + y^4)(x^2 - y^2)(x^2 + y^2)/(196059601)(19801)(199) ) - 1 ]
#x^16 * [ 1 - 1 ]
#x^16 * 0
#True value is equal to 0

#Question 6
library(chron)
dateOfTom <- "1999-7-5"
numOfDaysTom <- chron( dates = dateOfTom, format = c("y-m-d") )
dateOfDavid <- "2003-12-12"
numOfDaysDavid <- chron( dates = dateOfDavid, format = c("y-m-d"))
numOfDaysDavid - numOfDaysTom
#Time in days:
#[1] 1621

#Question 7
income <- c(93.07,66.79,70.16,67.22,75.24,72.96)
names(income) <- c("Ottowa","Toronto","London","Windsor","Sudbury","ThunderBay")
barplot(income, main = "2009 Family Income in Six Cities", ylim = c(0,100), ylab = "Income (in $1000s)", xlab = "Cities", cex.axis = 0.65, cex.names = 0.55)
dotchart(income, main = "2009 Family Income in Six Cities", xlim = c(40,100), xlab = "Income (in $1000s)")

#Question 8A
returns1 <- diff(EuStockMarkets[,1])

#Question 8B
hist(returns1, breaks = "scott")
hist(returns1, breaks = "fd")
#The fd breaks gives smaller binwidths

#Question 8C
#The returns seem to be symmetrically distributed
