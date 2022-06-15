#Question 1A
pythag <- function(a,b){
  h <- (a^2 + b^2)^(1/2)
  return(h)
}

#Question 1B
VF <- rep(rep(c(0,1),c(3,4)),300)
VF <- factor(VF)
levels(VF)[1] <- "Male"
levels(VF)[2] <- "Female"

#Question 1C
BinCal <- function(n,m){
  result <- factorial(n) / ( factorial(n-m) * factorial(m) )
  return(result)
}
BinCal(10,4)
#[1] 210

#Question 1D
sqrtError <- function(x){
  if(min(x) < 0) {
  errorMessage <- "Error: At least one element of your input is negative."
  errorMessage
  }
  else {
    result <- x^(1/2)
    result
  }
}

#Question 1E

mergesort <- function (x, decrease = FALSE) {
  len <- length(x)
  if (len < 2) result <- x
  else {
    y <- x[1:(len / 2)]
    z <- x[-(1:(len / 2))]
    y <- mergesort(y)
    z <- mergesort(z)
    result <- c()
    while (min(length(y), length(z)) > 0) {
      if (y[1] < z[1]) {
        result <- c(result, y[1])
        y <- y[-1]
      } else {
        result <- c(result, z[1])
        z <- z[-1]
      }
    }
    if (length(y) > 0)
      result <- c(result, y)
    else
      result <- c(result, z)
  }
  if(decrease == TRUE) {return(sort(result, decreasing = TRUE))}
  return(result)
}


#Question 2
f1 <- 1
f2 <- 1
result <- 0
for(n in 3:200){
  result <- 1.3*f2 - 0.25*f1
  f1 <- f2
  f2 <- result
}
result
#[1] 271561.9
#f(200) = 271561.9

#Question 3
twinprimes <- function(n){
    sieve <- seq(2, n)
    primes <- c()
    for (i in seq(2, n)) {
      if (any(sieve == i)) {
        primes <- c(primes, i)
        sieve <- c(sieve[(sieve %% i) != 0], i)
      }
    }
    pairs <-data.frame()
    if((primes[2] - primes[1]) == 2){
      pairs <- rbind2(pairs,c(primes[1],primes[2]))
      }   
    for(i in 2:(length(primes)-1)){
      if((primes[i+1] - primes[i]) == 2){
        pairs <- rbind2(pairs,c(primes[i],primes[i+1]))
      }
    }
    as.matrix(pairs)
} 

#Question 4A
library(MPV)
names(table.b11)
#[1] "Clarity"  "Aroma"    "Body"     "Flavor"   "Oakiness" "Quality"  "Region"  

#Question 4B
wine.lm <- lm(Quality ~ Aroma, data = table.b11)
plot(Quality ~ Aroma, data = table.b11)
abline(wine.lm)

#Question 4C
predict(wine.lm, newdata = data.frame(Aroma = 4))
#       1 
#11.30433 
#11.30433 is the predicted quality

#Question 4D
library(lattice)
xyplot(Quality ~ Aroma|Region,data = table.b11, type=c("p", "smooth"), span = 2)

#Question 4E
xyplot(Quality ~ Aroma|Region,data = table.b11, groups = (Clarity < 1), 
        pch = c("1","0"),
       type=c("p", "smooth"), span = 2)

#Question 5A
library(rpart)
wine.rpart <- rpart(Quality ~ Body + Clarity, data = table.b11)
plot(wine.rpart)
text(wine.rpart)

#Question 5B
#Based on body and clarity, it would be 10.78 as seen from the regression tree

#Question 6A
wine.lm <- lm(Quality ~., data = table.b11)

#Question 6B
predict(wine.lm, newdata = data.frame(Clarity=1, Aroma=7, Body=4, Flavor=1.5, Oakiness=3, Region=2))
#       1 
#10.53694
                                      