//Variables for button 1 (HELP button)
int btn1_x = 150, btn1_y = 375;
color btn1_color = color(255, 64, 252);

void scene1() {
  /**
    The bug here is that it overlaps with any previous scene
    A fix for that would be to reset the background
  */
  background(0);
  fill(255);
  textSize(30);
  text("Game instructions are here...", width/2, height/2);
  drawButton(btn0_x, btn0_y, btn_w, btn_h, btn0_color, "HOME");
}
