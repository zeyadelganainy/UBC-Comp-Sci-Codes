size(400,400);
background(0);
strokeWeight(2);
stroke(255);

for(int y = 0; y < height; y+=20){
  for(int x = 0; x < width; x +=20){
    fill(random(255));
    square(x,y,20);
  }
}
