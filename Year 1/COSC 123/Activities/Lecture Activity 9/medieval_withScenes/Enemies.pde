//All enemies in this code have been imported from https://kenney.nl/assets/platformer-art-extended-enemies

class GroundE{
  float groundX = 500, groundY = 6.4 * H, gSpeedX;
  PImage gEnemy;
  
  void drawEnemy(String name){
    gEnemy = loadImage(name);
  }
  void move(){
    groundX -= gSpeedX;
    image(gEnemy, groundX ,groundY);
}
}

class FlyingE{
  float flyingX = 500, flyingY, fSpeedX;
  PImage fEnemy;
  
    void drawEnemy(String name){
      fEnemy = loadImage(name);
      image(fEnemy,flyingX ,flyingY);
    }
    void move(){
    flyingX -= fSpeedX;
}
}
