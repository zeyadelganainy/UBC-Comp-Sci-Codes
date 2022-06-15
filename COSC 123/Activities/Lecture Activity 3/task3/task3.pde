void setup() {
  size(200, 200);
  background(255);
  stroke(0);}
void draw() {
  /*I used the distance formula so that any change on any axis would be translated
  to the thickness of the line */
  
  strokeWeight(sqrt(pow(mouseX-pmouseX,2)+pow(mouseY - pmouseY,2))); 
  line(pmouseX, pmouseY, mouseX, mouseY);
}
