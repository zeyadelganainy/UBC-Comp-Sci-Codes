#Question 1

#The code for hornerpoly is as follows:
hornerpoly <- function(x,a){
  # a is a coefficients vector starting with c1
  n<-length(a)
  p<-a[n]
  for (i in (n-1):1){
    p<- p*x + a[i]
   }
  return(p)
}
#If we were to use this function to write another one to evalute sin(x) we can 
#use the essential idea of it and adjust it to our problem:
#the formula would be: x^(1)/factorial(1) + x^(3)/factorial(3) where for all the odd 
#numbers from 1 to m, but we see that the pattern is - + - + - +, to adjust to
#that, we will want to multiply the numerator by -1^0 then increment the degree 
#with each addition, ex: (-1)^0 = 1 then (-1)^1 = -1 and so on, so our new formula is
#(-1)^(i-1) * x^(2*i-1)/ factorial(2*i - 1) for m number of times: 

sintaylor <- function(x,m) {
  p <- 0 #equivalent to p <- a[n] from hornerpoly (initializing p to a value)
  for (i in 1:m){
    p <- p + (-1)^(i-1) * x^(2*i-1)/ factorial(2*i - 1) #equivalent to p <- p*x + a[i]
  }
  return(p)
}
#Checking:
sintaylor(5,9)
#[1] -0.9587764
sintaylor(5,10)
#[1] -0.9589332
#The true value of sin(5) in radians is -0.9589242 and as m increased we got closer to the actual value
#In some cases, the two answers are almost the same:
sintaylor(pi/2,9)
#[1] 1
sintaylor(pi/2,10)
#[1] 1
#In others, it takes a large m to reach true value:
sintaylor(10,9)
#[1] 65.3945
sintaylor(10,10)
#[1] -16.81185
#The actual value of sin(10) is -0.5440211, the function isnt wrong but it takes a higher value of m to reach:
sintaylor(10,19)
#[1] -0.5440211

#------------------------------------------------------------------------------

#Question 2

library(lattice)
CanPop <- data.frame(read.csv("population.csv")[c(1,2,13)])
names(CanPop) <- c("Year","Province","Pop")
CanPop$Year <- as.character(CanPop$Year)
dotplot(Province ~ Pop|Year, data = CanPop)


#------------------------------------------------------------------------------

#Question 3A

CanMurders <- data.frame(read.csv("murders.csv")[c(1,2,11)])
names(CanMurders) <- c("Year","Province","Murders")

#Question 3B

CanMurders$Year <- as.character(CanMurders$Year)
dotplot(Province ~ Murders|Year, data = CanMurders)
dotplot(Year ~ Murders, data = CanMurders)


#Question 3C

CanMurders$MurdersPerCapita <- with(c(CanMurders,CanPop), Murders / Pop * 100000 )
dotplot(Province ~ MurdersPerCapita|Year, data = CanMurders)
dotplot(Year ~ Murders, data = CanMurders)
#The question asked for murders for each year but since I already did that in 3B
#I decided to add MurdersPerCapita for each year
dotplot(Year ~ MurdersPerCapita, data = CanMurders)


#Question 3D

MurdersPerYear <- numeric(3)
for(i in 1:3){
  MurdersPerYear[i] <- sum(subset(CanMurders$Murders, CanMurders$Year == 2016+i))
}

MPCPerYear <- numeric(3)
for(i in 1:3){
  MPCPerYear[i] <- sum(subset(CanMurders, CanMurders$Year == 2016+i)[,4])
}

SumMurders <- data.frame(unique(CanMurders$Year),MurdersPerYear[1:3],MPCPerYear[1:3])
names(SumMurders) <- c("Year","Murders","MurdersPerCapita")
dotplot(Year ~ Murders, data = SumMurders)
dotplot(Year ~ MurdersPerCapita, data = SumMurders)

#Question 3E

par(mfrow=c(1,2))
barplot(subset(CanMurders$Murders, CanMurders$Year == 2017), 
        names.arg = unique(CanPop$Province), las = 2, cex.names = .35)
barplot(subset(CanMurders$MurdersPerCapita, CanMurders$Year == 2017),
        names.arg = unique(CanPop$Province), las = 2, cex.names = .35)

#Question 3F

#For 2018
barplot(subset(CanMurders$Murders, CanMurders$Year == 2018), 
        names.arg = unique(CanPop$Province), las = 2, cex.names = .35, col = "darkslategrey")
barplot(subset(CanMurders$MurdersPerCapita, CanMurders$Year == 2018),
        names.arg = unique(CanPop$Province), las = 2, cex.names = .35, col = "aquamarine3")
