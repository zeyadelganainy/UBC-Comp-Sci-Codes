//REQ: create a Hero class with the specs mentioned in the assignment document.
class Hero {

  //Attributes
  float x, y, scale, speedX, speedY;
  color torsoColor, beltColor;
  
  //Constructors
  Hero(){
    x = width/2;
    y = height/2;
    scale = 1;
    speedX = 1;
    speedY = 0;
    torsoColor = color(19,0,205);
    beltColor = color(0,255,255);
  }
  
  Hero(float x1, float y1, float scale1){
   x = x1;
   y = y1;
   scale = scale1;
   speedX = 1;
    speedY = 0;
    torsoColor = color(19,0,205);
    beltColor = color(0,255,255);
  }
  
  Hero(float x1, float y1, float scale1, float sx, float sy, color torsoClr, color beltClr){
   x = x1;
   y = y1;
   scale = scale1;
   speedX = sx;
   speedY = sy;
   torsoColor = torsoClr;
   beltColor = beltClr;
  }
  
  //Methods
  
  void move(){
    x += speedX;
    y += speedY;
    if(x >= width)
    x = - 350;
  }
  
  void display(){
    pushMatrix();
    translate(x,y);
    strokeWeight(5);
  rectMode(CENTER);
  textSize(50 * scale); 
  textAlign(CENTER);
  ellipseMode(CENTER);
  
  //Torso
  fill(torsoColor);
  rect(250 * scale, 300 * scale, 150 * scale, 200 * scale);

  //Head
  stroke(0, 72, 186);
  fill(124, 185, 232);
  ellipse(250 * scale, 100 * scale, 150 * scale, 180 * scale);

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
  fill(beltColor);
  rect(250 * scale, 360 * scale, 150 * scale, 20 * scale);
  popMatrix();
  }  
}
