//Q3
float scale = 0;
float angle = 0;
float transparency = 255;

void setup() {
 size(500,500);
 textAlign(CENTER);
 rectMode(CENTER);
 strokeWeight(5);
 stroke(0,0,255);
}

void draw() {
  translate(width/2,height/2);
  rotate(angle);
  background(0); 
  rect(0,0,200+scale,200+scale);
  for(int i = 0; i < 3; i++){
  rotate(PI/6);
  rect(0,0,200+scale,200+scale);
  }
  ellipse(0,0,130+scale,130+scale); 
  stroke(50,100,255,transparency);
  fill(0,0,100,transparency);
  ellipse(0,0,120+scale,120+scale);
  stroke(0,0,255,transparency);
  fill(255,transparency);
  textSize(50 + scale/3);
  text("UBC",0,20);
  noFill();
  angle = angle + 0.03;
  scale++;
  transparency = transparency - 0.8;
}
