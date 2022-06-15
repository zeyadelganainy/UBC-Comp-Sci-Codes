Bubble[] bubbles = new Bubble[250];

public void settings() {
  size(200, 500);
  for(int i = 0; i < 250; i++)
   bubbles[i] = new Bubble();
}


void draw(){
  background(0); 
  for(int i = 0; i < 250 ; i++){
   bubbles[i].move();
   bubbles[i].display();
 }
}
