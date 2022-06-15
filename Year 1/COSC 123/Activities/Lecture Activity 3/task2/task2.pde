void setup() { 
  size(500, 600);
  strokeWeight(5);
  rectMode(CENTER);
  ellipseMode(CENTER);
  textSize(50); 
  textAlign(CENTER); 
} 
 
void draw(){
  background(255);
  //Torso
  fill(211, 33, 45);
  rect(mouseX, mouseY, 150, 200); //(250,300)

  //Head
  stroke(0, 72, 186);
  fill(124, 185, 232);
  ellipse(mouseX, mouseY - 200, 150, 180);
  stroke(0);
  fill(255);

  //Limbs
  line(mouseX - 160, mouseY - 200, mouseX - 90, mouseY - 100);
  line(mouseX + 90, mouseY - 100, mouseX + 150, mouseY);
  line(mouseX - 30, mouseY + 120, mouseX - 60, mouseY + 220);
  line(mouseX + 30, mouseY + 120, mouseX + 60, mouseY + 220);

  //Logo Box
  triangle(mouseX - 40, mouseY - 80, mouseX + 40, mouseY - 80, mouseX, mouseY + 10); //(210,220,290,220,250,310)
  
  //Logo
  fill(0);
  text("Z", mouseX, mouseY - 30);

  //Belt
  fill(0, 48, 143);
  rect(mouseX, mouseY + 60, 150, 20);
}
