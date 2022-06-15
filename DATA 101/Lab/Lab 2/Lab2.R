#Question 1
c(sum((1:200)^2),sum((1:400)^2),sum((1:600)^2),sum((1:800)^2))
#[1]   2686700  21413400  72180100 170986800
n <- c(200,400,600,800)
n*(n+1)*(2*n+1)/6
#  2686700  21413400  72180100 170986800
#They're the same.

#Question 2
c(sum((1:200)^0.5),sum((1:400)^0.5),sum((1:600)^0.5),sum((1:800)^0.5))
#  1892.484  5343.128  9810.000 15098.880

#Question 3
sum(7,-4,5,15)
# 23
sum(7^2,-4^2,5^2,15^2)
# 283

#Question 4a
rep(seq(2,6,2), 3)
# 2 4 6 2 4 6 2 4 6

#Question 4b
rep(seq(2,6,2), each = 4)
# 2 2 2 2 4 4 4 4 6 6 6 6

#Question 4c
rep(seq(1,5,1), seq(1,5,1))
# 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5

#Question 4d
rep(seq(1,4,1),3)+rep(seq(0,2,1), each =4)
# 1 2 3 4 2 3 4 5 3 4 5 6

#Question 5
reclength <- c(3,7,12,15,20)
recwidth <- c(2,5,8,11,15)
area <- (reclength*recwidth)
area
# 6  35  96 165 300

#Question 6
#no rain.txt file