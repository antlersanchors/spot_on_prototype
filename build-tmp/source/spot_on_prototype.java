import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class spot_on_prototype extends PApplet {

Token token;

ArrayList<Token> tokens = new ArrayList<Token>();

public void setup(){
	

	tokens.add( new Token(150, 150, 150, 150));
}

public void draw(){

	color(125,125,125);

	ellipse(width/2,height/2,650,650);
	ellipse(width/2,height/2,450,450);
	ellipse(width/2,height/2,250,250);
	ellipse(width/2,height/2,75,75);

	mouseCheck();

	for (int i=0; i < tokens.size(); i++){
		Token currentToken = tokens.get(i);
		currentToken.display();
	}
}

public void mouseCheck() {
	float diameter;
	float tokenX;
	float tokenY;

	for (int i=0; i < tokens.size(); i++){
		Token currentToken = tokens.get(i);

		tokenX = currentToken.x;
		tokenY = currentToken.y;
		diameter = currentToken.d;

		if( mouseX >= tokenX-(diameter/2) && mouseX <= tokenX+(diameter/2)
			&& mouseY >= tokenY-(diameter/2) && mouseY <= tokenY+(diameter/2) ){

			currentToken.fillColor = color(0,255,0);
			println("mouseover!: " + i );
		}
	}
}

// Just playin\u2019
public void keyPressed() {
	float diameter;

	for (int i=0; i < tokens.size(); i++){
		Token currentToken = tokens.get(i);
		
		currentToken.fillColor = color(0,255,0);
		println("keypressed! ");
	}
}

public void mousePressed() {
	tokens.add(new Token(PApplet.parseInt(random(0,width)),PApplet.parseInt(random(0, height)),150,150));
}
class Token {
  int x;
  int y;
  int d;

  int fillColor;
  
  Token(int tempX, int tempY, int tempH, int tempW){
    x = tempX;
    y = tempY;
    d = tempH;
    d = tempW;

    fillColor = color(220, 15, 15);
    
  }
  
  public void display() {
    fill(fillColor);
    ellipse(x, y, d, d);
  }
};
  public void settings() { 	size(800, 800); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "spot_on_prototype" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
