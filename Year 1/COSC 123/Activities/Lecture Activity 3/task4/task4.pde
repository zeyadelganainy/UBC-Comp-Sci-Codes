void setup() {
  size(500, 600);
  strokeWeight(5);
  rectMode(CENTER);
  textSize(50); 
  textAlign(CENTER);
  ellipseMode(CENTER);
}

void draw() {
  background(255);
  translate(mouseX, mouseY);
  //Torso
  fill(211, 33, 45);
  rect(250, 300, 150, 200);

  //Head
  stroke(0, 72, 186);
  fill(124, 185, 232);
  ellipse(250, 100, 150, 180);
  stroke(0);
  fill(255);

  //Limbs
  line(90, 100, 160, 200);
  line(340, 200, 400, 300);
  line(220, 420, 190, 520);
  line(280, 420, 310, 520);

  //Logo Box
  triangle(210, 220, 290, 220, 250, 310);

  //Logo
  fill(0);
  text("Z", 250, 270);

  //Belt
  fill(0, 48, 143);
  rect(250, 360, 150, 20);
}
