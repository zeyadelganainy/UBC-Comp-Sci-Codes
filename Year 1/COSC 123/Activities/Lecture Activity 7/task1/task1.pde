float x, y, x2, y2;

void setup() {
  size(200, 200);
  textSize(18);
  textAlign(CENTER, CENTER);
  frameRate(60);
}

void draw() {
  background(0);
  translate(100, 100);

  // draw clock face
  stroke(0, 255, 255);
  fill(8, 1, 75);
  ellipse(0, 0, 195, 195);

  // draw time numbers
  fill(0, 255, 255);    //Numbers color
  float angle = -PI/2;
  for (int i = 1; i <= 12; i++) {
    angle += PI/6;
    x = 85 * cos(angle);
    y = 85 * sin(angle);
    text(i, x, y);
  }

  // draw time ticks
  fill(0, 255, 255);
  angle = 0;
  for (int i = 1; i <= 60; i++) {
    angle += PI/30;
    x = 65 * cos(angle); 
    y = 65 * sin(angle);
    x2 = 70 * cos(angle);
    y2 = 70 * sin(angle);
    line(x, y, x2, y2);
  }
  // draw hours hand
  stroke(255, 0, 0);  
  strokeWeight(5);
  float angleleHours = hour() * PI/6 - PI/2;  // hours * 30 degrees
  x = 40 * cos(angleleHours);
  y = 40 * sin(angleleHours);
  line(0, 0, x, y);  

  // draw minutes hand
  stroke(0, 255, 0);  
  strokeWeight(2);
  float angleleMin = minute() * PI/30 - PI/2;  // minutes * 6 degrees
  x = 55 * cos(angleleMin);
  y = 55 * sin(angleleMin);
  line(0, 0, x, y);

  // draw seconds hand 
  stroke(255, 255, 0);
  strokeWeight(1);
  float angleleSec = second() * PI/30 - PI/2;  // seconds * 6 degrees
  x = 70 * cos(angleleSec);
  y = 70 * sin(angleleSec);
  line(0, 0, x, y);
}
