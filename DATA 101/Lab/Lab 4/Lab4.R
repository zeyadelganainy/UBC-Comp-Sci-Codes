#Question 1
U1 <- runif(5000)
U2 <- runif(5000)
hist(U1)
hist(U2)
#They values are very close in number to each other, the shape is almost rectangular

#Question 2
min <- pmin( U1, U2 )
hist(min)
#Its shape is traingular, and it's decreasing as we move forward in values

#Question 3
maxes <- pmax(U1,U2)
hist(maxes)
#The shape is an ascending triangle

#Question 4
U3 <- runif(5000)
mins3 <- pmin(min, U3)
hist(mins3)
#The shape is a triangle that has smaller values than the previous min vector

#Question 5
maxes3 <- pmax(maxes, U3)
hist(maxes3)
#The values are increasing from left to right, obtaining lower values on the left than the maxes vector

#Question 6
install.packages("MPV")
library(MPV)

#A
hist(windWin80[,1])
#The values are mostly decreasing from left to right with a few exceptions

#B
hist(windWin80$h12)
#The values decrease as you go away from 0, with a few exceptions

#C
hist(pmax(windWin80$h0, windWin80$h12))
#The values seem to be reaching a maximum around the left of the middle and it's more of a mound shape

#Question 7

#A
mean(windWin80$h0)
#[1] 14.59016
mean(windWin80$h12)
#[1] 21.14208
#The average wind speed is higher at noon, it's windier at that time

#B
median(windWin80$h0); median(windWin80$h12)
#[1] 15
#[1] 20

#C
sd(windWin80$h0); sd(windWin80$h12)
#[1] 10.44733
#[1] 12.04997
#It's more spread out at noon

#D
IQR(windWin80$h0); IQR(windWin80$h12)
#[1] 14
#[1] 15

#E
max(windWin80$h0); IQR(windWin80$h12)
#[1] 57
#[1] 15                    

#Question 8
max(windWin80$h12[windWin80$h0 < 10])
#[1] 43

#Question 9
Win5_25 <- subset(windWin80, h0 <= 25 & h0 >=5)
mean(Win5_25$h12)
#[1] 20.90517

#Question 10
Win10_30 <- subset(windWin80, h0 > 10 & h0 < 30)
sd(Win10_30$h12)
#[1] 11.1412

#Question 11
Win50 <- subset(windWin80, h12 < 50 | h0 > h12)
mean(Win50)
#[1] 20.525