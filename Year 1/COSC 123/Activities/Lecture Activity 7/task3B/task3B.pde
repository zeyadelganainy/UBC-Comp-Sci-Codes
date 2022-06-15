
void setup() {
  size(360, 100);
  noStroke();
  colorMode(HSB,360,100,100);
}
void draw() {
  background(0);
  for (int i = 0; i < width; i ++) {
    stroke(i,100,100);
    line(i,0,i,height);
  }
}
