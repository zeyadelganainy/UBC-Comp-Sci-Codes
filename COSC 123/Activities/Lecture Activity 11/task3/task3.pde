class ToggleButton {
 float x, y, w, h;  //x,y are the center of the button
 String onTxt, offTxt;
 boolean on = false, mouseOver = false;
 ToggleButton(float x,float y) {this(x,y,70,40,"ON","OFF");}
 ToggleButton(float x,float y,float w,float h,String onTxt,String offTxt){
   this.x = x;     this.y = y;    this.w = w;    this.h = h;
   this.onTxt = onTxt;     this.offTxt = offTxt;
 }
 void click(int mx, int my) {
   if(mx>x-w/2 && mx<x+w/2 && my>y-h/2 && my<y+h/2) on = !on;
 }
 void display() {
   rectMode(CENTER); textAlign(CENTER,CENTER); textSize(w/3);
   if (on) {
     stroke(0, 255, 0);   fill(0, 200, 0);  rect(x, y, w, h);
     fill(200, 255, 200); text("ON", x, y);
   } else {
     stroke(255, 0, 0);   fill(180, 0, 0);  rect(x, y, w, h);
     fill(100, 0, 0);     text("OFF", x, y);
   }
 }

}
