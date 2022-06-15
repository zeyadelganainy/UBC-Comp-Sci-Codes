void mousePressed() {
 /** 
   The bug here is in the case of 0, the scene played when the button 2 was clicked
   is scence 0 which is the current one therefore nothing happens. To fix it, set 
   scene to 2 when button 2 is clicked
 */
  
  switch(scn) {
  case 0:   //in home screen
    if (mouseX>btn1_x-btn_w/2 && mouseX<btn1_x+btn_w/2 && mouseY>btn1_y-btn_h/2 && mouseY<btn1_y+btn_h/2) scn = 1;
    if (mouseX>btn2_x-btn_w/2 && mouseX<btn2_x+btn_w/2 && mouseY>btn2_y-btn_h/2 && mouseY<btn2_y+btn_h/2) scn = 2;
    break;
  case 1:   //in scene 1
    if (mouseX>btn0_x-btn_w/2 && mouseX<btn0_x+btn_w/2 && mouseY>btn0_y-btn_h/2 && mouseY<btn0_y+btn_h/2) scn = 0;
    break;
  case 2:   //in scene 2
    if (mouseX>btn0_x-btn_w/2 && mouseX<btn0_x+btn_w/2 && mouseY>btn0_y-btn_h/2 && mouseY<btn0_y+btn_h/2) scn = 0;    
    break;
  }
}
