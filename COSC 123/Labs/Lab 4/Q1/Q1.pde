void setup() {
  size(300, 300);
  strokeWeight(5);
  colorMode(HSB,360,100,100);
}

void draw() {
  background(0);
  noFill();
  stroke(0,0,100);

  //Dancer's body
  bezier(30, 50, mouseX, mouseY, width - mouseX, height - mouseY, 220, 270);
  bezier(270, 50, mouseX, mouseY, width - mouseX, height - mouseY, 80, 270);

  //Dancer's Head
  ellipse(140 + (mouseX * 0.1), 90 + (mouseY * 0.1), 50, 50);
  
  //Lights
  noStroke();
  fill(mouseY,100,100,100);
  ellipse(width - mouseX,mouseY,mouseX,mouseX);
  ellipse(width - mouseX,height - mouseY + 100,mouseX,mouseX);
  fill(width - mouseY, 100, 100, 100);
  ellipse(mouseX,mouseY, mouseX, mouseX);
  ellipse(mouseX,height - mouseY + 100, mouseX, mouseX);
}
