#Question 1A
library(DAAG)
plot(area ~ elevation, data = Manitoba.lakes)
#Almost all the lakes in Manitoba have an area below or a little above 5000
#Except one outlier, lake Winnipeg.The area is heavily negatively skewed

#Question 1B
plot(area ~ elevation, data = Manitoba.lakes, xlim = c(160,260))
text(Manitoba.lakes$elevation, Manitoba.lakes$area, 
     labels = row.names(Manitoba.lakes),adj = 1.1, cex = 0.7)

#Question 1C
leastsq.lm <- lm(area ~ elevation, data = Manitoba.lakes)
abline(leastsq.lm, col = "orange")

#Question 2
plot(height ~ age, data = Loblolly)
abline(lm(height ~ age, data = Loblolly), col = "red")

#Question 3
#A straight line isn't the best way to represent Manitoba.lakes data as it
#means nothing and shows no relation between the lakes. However, for Loblolly
#data, a straight line makes sense because as the age increases so does the
#height of the trees. This is shown by the best-fit line with a positive slope

#Question 4
seed <- unique(Loblolly$Seed)
n <- length(seed)
slopes <- numeric(n)
intercepts <- numeric(n)
for (i in 1:n) {
lob.lm <- lm(height ~ age, data = subset(Loblolly, Seed==seed[i]))
slopes[i] <- coef(lob.lm)[2]
intercepts[i] <- coef(lob.lm)[1]
}
#My legend was not displaying correctly so I had to use this:
windows(20,20)

plot(height ~ age, data = Loblolly, cex = 0.75, col = 1:14, pch = rep(c(1,16), each = 7))
for(i in 1:n) {
  if(i>=7) abline(intercepts[i],slopes[i], lty = 1, col = i)
  else abline(intercepts[i],slopes[i], lty = 2, col = i)
}
legend("topleft", legend = paste("Best Fit for Seed", 1:n), bty = n, 
       lty = rep(1:2,each = 7), col = 1:14, cex = 0.7)
legend("bottomright", legend = paste("Seed", 1:n), bty = n,
       pch = rep(c(1,16),each = 7), col = 1:14, cex = 0.7)

#Question 5
par(mfrow=c(1,2))
hist(slopes, col = "darkblue")
hist(intercepts, col = "darkred")

#Question 6
par(mfrow=c(1,1))
plot(slopes ~ intercepts, pch = 16, col = "violet")
abline(lm(slopes ~ intercepts), col = "blue")
coef(lm(slopes ~ intercepts))
#(Intercept)  intercepts 
#2.596354997 0.004443651 
#A typical line relating height to age in all tree kinds, it would have a 
#slope of 2.596354997 and an intercept of 0.004443651
#As a check:
par(mfrow=c(1,2))
plot(height ~ age, data = Loblolly)
abline(0.004443651,2.596354997) 
plot(height ~ age, data = Loblolly) 
abline(intercepts, slopes) 
#The two lines are very similar
