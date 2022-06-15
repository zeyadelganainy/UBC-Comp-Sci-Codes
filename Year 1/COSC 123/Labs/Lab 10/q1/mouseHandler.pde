void mousePressed(){
//REQ: Put code here to handle the mouse clicks on the buttons in different scenes
//     Note that you need to identify which scene is active, 
//     and then check if the mouse is clicked on the button

//...YOUR CODE GOES HERE...
  if(scn == 0 && (mouseX > playX && mouseX < playX + 100) && (mouseY > playY && mouseY < playY + 50) ){
     scn = 1;
  }
  if(scn == 1 && (mouseX > homeX && mouseX < homeX + 100) && (mouseY > homeY && mouseY < homeY + 50) ) {
    scn = 0;
  }
}
