//VARIABLES
int xLocation = 50;
int yLocation = 50;
int pacSize = 90;
int eyeSize = 10;

//YELLOW CIRCLE
fill(254,255,36);
arc(xLocation, yLocation, pacSize, pacSize, radians(120), radians(360));
arc(xLocation, yLocation, pacSize, pacSize, radians(0), radians(60));

//EYE
fill(0,0,0);
ellipse(xLocation * .5, yLocation * 1.3, eyeSize, eyeSize);
