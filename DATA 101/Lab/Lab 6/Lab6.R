#Question 1
covid <- read.csv("covidBC.csv", header = TRUE, sep = ",")
areas <- unique(covid$HA)
n <-  length(areas)
covidArea <- split(covid, covid$HA)
windows(width = 10, height = 10)
par(mfrow=c(2, 3))
for (i in 1:n) {
cov_table <- with(covidArea[[i]], table(Sex, Age_Group))
barplot(cov_table, beside=TRUE, ylim=c(0, 1000), main = areas[i],legend = TRUE, las = 2)
}

#Question 2
n <- 100; R <- c(3.6,3.7) ; x <- 0.1
par(mfrow=c(1,2))
population <- numeric(n)
for (R in R) {
  for (i in 1:n) {
  x <- R*x*(1-x)
  population[i] <- x
  }
population <- ts(population)
plot(population, ylim=c(0, 1))
}

