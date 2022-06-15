
size(400,400); 

int i =0; int j = 0;
for(int y = 0; y < width; y +=20){
  for(int x = 0; x < height; x+=20){
    fill(i);
    stroke(j);
    square(x,y,20);
  }
  i +=5;
  j += 10;
}
