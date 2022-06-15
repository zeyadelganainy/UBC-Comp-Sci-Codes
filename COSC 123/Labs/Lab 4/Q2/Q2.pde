void setup() {
  size(600,600);
  rectMode(CENTER);
  noCursor();
}

void draw(){
  pushMatrix();
  background(0);
  stroke(255);
  fill(255,70);
  rotate(PI/4);
  
  //Planet Rings
  stroke(255,255,0);
  noFill();
  arc(600, 40, 50, 200, PI/2, 3 * PI/2);
  arc(600,40,40, 160, PI/2, 3 * PI/2);
  fill(0);
  ellipse(600,40,100,100);
  fill(255,255,0,80);
  ellipse(600,40,100,100);
  noFill();
  arc(600,40,50,200, -PI/2, PI/2);
  arc(600,40,40,160,-PI/2,PI/2);
  
  popMatrix();
  translate(mouseX,mouseY);    //Center of my spaceship is (250,240)
  
  //Center
  fill(100,100,255,80);
  triangle(0,-40,-20,20,20,20);      //triangle(250,200,230,260,270,260);
  fill(105,170,255,80);
  ellipse(0,0,20,30);                //ellipse(250,240,20,30);
  
  //Ship body
  quad(-20,20,20,20,10,40,-10,40);   //quad(230,260,270,260,260,280,240,280);
  rect(-40,-5,20,30);                //rect(210,235,20,30);
  rect(40, -5,20,30);                //rect(290,235,20,30);
  quad(20,20,10,40,50,10,30,10);     //quad(270,260,260,280,300,250,280,250);
  quad(-20,20,-10,40,-50,10,-30,10); //quad(230,260,240,280,200,250,220,250);
  
  //Guns
  fill(0,225,255);
  rect(-40,-40,5,40);                //rect(210,200,5,40);
  rect(40,-40,5,40);                 //rect(290,200,5,40);
  
}
