#Question 1

# A
chickwts[14,]
#   weight    feed
#14    141 linseed

# B
chickwts[c(7,14,37),1]
#[1] 108 141 423

# C
chickwtsCasein <- subset(chickwts, feed == "casein")
#Extracted the observations that correspond to casein, and assigned the subset to chickwtsCasein.

# D
mean(chickwtsCasein$weight)
#[1] 323.5833

# E
chickwts$Feed <- chickwts[,2]
levels(chickwts$Feed) <- c("Casein","Horsebean","Linseed","Meatmeal","Soybean","Sunflower")
#Create a new column which contains a factor called Feed which has levels Casein,and so on.

# F
chick240 <- subset(chickwts, chickwts$weight < 240)
#Extracted all observations where weight is less than 240 and put them in chick240.

# G
chick240Table <- table(chick240$feed)
barplot(chick240Table)
#Created a bar plot of the counts in chick240Table.
--------------------------------------------------------------------------------------------------
#Question 2

# A
install.packages("DAAG")
library(DAAG)
nrow(cuckoos)
#[1] 120, so it's 120 observations

# B
cuckoos$length[27]
#[1] 22, so the length is 22

# C
cuckoos[40,]
#length breadth      species id
#40   22.9    17.2 meadow.pipit 60

# D
levels(cuckoos$species)
#[1] "hedge.sparrow" "meadow.pipit"  "pied.wagtail"  "robin"        
#[5] "tree.pipit"    "wren"

# E
m.pipitFactor <- factor(cuckoos$species)
levels(m.pipitFactor) <- c("meadow.pipit","other","other","other","other","other")
which(cuckoos$species == "meadow.pipit")
m.pipitFactor[1:45] <- "meadow.pipit" 
m.pipitFactor[46:120] <- "other"
#Created a new factor called m.pipitFactor which has levels meadow.pipit and other and assigned "other" to anything that isn't meadow.pipit

# F
cuckoos <- data.frame(cuckoos, "m.pipit" = c("TRUE","FALSE"))
cuckoos$m.pipit[which(cuckoos$species == "meadow.pipit")] <- "TRUE"
cuckoos$m.pipit[which(cuckoos$species != "meadow.pipit")] <- "FALSE"
#Created a logical vector column called m.pipit which contains TRUE in rows with meadow.pipit and FALSE in the other rows.

# G
cuckoosMPipit <- data.frame(subset(cuckoos, cuckoos$m.pipit == TRUE))
cuckoosOther <- data.frame(subset(cuckoos, cuckoos$m.pipit == FALSE))
#Created two new data frames: one called cuckoosMPipit for meadow.pipit and cuckoosOther for others

# H
cuckoosLongLength <- subset(cuckoos, cuckoos$length > 23)
mean(cuckoosLongLength$breadth)
#[1] 16.78824