void setup() {
 size(500,500); 
}

void draw() {
 background(0);
 float x1 = constrain(mouseX, 0.25 * width, 0.75 * width);
 float x2 = constrain(mouseY, 0.25 * height, 0.75 * height);
 ellipse(x1, x2, 50, 50);
}
