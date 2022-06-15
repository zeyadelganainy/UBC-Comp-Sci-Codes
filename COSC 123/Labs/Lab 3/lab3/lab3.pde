size(1000,1000);
background(255);
strokeWeight(5);
rectMode(CENTER);
ellipseMode(CENTER);
textAlign(CENTER);

//Body Outline
line(250,250,750,250);
line(250,250,230,750);
line(750,250,770,750);
line(500,600,470,750);
line(500,600,530,750);

//Collars
triangle(500,500,450,550,250,475);
triangle(500,500,550,550,750,475);

//Head
stroke(255,0,0);
fill(255,0,0);
ellipse(500,430,515,170);
quad(250,250,750,250,755,450,245,450);
stroke(0);
fill(255);
line(470,515,530,515); //To outline the beginning of the tie

//Eyes
noStroke();
ellipse(420,360,100,60);
ellipse(580,360,100,60);
stroke(0);
fill(0);
ellipse(430,350,60,40);
ellipse(570,350,60,40);

//Eyebrows
strokeWeight(25);
line(300,300,500,350);
line(700,300,500,350);
strokeWeight(5);

//Mouth
quad(420,420,580,420,620,480,380,480);
fill(255);
quad(430,420,570,420,550,450,450,450);
quad(570,450,430,450,400,480,600,480);

//Hands
fill(255,0,0);
ellipse(200,580,75,70);
bezier(200,580,180,600,210,610,235,590);
ellipse(800,580,75,70);
bezier(770,590,820,610,820,600,800,580);
fill(255);

//Sleeves
strokeWeight(6);
triangle(760,490,790,525,762,550);
quad(765,555,768,590,830,520,815,510);
triangle(238,490,210,525,238,550);
quad(238,555,236,590,190,520,200,510);
strokeWeight(5);

//Boots
fill(0);
rect(320,770,200,50,10);
rect(450,770,50,50,10);
rect(680,770,200,50,10);
rect(550,770,50,50,10);

//Pants
colorMode(HSB,360,100,100);
fill(295,100,70);
quad(500,600,470,750,230,750,238,600);
quad(500,600,530,750,770,750,764,600);

//Cuffs
fill(295,100,40);
rect(350,750,260,30);
rect(650,750,260,30);

//Belt
fill(#daa520);
rect(500,580,520,30);

//Belt loops
fill(295,100,70);
rect(400,580,30,30,7);
rect(600,580,30,30,7);

//Tie
colorMode(RGB,255,255,255);
fill(255,0,70);
quad(465,500,535,500,520,540,480,540);
quad(520,540,480,540,450,600,550,600);
quad(450,600,550,600,520,650,480,650);
stroke(255,0,70);
line(455,600,545,600); //Hiding line that splits the tie in half
fill(255);
stroke(0);
rect(500,595,20,105);

//Text
textSize(50);
fill(255,0,0);
text("ANGER",500,150);
textSize(30);
fill(150,0,0);
text("from the movie Inside Out",500,200);
