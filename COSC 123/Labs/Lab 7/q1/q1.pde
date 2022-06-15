//Q1
final int W=64, H=64;         //tile width and height
PImage bk, player, platform1, platform2, flag, ribbon1, ribbon2, ribbon3, banner1, banner2, banner3,banner_sword, castle_left,
castle_mid, castle_right, closed_window1, closed_window2, closed_window3, open_window1, open_window2, open_window3, small_window, top_left, top_mid, top_right, 
flame_right, flame_left, door_up1, door_up2, door_up3, door_mid1, door_mid2, door_mid3, door_bottom1, door_bottom2, door_bottom3, knight_small;
float speedX = 0, speedY = 0, x = 0, y = 6 * H, gravity = 0.2;
boolean isJumping = false;
void setup(){
  size(512,512);
  bk = loadImage("background_0.png");      
  player = loadImage("player_0.png");      
  platform1 = loadImage("platform_13.png"); platform2 = loadImage("platform_14.png");
  flag = loadImage("flagRed_up.png");
  ribbon1 = loadImage("medievalTile_023.png"); ribbon2 = loadImage("medievalTile_045.png"); ribbon3 = loadImage("medievalTile_069.png");
  banner1 = loadImage("medievalTile_026.png"); banner2 = loadImage("medievalTile_048.png"); banner3 = loadImage("medievalTile_072.png");
  banner_sword = loadImage("medievalTile_097.png");
  castle_left = loadImage("medievalTile_066.png"); castle_mid = loadImage("medievalTile_065.png"); castle_right = loadImage("medievalTile_068.png");
  small_window = loadImage("medievalTile_053.png"); knight_small = loadImage("medievalTile_119.png");
  top_left = loadImage("medievalTile_038.png"); top_mid = loadImage("medievalTile_020.png"); top_right = loadImage("medievalTile_039.png"); 
  flame_right = loadImage("medievalTile_187.png"); flame_left = loadImage("medievalTile_188.png"); 
  door_up1 = loadImage("medievalTile_201.png"); door_up2 = loadImage("medievalTile_202.png"); door_up3 = loadImage("medievalTile_203.png");
  door_mid1 = loadImage("medievalTile_224.png"); door_mid2 = loadImage("medievalTile_225.png"); door_mid3 = loadImage("medievalTile_226.png"); 
  door_bottom1 = loadImage("medievalTile_244.png"); door_bottom2 = loadImage("medievalTile_245.png"); door_bottom3 = loadImage("medievalTile_246.png");
}

void draw(){
  background(bk);
  float mx = constrain(mouseX,0,width);
  image(castle_left, W, 2 * H); image(castle_left, W, 3 * H); image(castle_mid, W, 4 * H);image(castle_mid, W, 5 * H); image(castle_mid, W, 6 * H);
  image(castle_right, 5 * W, 2 * H); image(castle_right,5 * W, 3 * H); image(castle_mid,5 *  W, 4 * H);image(castle_mid,5 * W, 5 * H); image(castle_mid,5 * W, 6 * H);
  image(castle_mid, 2 * W, 2 * H); image(castle_mid, 3 * W, 2 * H); image(castle_mid, 4 * W, 2 * H); image(castle_mid, 3 * W, 3 * H);
  image(small_window, 2 * W, 3 * H); image(small_window, 4 * W, 3 * H);
  image(door_up1, W * 2, 4 * H); image(door_up2, W * 3, 4 * H); image(door_up3, W * 4, 4 * H);
  image(door_mid1, W * 2, 5 * H); image(door_mid2, W * 3, 5 * H); image(door_mid3, W * 4, 5 * H);
  image(door_bottom1, W * 2, 6 * H); image(door_bottom2, W * 3, 6 * H); image(door_bottom3, W * 4, 6 * H);
  image(flame_left, 0, 3 * H); image(flame_right, 5.9 * W, 3 * H);
  image(ribbon1, 0, 4 * H); image(ribbon2, 0, 5 * H); image(ribbon3, 0, 6 * H);
  image(ribbon1, 5.9 * W, 4 * H); image(ribbon2, 5.9 * W, 5 * H); image(ribbon3, 5.9 * W, 6 * H);
  image(top_mid, W, H);
  for(int i = 1; i < 6; i++){
    image(top_mid, W * i, H);
  }
  image(knight_small, W * 3, 2 * H);
  image(banner1, W, 2 * H); image(banner2, W, 3 * H); image(banner_sword, W, 4 * H); image(banner3, W, 5 * H); 
  image(banner1, 5 * W, 2 * H); image(banner2,5 * W, 3 * H); image(banner_sword,5 *  W, 4 * H);image(banner3,5 * W, 5 * H);
  
  image(player, mx + speedX, y + speedY , 64, 64);
  for(int i = 0; i < 6; i++){
    image(platform1, (64 * i), 7 * H);
  }
  image(flag, 220, 40);
  image(platform2, width - 128, 7 * H);
  if(isJumping){
    speedY += gravity;
    y += speedY;
    if( y > 6 * H) {
      speedY  = 0;
      y = 6 * H;
      isJumping = false;
    }
  }
  x += speedX;
}

void keyPressed() {
  if(key == ' ' && !isJumping){
    isJumping = true;
    speedY -= 5;
  }
}
