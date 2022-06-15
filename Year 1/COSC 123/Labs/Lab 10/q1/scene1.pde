//REQ: create variables here for the location and color of the PLAY button
float homeX = 60, homeY = 460;
color homeCol = color(0,255,0);
  
//REQ: put here any other variables required by your A9_Q1 animation 
 float a = 1, b = 1;
 float m1 = 2, m2 = 10;
 float n1 = 1.5, n2 = 1, n3 = 1;

void scene1() {
  A9_Q1();  //calling this function should draw the output of A9.Q1
  //REQ: In addition to A9.Q1, also draw HOME button on this scene
  drawButton(homeX,homeY,100,50,homeCol,"HOME");
}

void A9_Q1(){
  pushMatrix();
  colorMode(HSB,360,100,100);
  translate(width/2,height/2);
  background(0);
  supershape(a,b,2,10,1.5,n2,n3);
  supershape(a,b,88,64,-20,n2,n3);
  popMatrix();
}
void supershape(float a, float b, float m1, float m2, float n1, float n2, float n3){
  for(float theta = 0; theta <= 2 * PI; theta+=0.001){
    stroke(60 * theta,100,100);
    float r = pow( pow(abs((cos(m1*theta/4))/a),n2) + pow(abs(sin(m2 * theta/4)/b),n3),(-1/n1));
    float x = 100 * r * cos(theta);
    float y = 100 * r * sin(theta);
    point(x,y);
  }
}
