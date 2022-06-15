int x, y, len, col;
void setup() {
  size(360, 100);
  colorMode(HSB, 360, 100, 100);
}
void draw() {
  background(0);
  x=0; 
  y=0; 
  len=height;
  while (x < width) {
    stroke(x, 100, 100);
    line(x, y, x, y+len);
    x++;
    col++;
  }
}
