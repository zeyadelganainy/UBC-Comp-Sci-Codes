//Variables for button 0 (HOME button)
int btn0_x = 70, btn0_y = 475;
color btn0_color = color(160, 100, 180);

void scene0() {  //home screen
  background(0);
  fill(255);
  textSize(40);
  text("Platform shooter!", width/2, height/3);
  drawButton(btn1_x, btn1_y, btn_w, btn_h, btn1_color, "HELP");
  drawButton(btn2_x, btn2_y, btn_w, btn_h, btn2_color, "START");
}
