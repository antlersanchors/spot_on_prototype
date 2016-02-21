

class Token{
  int x;
  int y;
  int w;
  int h;
  
  Token(int tempX, int tempY, int tempH, int tempW){
    x = tempX;
    y = tempY;
    h = tempH;
    w = tempW;
    
    color = red;
  }
  
  void display{
    
    
  }
};

Token token;

void setup(){
 size(800, 800);
 
 token = new Token(150, 150, 150, 150); 
}

void draw(){
 
 color(125,125,125);
 
 ellipse(width/2,height/2,650,650);
 ellipse(width/2,height/2,450,450);
 ellipse(width/2,height/2,250,250);
 ellipse(width/2,height/2,75,75);
  
}
