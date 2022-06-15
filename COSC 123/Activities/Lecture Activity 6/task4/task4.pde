void setup() {
 size(500,500); 
}

void draw() {
 background(0);
 float x1 = map(mouseX, 0, width, 0.25 * width, 0.75 * width);
 float x2 = map(mouseY, 0, height, 0.25 * height, 0.75 * height);
 ellipse(x1, x2, 50, 50);
}
