final int W=64, H=64;         //tile width and height
PImage bk, player, platform1, platform2;

void setup(){
  size(512,512);
  bk = loadImage("background_0.png");      // 512 x 512
  player = loadImage("player_0.png");      // 64 x 64
  platform1 = loadImage("platform_13.png");// 64 x 64
  platform2 = loadImage("platform_14.png");// 64 x 64
}

void draw(){
  background(bk);
  image(player, mouseX, 6*H , 64, 64);
  for(int i = 0; i < 6; i++){
    image(platform1, 64 * i, 7 * H);
  }
  image(platform2, width - 128, 7 * H);
}
