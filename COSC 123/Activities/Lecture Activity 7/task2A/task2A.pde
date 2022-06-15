int spacing = 5, x, y, d, t, len;
void setup() {
  size(500, 600);
  background(0);
  ellipseMode(CENTER);
  noFill();
}
void draw() {
  x = 250; y = 300; t = 255;
  while (d < width) {
  fill(0,0,255,t);
    ellipse(x,y,d,d); 
  d += spacing;
  t -= 4;
  }
}
