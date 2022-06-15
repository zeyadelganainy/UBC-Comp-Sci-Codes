void scene0(){  //home screen
  background(0);
  //REQ: copy your code from A7 (and make any necessary changes) to display a welcome message followed by the PLAY button. 
  //     The PLAY button must be drawn using the Button's display function.
  textSize(50);
  text("WELCOME",width/2,height/2 - 30);
  textSize(20);
  text("Press the button below",width/2, height/2 + 10);
  b0.display();
}
