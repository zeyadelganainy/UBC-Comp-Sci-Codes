#Question 1a
colors <- c("red","yellow","blue","green","magenta","cyan")
colors[c(2,3,5)]
#[1] "yellow"  "blue"    "magenta"

#Question 1b
colors[rep(seq(1,3,1),4)+rep(0:3, each =3)]
#[1] "red"     "yellow"  "blue"    "yellow"  "blue"    "green"  
#[7] "blue"    "green"   "magenta" "green"   "magenta" "cyan"

#Question 2a
Trees <- as.matrix(trees)
ncol(Trees)
#[1] 3
nrow(Trees)
#[1] 31

#Question 2b
Trees[15,]
#Girth Height Volume 
#12.0   75.0   19.1

#Question 2c
Trees[,1]
#[1]  8.3  8.6  8.8 10.5 10.7 10.8 11.0 11.0 11.1 11.2 11.3 11.4 11.4
#[14] 11.7 12.0 12.9 12.9 13.3 13.7 13.8 14.0 14.2 14.5 16.0 16.3 17.3
#[27] 17.5 17.9 18.0 18.0 20.6

#Question 2d
sum(Trees[,2])
#[1] 2356

#Question 2e
var(Trees[1:15,2])
#[1] 36.52381

#Question 3
library(MASS)
help(bacteria)
#Northern Territory of Australia.

#Question 4a
help(faithful)
#Waiting time between eruptions and the duration of the eruption

#Question 4b
example(faithful)
#It tends to increase

#Question 4c
mean(faithful[,1])
#[1] 3.487783

#Question 5
library(DAAG)
help(cfseal)
#They died as an unintended consequence of commercial fishing.

#Question 6a
dim(cfseal)
#[1] 30 11 = 30 rows and 11 columns

#Question 6b
sum(is.na(cfseal[,11]))
#[1] 6

#Question 6c
cfs.avg <- mean(na.omit(cfseal[,11]))
cfs.avg
#[1] 1987.017

#Question 6d
cfseal[is.na(cfseal[, 11]), 11] <- cfs.avg

#Question 6e
diff711 <- cfseal[,7] - cfseal[,11]
diff711
#[1]  -546.8000  -591.0000  -527.4000  -656.5000 -1587.0167  -766.8000  -693.1000
#[8]  -574.6000 -1115.0000 -1167.8000 -1929.4000  -984.7000 -1075.1000 -1185.0000
#[15]  -829.0000 -1843.2000 -1825.0000 -1770.0000 -2015.0000 -1767.0000  -943.0167
#[22] -1596.0000 -2145.0000 -2424.2000  -778.0167  -445.0167 -2310.0000  -253.0167
#[29] -2320.0000   512.9833

#Question 6f
histogram(diff711)
#All of them except one are negative

#Question 7a
set.seed(31186)
x <-runif(1000)
y <-runif(1000)
sum(x>0.9)
#[1] 93

#Question 7b
sum(x>y)
#[1] 484

#Question 7c
IQR(x)
#[1] 0.5176714
IQR(x+y)
#[1] 0.606872
IQR(x-y)
#[1] 0.5574096

#Question 7d
plot( y ~ x)
#No obvious pattern, cannot predict

#Question 7e
w <- pmin(x,y)
v <- pmax(x,y)

#Question 7f
plot( v ~ w)
#yes, as y increases w increases

#Question 8a
rep(seq(1:8), (4:11))

#Question 8b
Cities <- c("Toronto", "Montreal", "Vancouver", "Calgary","Edmonton", "Ottawa", "Quebec", "Winnipeg")
Citiesfactor <-factor(rep(1:8,4:11))
Cities <-c("Toronto", "Montreal", "Vancouver", "Calgary","Edmonton", "Ottawa", "Quebec", "Winnipeg")
levels(Citiesfactor) <- Cities
as.character(Citiesfactor)
