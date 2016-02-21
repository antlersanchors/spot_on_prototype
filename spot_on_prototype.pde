Token token;

ArrayList<Token> tokens = new ArrayList<Token>();

void setup(){
	size(800, 800);

	tokens.add( new Token(150, 150, 150, 150));
}

void draw(){

	color(125,125,125);

	ellipse(width/2,height/2,650,650);
	ellipse(width/2,height/2,450,450);
	ellipse(width/2,height/2,250,250);
	ellipse(width/2,height/2,75,75);

	for (int i=0; i < tokens.size(); i++){
		Token currentToken = tokens.get(i);
		currentToken.display();
	}
}

void keyPressed() {
	float diameter;

	for (int i=0; i < tokens.size(); i++){
		Token currentToken = tokens.get(i);
		
		currentToken.fillColor = color(0,255,0);
		println("keypressed! ");
	}
}

void mousePressed() {
	tokens.add(new Token(int(random(0,width)),int(random(0, height)),150,150));
}
