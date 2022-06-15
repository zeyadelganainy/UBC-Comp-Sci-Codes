HappyFace face1 = new HappyFace();
HappyFace face2 = new HappyFace();

void settings(){
  size(500,500);
}

void setup(){
  face1.x = width/2;
  face1.y = height/2;
  face1.r = width/4;
  face1.fillClr = color(255,255,0);
  face1.speedX = 2;
  face1.speedY = 2;
  
  face2.x = 50;
  face2.y = 50;
  face2.r = 20;
  face2.fillClr = color(0,255,255);
  face2.speedX = 5;
  face2.speedY = 5;
  
}
void draw(){
  background(255);
  face1.move(); face1.bounce(); face1.display();
  face2.move(); face2.bounce(); face2.display();
}
