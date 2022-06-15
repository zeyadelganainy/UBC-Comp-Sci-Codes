void setup() {
  size(500, 600);
}

void draw() {
  background(255);
  drawSuperhero(0,0,0.5,color(211, 33, 45),color(0, 48, 143));
  drawSuperhero(200,200, 0.7, color(0,255,255), color(255,255,0));
  drawSuperhero(0,300, 0.6, color(234,123,12), color(21,123,33));
}
void drawSuperhero(int x,int y, float scale, color c1, color c2){
  pushMatrix();
  translate(x,y);
  strokeWeight(5);
  rectMode(CENTER);
  textSize(50 * scale); 
  textAlign(CENTER);
  ellipseMode(CENTER);
  
  //Torso
  fill(c1);
  rect(250 * scale, 300 * scale, 150 * scale, 200 * scale);

  //Head
  stroke(0, 72, 186);
  fill(124, 185, 232);
  ellipse(250 * scale, 100 * scale, 150 * scale, 180 * scale);
  stroke(0);
  fill(255);

  //Limbs
  line(90 * scale, 100 * scale, 160 * scale, 200 * scale);
  line(340 * scale, 200 * scale, 400 * scale, 300 * scale);
  line(220 * scale, 420 * scale, 190 * scale, 520 * scale);
  line(280 * scale, 420 * scale, 310 * scale, 520 * scale);

  //Logo Box
  triangle(210 * scale, 220 * scale, 290 * scale, 220 * scale, 250 * scale, 310 * scale);

  //Logo
  fill(0);
  text("Z", 250 * scale, 270 * scale);

  //Belt
  fill(c2);
  rect(250 * scale, 360 * scale, 150 * scale, 20 * scale);
  
  popMatrix();
}
