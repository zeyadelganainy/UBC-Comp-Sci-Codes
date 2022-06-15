//this is the main game scene
FlyingE beeyonce = new FlyingE();
FlyingE fly = new FlyingE();
FlyingE casper = new FlyingE();
FlyingE ladyBug = new FlyingE();
FlyingE bat = new FlyingE();

GroundE spider = new GroundE();
GroundE mouse = new GroundE();
GroundE frog = new GroundE();

void scene1() {
  scene = 1;
  drawBackground();
  drawPlayer(); 
  drawPlatform(); 
  movePlayer(speedX, speedY);
  jumpPlayer();

  //Flying Enemies
  beeyonce.fSpeedX = 2; 
  beeyonce.flyingY = 2 * H; 
  beeyonce.drawEnemy("bee.png"); 
  beeyonce.move();
  fly.fSpeedX = 3; 
  fly.flyingY = 4 * H; 
  fly.drawEnemy("fly.png"); 
  fly.move();
  casper.fSpeedX = 1; 
  casper.flyingY = 2 * H; 
  casper.drawEnemy("ghost.png"); 
  casper.move();
  ladyBug.fSpeedX = 2; 
  ladyBug.flyingY = 5 * H; 
  ladyBug.drawEnemy("ladyBug_fly.png"); 
  ladyBug.move();
  bat.fSpeedX = 1; 
  bat.flyingY = 4 * H; 
  bat.drawEnemy("bat.png"); 
  bat.move();
  //Ground Enemies
  spider.gSpeedX = 1; 
  spider.drawEnemy("spider.png"); 
  spider.move();
  mouse.gSpeedX = 2;
  mouse.drawEnemy("mouse.png");
  mouse.move();
  frog.gSpeedX = 1.5;
  frog.drawEnemy("frog.png");
  frog.move();
  
}  
void drawBackground() {
  background(loadImage("background_0.png"));
}
void drawPlayer() {
  image(loadImage("gameTile_15.png"), x, y);
}
void drawPlatform() {
  PImage tile13 = loadImage("gameTile_13.png"); 
  for (int col=0; col<6; col++)
    image(tile13, col*W, 7*H);  
  image(loadImage("gameTile_14.png"), 6*W, 7*H);
}
void movePlayer(int speedX, float speedY) {
  x += speedX;
  y += speedY;
}
void jumpPlayer() {
  if (isJumping) {
    y= y + speedY;
    speedY = speedY + gravity;
    if (y >= 6*H) {
      speedY = 0;
      isJumping = false;
      y = 6*H;
    }
  }
}
