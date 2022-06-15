#Question 1A
11^2 %% 7
#[1] 2
4^2 %% 7
#[1] 2

#Question 1B
11^3 %% 7
#[1] 1
4^3 %% 7
#[1] 1

#Question 1C
11^4 %% 7
#[1] 4
4^4 %% 7
#[1] 4

#Question 1D
11^5 %% 7
#[1] 2
4^5 %% 7
#[1] 2

#Question 1E
#Based on the pattern above (2,1,4):
#11^16 would be
( 16 / 3 - 5 ) %% 3
#[1] 1/3 
#Would be 4 because we are picking the first digit of the pattern

#Question 1F
options(digits = 16)
11^16 %% 7
#[1] 3
#I was right

#Question 2A
first20 <- 1:20
sum(first20)
#[1] 210

#Question 2B
sum(rivers)
#[1] 83357

#Question 3A
denominator <- c(seq(1,20,1))
1/denominator
sum(1/denominator)
#[1] 3.597739657143682

#Question 3B
sum(1/denominator^2)
#[1] 1.596163243913023

#Question 3C
sum(1/denominator^3)
#[1] 1.200867841958437

#Question 3D
sum(log(seq(1,20,1)))
#[1] 42.33561646075349

#Question 4
AUcities <- c(4.6,4.2,2.2,1.9,1.2)
barplot(AUcities, ylab = "Population (in millions)")
