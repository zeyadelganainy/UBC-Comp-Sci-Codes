
void setup() {
  size(300, 300);
  noStroke();
}
void draw() {
  translate(width/2, height/2);
  background(0);
  for (int t = 0; t < width; t += 20) {
    fill(0, 0, 255, t * 0.2);
    ellipse(0, 0, t, t);
  }
}
