void keyPressed(){
  //move right/left
  if(keyCode == RIGHT)            speedX = SPEED;
  else if(keyCode == LEFT)        speedX = -SPEED;
  //jump
  if(keyCode == ' ' && !isJumping) {isJumping = true; speedY = -5;}
  
  if(scene == 0 && key == 'P'){scene = 1;} 
  if(scene == 0 && key == 'E'){exit();}
  if(scene == 1 && key == 'M'){scene = 0;}
}

void keyReleased(){
  if(keyCode == RIGHT || keyCode == LEFT)
    speedX = 0;
}
