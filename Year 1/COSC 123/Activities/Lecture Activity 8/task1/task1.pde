void setup(){
 size(300,250);
}
void draw() {
 background(255);
drawSpaceship(20,30,16,0);   //tiny spaceship
drawSpaceship(50,50,32,0.4);  //small spaceship
drawSpaceship(150,30,48,0.8); //medium spaceship
drawSpaceship(100,100,64,1.0); //big spaceship
}
void drawSpaceship(int x, int y, int size, float brightness) {
 // draw side guns
 rectMode(CENTER);
 stroke(255 * brightness, 90 * brightness, 90 * brightness);
 strokeWeight(1);
 fill(255 * brightness, 0, 0);
 rect(x-size/3, y+size/2, size/15, size/3);
 rect(x+size/3, y+size/2, size/15, size/3);
 // draw jet engine
 fill(255 * brightness, 180 * brightness, 0);
 rect(x, y+size, size/2, size/10);
 // draw main body
 stroke(0);
 fill(0, 50 * brightness, 155 * brightness);
 triangle(x,y,x+size/2,y+size,x-size/2, y+size);
 fill(0, 100 * brightness, 255 * brightness);
 ellipse(x, y+2*size/3, size/3, size/2);
}
