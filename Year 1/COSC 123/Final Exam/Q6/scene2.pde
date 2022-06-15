//Variables for button 2 (START button)
int btn2_x = 350, btn2_y = 375;
color btn2_color = color(31,66,255);

void scene2() {
  background(background);
  //default elems
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
  drawButton(btn0_x, btn0_y, btn_w, btn_h, btn0_color, "HOME");
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
