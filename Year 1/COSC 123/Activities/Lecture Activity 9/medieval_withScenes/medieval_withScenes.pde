final int W=64, H=64;             //tile width and height
final int SPEED = 4;              //character speed: can only be 1,2,4,8,...(for alignmnet)
int speedX = 0;                   //+ve is right, -ve is left, 0 is not moving, can only be 1,2,4,8,..
int row;                          // for drawing
float x=5*W, y=6*H;               // character initially at 5th tile
float speedY = 0, gravity = 0.2;  // for jumping
boolean isJumping = false;
int scene = 0;

void setup(){
  size(512,512);
}

void draw(){
  if(scene == 0) scene0();
  else if(scene == 1) scene1();
}
