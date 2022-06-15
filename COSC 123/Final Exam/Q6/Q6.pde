//width and height of tiles (pixels)
int W=50, H=50;
PImage platform1, platform2, platform3, moon, character;
//alien variables
PImage alien;
float y = -25, x = 150, speedY = 1.6;       
color background = color(0, 0, 0);
int scn = 0; //this variable is used to track which scene is currently active
int btn_w = 100, btn_h = 40;  //width and height of each button 
void setup() {
  size(500, 500);
  //default
  alien = loadImage("alien.png");
  platform1 = loadImage("platform1.png");
  platform2 = loadImage("platform2.png");
  platform3 = loadImage("platform3.png");
  moon = loadImage("moon.png");
  character = loadImage("character.png");
}
void draw() {
 
  switch(scn) {
  case 0: //home screen
    scene0(); 
    break;
  case 1: //help
    scene1();
    break;
  case 2: //game platform
    scene2();
    break;
  }
}
