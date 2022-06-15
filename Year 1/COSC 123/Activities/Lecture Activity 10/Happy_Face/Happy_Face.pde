HappyFace f1, f2, f3;

void setup(){
  size(200,200);
  f1 = new HappyFace(100,100,50,2,1,color(255,0,0),color(0,255,255));
  f2 = new HappyFace(50,50,30,3,3,color(255,255,0),color(255,0,0));
  f3 = new HappyFace(150,100,20,5,5,color(0,150,255),color(0,255,0));
}

void draw(){
  background(0);
  f1.move(); f1.bounce(); f1.display();
  f2.move(); f2.bounce(); f2.display();
  f3.move(); f3.bounce(); f3.display();
}

class HappyFace { 
  //attributes
  float x, y, r, speedX, speedY;
  color fillClr, outlineClr;
  
  //Constructors
  HappyFace(){
   r = 50;
   x = r;
   y = r;
   speedX = 0;
   speedY = 0;
   fillClr = color(255,255,0);
   outlineClr = color(255,150,0);
  }
  HappyFace(float x, float y, float r, float speedX, float speedY, color fillColor, color outlineColor){
   this.x = x; 
   this.y = y;
   this.r = r;
   this.speedX = speedX;
   this.speedY = speedY;
   fillClr = fillColor;
   outlineClr = outlineColor;
  }
  
  //behavior
  void display() {  
    ellipseMode(CENTER);
    fill(fillClr);
    stroke(outlineClr);
    strokeWeight(r/20);
    ellipse(x, y, 2*r, 2*r);                
    //face
    arc(x, y, 1.6*r, 1.6*r, .1*PI, .9*PI); //mouth
    ellipse(x+r/2, y-r/4, r/4, r/2);     //right eye
    ellipse(x-r/2, y-r/4, r/4, r/2);     //left eye
  }

  void move() {
    x += speedX; y += speedY;
  }

  void bounce() {
    if(x > width - r || x < r) {speedX = -speedX;}   
    if(y > height - r || y < r) {speedY = -speedY;} 
  }
}
