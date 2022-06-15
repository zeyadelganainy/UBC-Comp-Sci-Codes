#Question 1A
carData <- read.table("CarPrice.csv", sep=",", header=TRUE)
carData <- carData[,-1]
plot(price ~ enginesize, data = carData,
     main = "Price VS Engine Size",
     ylab = "Price", xlab = "Engine Size",
     pch = 16,
     cex = .75)

#Question 1B
carlm <- lm(price ~ enginesize, data=carData)
summary(carlm)
abline(-8005,167)

#Question 2
par(mfrow = c(1,2))
library(DAAG)
boxplot(length ~ species, data = cuckoos,
        main = "Cuckoo Egg Lengths",
        ylab = "length (mm)", pch = 16)
boxplot(breadth ~ species, data = cuckoos,
        main = "Cuckoo Egg Breadths",
        ylab = "breadth (mm)", pch = 16)

#2nd Set of plots
par(mfrow = c(2,3))
for ( i in 1:6) {
  names <- levels(cuckoos$species)[i]
  subnames <- subset(cuckoos, cuckoos$species == names)
  plot(breadth ~ length, data = subnames,
       main = names, ylab = "breadth", pch = 16)
  abline(lm(subnames$breadth ~ subnames$length))
}

