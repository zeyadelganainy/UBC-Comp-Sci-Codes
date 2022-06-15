//width and height of tiles (pixels)
int W=50, H=50;
PImage platform1, platform2, platform3, moon, character;

//alien variables
PImage alien;
float y = -25, x = 150, speedY = 1.6;       
color background = color(0, 0, 0);
int path = 0;

void setup() {
  size(500, 500);
  alien = loadImage("alien.png");
  platform1 = loadImage("platform1.png");
  platform2 = loadImage("platform2.png");
  platform3 = loadImage("platform3.png");
  moon = loadImage("moon.png");
  character = loadImage("character.png");
}
void draw() {
  background(background);
  image(platform1, 0, H*9);
  image(platform1, W, H*9);
  image(platform1, W*2, H*9);
  image(platform1, W*3, H*9);
  image(platform1, W*4, H*9);
  image(platform3, W*5, H*9);
  image(platform2, W*8, H*9);
  image(platform1, W*9, H*9);
  image(moon, W, H);
  image(character, mouseX, H*8); 
  setMotionPath();
  moveAlien();
  displayAlien();
}

void moveAlien() {
  switch(path){
    case 1: y += speedY; break;
    case 2: y+= 0.5; x = 50+100*sin(map(y, 0, height, 0, 8*PI)); break;
    case 3: speedY = 0; x += 5;
  
}
  if (x > width) {
    y = -25;
    speedY = 1.6;
    x = 150;
    path = 1;
  }
}

void displayAlien() {
  image(alien, x, y, 50, 50);
}

void setMotionPath(){
  if(y <= 150)
    path = 1;
    else if(y > 150 && y < 400)
    path = 2;
    else
    path = 3;
}
