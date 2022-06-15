float Xb, Yb, r, speedX, speedY;    //ball location, size, and speed
float Xp, Yp, w, h;                 //paddle location, wdith and height 

boolean isGameOver = false;         // when true, just draw the GameOver message and stop the animation loop to end the game  
int score = 0;

void setup() {
  size(400, 400);

  // initialize ball attributes
  Xb = random(r, width-r);      
  Yb = 30;                         
  r = 15;
  speedX = int(random(2, 4));   
  speedY = int(random(2, 4));

  // initialize paddle attributes
  w = 30; 
  h = 8;
  Xp = width/2;  
  Yp = height - h;
  
  // hide mouse cursor
  noCursor();
}

void draw() {  
background(0);

if (!isGameOver) {              //play as long as it is not game over

// DRAW game elements
    // draw Ball
    fill(255);   noStroke();
    ellipse(Xb, Yb, 2*r, 2*r);
    // draw paddle
    stroke(0, 255, 0);  strokeCap(ROUND);  strokeWeight(h);
    line(Xp-w, Yp, Xp+w, Yp);
    // draw score
    fill(255, 0, 0); textAlign(LEFT);  textSize(16);
    text("Score: " + score, 5, 15);

// MOVE game elements
    // move Paddle
    Xp = mouseX;
    // move ball 
    Xb += speedX;
    Yb += speedY;

// CHECK for collisions
    // REQ1: Add code to bounce the ball off the two sides and the top edge        [+2 marks]
    if(Xb <= 0 || Xb >= width)
    speedX = - speedX;
    if(Yb <= 0)
    speedY = - speedY;
    // REQ2: Add code to check if ball lands on the paddle. Here is the pseudo-code:
    // if the ball is at the bottom edge (hint: check Yb)                          [+1 mark]
    if(Yb > width - 8){
    //     if ball lands on paddle (hint: see the assignment on how to check this) [+2 marks]  
      if(dist(Xb,Yb,Xp,Yp) < (w+r)){
    //         increment score, bounce ball up, and increase speed by 10%          [+2 marks]
      score++;
      speedY = - speedY * 1.1;
      }
    //     else                                                                    
    //         set isGameOver to true;                                             [+1 mark]
    else isGameOver = true;
    }
} else { // if game over
    //REQ3: Add code for putting the GameOver message and stoping the animation loop [+2 marks]
    fill(255,0,0); noStroke();
    textAlign(CENTER); textSize(20);
    rectMode(CENTER);
    rect(width/2,height/2,200,100);
    fill(255,255,0);
    text("Game Over!", width/2, (height/2) - 20);
    text("Your score is " + score, width/2, (height/2) + 20);
  }
}

//no other functions are required! (e.g. don't implement mousePressed, keyPressed, etc)
