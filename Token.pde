class Token {
  int x;
  int y;
  int w;
  int h;

  color fillColor = color (220,15,15);
  
  Token(int tempX, int tempY, int tempH, int tempW){
    x = tempX;
    y = tempY;
    h = tempH;
    w = tempW;
    
    fill(fillColor);
  }
  
  void display() {
    ellipse(x, y, w, h);
  }
};