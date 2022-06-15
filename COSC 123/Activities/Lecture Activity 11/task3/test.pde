ToggleButton[] buttons;

public void settings() {
  size(200, 300);
}
void setup(){
 buttons = new ToggleButton[4];
 buttons[0] = new ToggleButton(width/2,50);
 buttons[1] = new ToggleButton(width/2,100);
 buttons[2] = new ToggleButton(width/2,150);
 buttons[3] = new ToggleButton(width/2,200);
}

void draw(){
 background(0);
 for(int i = 0; i < 4; i++){
   buttons[i].display();
 }
}
void mouseClicked(){
  for(int i =0; i < 4; i++)
  buttons[i].click(mouseX,mouseY);
}
