class Bubble{
 float x, y, radius, speedY; 
  
  Bubble(){
   x = random(0,width);
   y = random(height + 50, height + 750);
   radius = random(1,10);
   speedY = -10/radius;
  }
  
  void move(){
   x += random(-0.8,0.8);
   y += speedY;
   if(y < 0){
   x = random(0,width);
   y = random(height + 50, height + 750);
   radius = random(1,10);
   speedY = -10/radius;
   }
  
  }
  void display(){
    ellipse(x,y,radius,radius); 
   }
}
