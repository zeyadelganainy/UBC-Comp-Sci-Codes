class HappyFace { 
  //attributes
  float x, y, r, speedX, speedY;
  color fillClr, outlineClr;

  //behavior
  void display() {  
    ellipseMode(CENTER);
    fill(fillClr);
    stroke(outlineClr);
    strokeWeight(r/20);
    ellipse(x, y, 2*r, 2*r);                
    //face
    arc(x, y, 1.6*r, 1.6*r, .1*PI, .9*PI); //mouth
    ellipse(x+r/2, y-r/4, r/4, r/2);     //right eye
    ellipse(x-r/2, y-r/4, r/4, r/2);     //left eye
  }

  void move() {
    x += speedX; y += speedY;
  }

  void bounce() {
    if(x > width - r || x < r) {speedX = -speedX;}   
    if(y > height - r || y < r) {speedY = -speedY;} 
  }
}
