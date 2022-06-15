#Question 1A
mean(Nile)
#[1] 919.35

#Question 1B
median(Nile)
#[1] 893.5

#Question 1C
hist(Nile, main = "Histogram of Nile River Flow Rate", xlab = "River Flow
Observations (in cubic meters)")

#Question 1D
help(sort)
sort(Nile, decreasing = TRUE)
#15th observation flow rate: 1140
#25th observation flow rate: 1040

#Question 1E
help(order)
order(Nile, decreasing = FALSE)
#43rd 71st and 70th 

#Question 1F
#The sort function sorts the actual values in a specific order. 
#However, the order function shows the element or location of the sorted values of the function
#As a check:
sort(Nile, decreasing = FALSE)
#[1] 456  649  676
#These first 3 values correspond to the 43rd 71st and 70th element respectively

#Question 2A
#After placing the file in the working directory:
NAvector <- source("NAvector.R")

#Question 2B
NAcount <- sum(is.na(NAvector))
NAcount
#[1] 0

#Question 3A
elevation <- (c(217,254,248,254,253,227,178,207,217))
area <- (c( 24387,5374,4624,2247,1353,1223,1151,755,657))
row.names(Manitoba.lakes) <- c("Winnipeg","Winnipegosis","Manitoba","SouthernIndian","Cedar","Island","Gods","Cross","Playgreen")
Manitoba.lakes <- data.frame(elevation, area)

#Question 3B
sd(subset(Manitoba.lakes$elevation, Manitoba.lakes$area > 1200))
#[1] 16.09244

#Question 4A
tomatoes <- read.table("ex10.22.txt",header = TRUE)

#Question 4B
aggregate( yield ~ ECf, data = tomatoes , FUN = mean)
#  ECf yield
#1   A 58.28
#2   B 55.40
#3   C 50.85
#4   D 45.50

#Question 4c
levels(tomatoes$ECf)<- c("A","B","C","D")
levels(tomatoes$ECf)[1:4] <- c(1,2,3,4)