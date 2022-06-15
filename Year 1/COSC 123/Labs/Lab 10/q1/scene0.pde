//REQ: create variables here for the location and color of the PLAY button
float playX = 250, playY = 300;
color playCol = color(190,0,255);
  
void scene0(){  //home screen
  background(0);
  //REQ: Write code to draw a welcome message followed by PLAY button. 
  //     Remember that we have a function to draw buttons, i.e. drawButton()
  textSize(50);
  text("WELCOME",width/2,height/2 - 70);
  textSize(20);
  text("Press the button below",width/2, height/2 - 20);
  drawButton(playX, playY, 100, 50, playCol, "PLAY");
}