#For 2019
barplot(subset(CanMurders$Murders, CanMurders$Year == 2019), 
        names.arg = unique(CanPop$Province), las = 2, cex.names = .35, col = "cornflowerblue")
barplot(subset(CanMurders$MurdersPerCapita, CanMurders$Year == 2019),
        names.arg = unique(CanPop$Province), las = 2, cex.names = .35, col = "deepskyblue3")

#Question 3G

Can17 <- subset(CanMurders$MurdersPerCapita, CanMurders$Year == 2017)
Can18 <- subset(CanMurders$MurdersPerCapita, CanMurders$Year == 2018)
Can19 <- subset(CanMurders$MurdersPerCapita, CanMurders$Year == 2019)
CanHomicides <- cbind(Can17,Can18,Can19)
colnames(CanHomicides) <- 2017:2019

par(mfrow=c(1,3))
for(i in 2017:2019){
  barplot(subset(CanMurders$MurdersPerCapita, CanMurders$Year == i),
          names.arg = unique(CanMurders$Province), cex.names = 0.45, las = 2, font = 2,col = i)
}

#------------------------------------------------------------------------------

#Question 4A

source("radon-1.R")
library(MPV)
regression1.lm <-lm(measurement ~ diameter, data = radon)
PRESS(regression1.lm)
#[1] 266.6634

#Question 4B

regression2.lm <- lm(measurement ~ diameter + time, data = radon)
PRESS(regression2.lm)
#[1] 151.6716
#regression2.lm is better since small values of PRESS are desired

#Question 4C

predict(regression2.lm, newdata = data.frame(diameter =0.9, time = 1), 
        interval = "predict")
#       fit      lwr      upr
#1 70.73473 65.61045 75.85902 
#Prediction is 70.7 and 95% prediction interval is between 65.61 and 75.86

predict(regression2.lm, newdata = data.frame(diameter =0.9, time = 4),
        interval = "predict")
#      fit      lwr      upr
#1 76.38473 71.26045 81.50902
#Prediction is 76.4 and 95% prediction interval is between 71.26 and 81.51

#------------------------------------------------------------------------------

#Question 5

source("mousetumours.R")
xyplot(volume ~ time|as.character(mouse), data = mousetumours, type = c("p","smooth"))

#------------------------------------------------------------------------------

#Question 6

help(table.b4)
#y is sales price ($1000s)
#x1 is taxes ($1000s)
#x2 is number of baths
#x3 is lot size (1000s ft^2)
#x4 is living space (1000s ft^2)
#x5 is number of garage stalls
#x6 is number of rooms
#x7 is number of bedrooms
#x8 is age of the home (years)
#x9 is number of fireplaces

model1.lm <- lm(y ~ ., data = table.b4)
PRESS(model1.lm)
#[1] 393.492
model2.lm <- lm(y ~ x1, data = table.b4)
PRESS(model2.lm)
#[1] 224.6111
model3.lm <- lm(y ~ x1 + x8, data = table.b4)
PRESS(model3.lm)
#[1] 253.9058
model4.lm <- lm(y ~ x1 + x2, data = table.b4)
PRESS(model4.lm)
#[1] 224.441
model5.lm <- lm(y ~ x1 + x5, data = table.b4)
PRESS(model5.lm)
#[1] 236.814
model6.lm <- lm(y ~ x2 + x3 + x5 + x8, data = table.b4)
PRESS(model6.lm)
#[1] 331.0418
model7.lm <- lm(y ~ x2 + x3 + x5, data = table.b4)
PRESS(model7.lm)
#[1] 374.1862
model8.lm <- lm(y ~ x2 + x3 + x5 + x9, data = table.b4)
PRESS(model8.lm)
#[1] 422.3961

models <- c(393.492,224.6111,253.9058,224.441,236.814,331.0418,374.1862,422.3961)
min(models)
#[1] 224.441
#This number corresponds to model4, so that is the best model out of all of them

#If we didn't have information about taxes (x1), the best aspects to look at would be
#between models 6 to 8 with PRESS values of 331.0418, 374.1862 and 422.3961 respectively
#The lowest value is that of model5, so the best aspects are:
#number of baths (x2), lot size (x3), number of garage stalls (x5), and age of home (x8)
#The predictive model for that would be:
coef(model6.lm)
#(Intercept)          x2          x3          x5          x8 
# 14.5836728  12.5126817   0.9217315   2.7801968  -0.1008803
#So it's:
#y = 14.6 + 12.5(x2) + 0.9(x3) + 2.8(x5) + -0.1(x8) 