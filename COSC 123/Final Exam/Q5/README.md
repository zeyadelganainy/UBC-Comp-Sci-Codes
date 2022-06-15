## Question 5 - Objected Oriented Programming (20 marks) 

Start with the standard template in the Q5 directory. I encourage you to read through the full question before starting to code!

Tasks:

a) Create a Class for ground enemies

- Ground enemies have a square body with two circles as eyes. 
- Add a 0-arg constructor to initialize an enemy AND a 2-arg constructor with speed and body colour as attributes
- Create an **array of objects** to hold the ground enemies (size 2), populate this array with a **loop** (any loop)
- Ground enemies should generate on the left side of the screen, die when they fall through the break in the platform, and then reset their position to appear from the left of the screen 
- There can be a maximum of 2 ground enemies present at a time
- Create appropriate methods as needed

b) Create a Class for flying enemies (other than aliens) 

- Flying enemies have a Triangle body with two circles as eyes. 
- Flying enemies have three attributes: speed, offset, and body colour (add more as needed).
- Add a 0-arg constructor to initialize an enemy
- Add a 3-arg constructor with speed, offset, and body colour as attributes
- Use the noise() function along with the offset attribute to control the alien's y-location
- Create an **array of objects** to hold the flying enemies (size 2), populate this array with a **loop**
- Flying enemies should bounce off the screen edges
- Flying enemies cannot die
- There can only be a maximum of 2 flying enemies present at a time
- Create appropriate methods as needed

### Rubric:

- **5 marks** for Ground Enemy Class
- **9 marks** for Flying Enemy Class
- **6 marks** for working code and correct functionality
