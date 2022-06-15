#Question 1A
11 * 11
#121

#Question 1B
11 * 111
#1221

#Question 1C
11 * 1111
#12221

#Question 1D
11 * 11111
#122221

#Question 1E
#The pattern here is that the answer will always be,
#1 followed by a number of 2's that is (number of 1's in the number that is multiplied by 11 - 1) followed by 1
#Since we have 19 ones, the answer would be 1(19-1 twos)1:
#12222222222222222221 (18 twos)

#Question 1F
options(digits=15)
11 * 1111111111111111111
#12222222222222223360, which is not the actual answer so I was right and R was wrong in this case.

#Question 2A
riversYards <- rivers * 1760
#riversYards object created

#Question 2B
riversYards[1:10]
#First 10 observations in riversYards are extracted and printed as a simple list of numbers

#Question 2C
barplot(rivers[1:5])
#As observed from the graph, they are not sorted in decreasing order.

#Question 2D
Rivers <- sort(rivers, decreasing = TRUE)
barplot(Rivers[1:10])
#The graph shows that there are 4 rivers in North America longer than 2000 miles

#Question 3A
C2F <- function(x)(9/5 * x + 32)
#Created a function called C2F that converts Celsius temperatures to Fahrenheit temperatures,

#Question 3B
C2F(150)
#302

#Question 3C
Ctemps <- c(-40, 0, 30, 100)
C2F(Ctemps)
#-40  32  86 212

#Question 4
inch2cm <- function(x) (x * 2.54)
#Since 1 inch is 2.54 cm, multiplying given inches by 2.54 would give us the centimeter measurement we need



