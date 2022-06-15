//width and height of tiles (pixels)
int W=50, H=50;
PImage platform1, platform2, platform3, moon, character;
GroundEnemies[] g_enemy = new GroundEnemies[2];
FlyingEnemies[] f_enemy = new FlyingEnemies[2];
//alien variables
PImage alien;
float y = -25, x = 150, speedY = 1.6;       
color background = color(0, 0, 0);

void setup() {
  size(500, 500);
  alien = loadImage("alien.png");
  platform1 = loadImage("platform1.png");
  platform2 = loadImage("platform2.png");
  platform3 = loadImage("platform3.png");
  moon = loadImage("moon.png");
  character = loadImage("character.png");
  for(int i = 0; i < 2; i++){
   g_enemy[i] = new GroundEnemies();
   f_enemy[i] = new FlyingEnemies();
  }
  
}
void draw() {
  background(background);
  for(int i = 0; i < 2; i++){
     g_enemy[i].moveEnemy();
     g_enemy[i].displayEnemy();
     f_enemy[i].moveEnemy();
     f_enemy[i].displayEnemy();
  }
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
  y += speedY;
  if (y > height) {
    y = -25;
  }
}

void displayAlien() {
  image(alien, x, y, 50, 50);
}

class FlyingEnemies {
  float speed, x, offset,  y = noise(offset) + H;
  color bodyCol;

  FlyingEnemies() {
    x = width/2;
    y = height/2;
    speed = 1;
    offset = 2;
    bodyCol = color(0, 255, 0);
  }

  FlyingEnemies(float s, float off, color bodyColor) {
    x = random(0, width);
    speed = s;
    offset = off;
    bodyCol = bodyColor;
  }
  void moveEnemy() {
    y += speed;
    if (y>height-50 ||y<50) 
      speed=-speed;
  }

  void displayEnemy() {
    fill(bodyCol);
    triangle(x, y+10, x-50, y+10, x-25, y-20);
    fill(255);
    ellipse(x-30, y-5, 10, 10);
    ellipse(x-20, y-5, 10, 10);
  }
}
class GroundEnemies {
  float speed, x = 0;
  color bodyCol;
  GroundEnemies() {
    speed = 1;
    x = 0;
    bodyCol = color(255, 0, 0);
  }
  GroundEnemies(float s, color bodyColor) {
    x = 0;
    speed = s;
    bodyCol = bodyColor;
  }
  void moveEnemy() {
    x += speed;
    if (x > W * 5) {
      x = 0;
    }
  }

  void displayEnemy() {
    fill(bodyCol);
    square(x-20, H*8, 50);
    fill(255);
    ellipse(x, (H*8)+10, 10, 10);
    ellipse(x+20, (H*8)+10, 10, 10);
  }
}
