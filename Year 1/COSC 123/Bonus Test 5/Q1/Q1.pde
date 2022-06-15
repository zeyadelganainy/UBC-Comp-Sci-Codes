float speedX = 1, speedY = 2, seconds = 0;
float x=20, y=100, r = 20;
color strokeColor = color(255);
color backgroundColor = color(0,0,0);
void setup() {
  size(200, 200);
}
void draw() {
  seconds += 0.01;
  background(backgroundColor);
  if(seconds < 3) {
    moveBall();
  checkCollisions();
  drawBall();
  text("Time: ", 10, 10);
  text("PW: ", 10, 20);
  text(seconds, 40 , 10);
  }
}
void moveBall() {
  x += speedX;
  y += speedY;
}
void checkCollisions() {
  if ( x > width-r || x < r ) 
    speedX = -speedX;
  if (y > height-r || y < r)
    speedY = -speedY;
}
void drawBall() {
  stroke(strokeColor);
  strokeWeight(r/7);
  ellipse(x, y, 2*r, 2*r);
}

void mousePressed(){
 seconds = 0; 
}

void keyPressed(){
  String pass = "";
  if(key == BACKSPACE)
  pass = "";
  pass += key;
  System.out.print(pass);
  if(pass == "cosc123")
  seconds = 0;
  
}
