//REQ: create a Button class here with the specs mentioned in the assignment document.
class Button {

  //Attributes
  float  x, y, w, h;
  String caption;
  color fillColor;

  //Constructors
  Button() {
    w = 100;
    h = 50;
    x = 250;
    y = 300;
    caption = "TEXT";
    fillColor = color(255, 255, 0);
  }

  Button(float x1, float y1, float w1, float h1, String cptn, color fillClr) {
    x = x1;
    y = y1;
    w = w1;
    h = h1;
    caption = cptn;
    fillColor = fillClr;
  }

  //Methods
  boolean mouseOver() {
    if ((mouseX > x && mouseX < (x + w)) && (mouseY > y && mouseY < (y+h))) {
      return true;
    }
    return false;
  }

  void display() {
    fill(fillColor);
    stroke(255);
    strokeWeight(1);
    rectMode(CENTER);
    textAlign(CENTER, CENTER);
    textSize(h/2);
    rect(x, y, w, h);
    fill(255);
    text(caption, x, y);
  }
}
