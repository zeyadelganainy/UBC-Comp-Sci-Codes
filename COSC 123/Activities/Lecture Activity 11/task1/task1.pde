float counter1, counter2;

void setup(){
 size(500,500); 
 colorMode(HSB,360,100,100);
 ellipseMode(CENTER);
 noStroke();
 background(360);
}

void draw(){
  fill(counter1,100,100);
  ellipse(mouseX,mouseY,counter2,counter2);
  counter1+= 4;
  counter2 += 0.5;
}
