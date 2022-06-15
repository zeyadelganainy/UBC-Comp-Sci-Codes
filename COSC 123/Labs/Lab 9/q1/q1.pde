float speedX = 2, speedY = 3;
float x=150, y=150, R = 30;

void setup() {
  size(300, 300);
  stroke(255); 
  strokeWeight(2); 
  noFill();
  colorMode(HSB,360,100,100);
}  

void draw() {
  background(0);
  // move spider-web
  x += speedX;
  y += speedY;
  translate(x, y);

  // bounce spider-web
  if (x > width-R || x < R ) speedX = -speedX;
  if (y > height-R || y < R)  speedY = -speedY;

  // draw spider-web
  // REQ1: use loops here to draw many concentric circles. 
  for (int i = 1; i < 4; i++) {
    stroke(i*75,100,100);
    ellipse(0, 0, i*R, i*R);
  }

  // REQ2: use loops here to draw many lines. Differnt lines have differnt theta values. 
  float theta = 0;
  float x1 = R*cos(theta), y1 = R*sin(theta);
  for (int i = 0; i < 12; i++) {
    stroke(i * 50, 100, 100);
    x1 = 2*R*cos(theta); 
    y1 = 2*R*sin(theta);
    line(0, 0, x1, y1);
    theta += PI/6;
  }
}
