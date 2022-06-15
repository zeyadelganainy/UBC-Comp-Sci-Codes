//width and height of tiles (pixels)
int W=50, H=50;
PImage platform1, platform2, platform3, moon, character;

//alien variables
PImage alien;
float y = -25, x = 150, speedY = 1.6, y1 = constrain(y,-25,H*8);       
color background = color(0, 0, 0);

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
  moveAlien();
  displayAlien();
}

void moveAlien() {
  y1 += speedY;
  if (y1 > H * 8) {
    y1 = -25;
  }
}

void displayAlien() {
  image(alien, x, y1, 50, 50);
}
