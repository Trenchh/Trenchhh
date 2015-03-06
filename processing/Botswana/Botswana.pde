/*
 * Name: Botswana Flag
 * Date: March 5th, 2015
 * Version: v0.2
 * Author: Ryan Protheroe
*/

final int boxWidth  = (800);
final int boxHeight = (500);
int boxXLocation = (150);
int boxYLocation = (125);

//Window Size
size(1100, 800);

//Blue rectangle
noStroke();
fill(6,105,201);
rect(boxXLocation, boxYLocation, boxWidth, boxHeight);

//White rectangle
noStroke();
fill(255,255,255);
rect(boxXLocation, boxYLocation + 175, boxWidth, boxHeight - 350);

//Black rectangle
noStroke();
fill(0,0,0);
rect(boxXLocation, boxYLocation + 200, boxWidth, boxHeight - 400);

