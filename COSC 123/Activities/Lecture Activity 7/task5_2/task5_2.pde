size(400,400);
background(0);
strokeWeight(2);
stroke(255);

int y = 0; 
int x = 0;
while(y < height){
  while(x < width){
    fill(random(255));
    square(x,y,20);
    x+=20;
  }
  x = 0;
  y+=20;
}
