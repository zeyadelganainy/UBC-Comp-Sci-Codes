float ship_x = 0, ship_y = 360;
float bullet_x = 0, bullet_y = 375; 
boolean bullet_active = false;
float enemy_x = 200, enemy_y = 0, enemy_size = 40, bullet_len = 10;
int score = 0;
PImage player, enemy, bullet, // imported from https://kenney.nl/assets/space-shooter-redux
crosshair;                     // imported from https://kenney.nl/assets/crosshair-pack
void setup() {
  size(400, 400); 
  stroke(255); 
  strokeWeight(3);
  imageMode(CENTER);
  noCursor();
}
void draw() {
  background(0);
  crosshair = loadImage("crosshair049.png");
  text("Score: " + score, 20, 20);
  //game loop
  moveSpaceship();
  moveBullet();
  moveEnemey();
  detectCollisions();
  displayBullet();
  displaySpaceship();
  displayEnemy();
  image(crosshair,mouseX,mouseY, 30, 30);
}
void moveSpaceship() { 
  ship_x = mouseX;
}
void moveEnemey() {
  enemy_y+= 0.3;
  enemy_x = 200+100*sin(map(enemy_y, 0, height, 0, 8*PI));
}
void moveBullet() {
  if (bullet_active) {
    bullet_y-=6;
    if (bullet_y<0) bullet_active = false;
  } else {
    bullet_x = ship_x; 
    bullet_y = ship_y;
  }
}
void displaySpaceship() {
  player = loadImage("playerShip2_blue.png");
  image(player, ship_x, ship_y);
}
void displayBullet() {
  stroke(0);
  line(bullet_x, bullet_y, bullet_x, bullet_y+ bullet_len);
  bullet = loadImage("fire05.png");
  image(bullet, bullet_x, bullet_y);
  }
void displayEnemy() {
  enemy = loadImage("enemyRed2.png");
  image(enemy, enemy_x, enemy_y, enemy_size, enemy_size);
}
void detectCollisions() {
  if (dist(bullet_x, bullet_y, enemy_x, enemy_y)<enemy_size/2) { //not accurate
    bullet_active = false; 
    score++;
  }
}
void mouseReleased() {
  bullet_active = true;
}
