float speedX = 1, speedY = 2;
float x=20, y=100, r = 20;
color strokeColor = color(255);
color currentBackgroundColor;
void setup() {
  size(200, 200);
  currentBackgroundColor = backgroundColor();
}
void draw() {
  background(currentBackgroundColor);
  moveBall();
  checkCollisions();
  drawBall();
}
void moveBall() {
  x += speedX;
  y += speedY;
}
void checkCollisions() {
  if ( x > width-r || x < r ) {
    speedX = -1 * speedX;
    currentBackgroundColor = backgroundColor();
  }
  if (y > height-r || y < r) {
    speedY = -1 * speedY;
    currentBackgroundColor = backgroundColor();
  }
}
void drawBall() {
  stroke(strokeColor);
  strokeWeight(r/7);
  ellipse(x, y, 2*r, 2*r);
}

color backgroundColor() {
  color backgroundColor = color(random(255), random(255), random(255));
  return backgroundColor;
}
