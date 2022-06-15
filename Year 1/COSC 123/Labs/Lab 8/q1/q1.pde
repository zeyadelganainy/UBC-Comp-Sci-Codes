float x, y, r = 15;           // ball location and size
float speedX=0, speedY=0;     // speed of ball
float xt, yt, rt = 20;        // target location and size
int score = 0;                // keep score
PImage ball, target;         //Images imported from https://kenney.nl/assets/rolling-ball-assets

void setup() {
  size(200, 200);
  textSize(14);
  //ball initially at sketch center
  x = width/2;                
  y = height/2;
  //target initially at random location within the sketch
  xt = random(rt, width-rt);
  yt = random(rt, height-rt);
  
  imageMode(CENTER);
  ball = loadImage("ball_blue_large_alt.png");
  target = loadImage("hole_large_end_alt.png");
}

void draw() {
  background(0);
  // draw score
  fill(255, 0, 0);  
  fill(50,150,255);
  text("Score: " + score, 5, 15);

  //draw ball
  noStroke();        
  fill(255);
  image(ball, x, y, 2 * r, 2 * r);

  //draw target
  stroke(255, 180, 0); 
  fill(255, 180, 0, 50);
  image(target ,xt, yt, 2*rt, 2*rt);

  //move ball 
  x += speedX;
  y += speedY;

  //REQ1: Add code here to bounce ball off sketch edges.                 [+1 mark]
  if (x >= width || x <= 0)
    speedX = - speedX;
  if (y <= 0 || y >= height)
    speedY = - speedY;
  //REQ2: Add code here to:
  //  Check if ball is completely inside target (hint: dist() function). [+2 marks] 
  if (dist(x, y, xt, yt) < 5) {
    //  If it is, do two things:                                           [+2 marks] 
    //    a) increment score
    score++;
    //    b) move target to a new random location
    xt = random(rt, width-rt);
    yt = random(rt, height-rt);
  }
}

void keyPressed() {
  //REQ3: Add code here to react to key presses as following:
  //  a) UP decrements speedY by 1, DOWN increments speedY by 1. speedY must stay in the range [-5,5] inclusive.    [+2 marks]
  if (keyCode == UP) { 
    if (speedY > 5) 
      speedY=5;
    else if (speedY < -5)
      speedY=-5;
    speedY--;
  }
  if (keyCode == DOWN) {
    if (speedY > 5) 
      speedY=5;
    else if (speedY < -5)
      speedY=-5;
    speedY++;
  }

  //  b) LEFT decrements speedX by 1, RIGHT increments speedX by 1. speedX must stay in the range [-5,5] inclusive. [+2 marks]
  if (keyCode == LEFT) { 
    if (speedX > 5) 
      speedX=5;
    else if (speedX < -5)
      speedX=-5;
    speedX--;
  }
  if (keyCode == RIGHT) {
    if (speedX > 5) 
      speedX=5;
    else if (speedX < -5)
      speedX=-5;
    speedX++;
  }
  //  c) SPACE freezes the ball and places it in the center of the sketch                                           [+1 mark]
  if (key == ' ') {
    speedX = 0; 
    speedY=0;
    x = width/2; 
    y = height/2;
  }
}
