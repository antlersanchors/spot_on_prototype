class Token {
  int x;
  int y;
  int d;

  color fillColor;
  
  Token(int tempX, int tempY, int tempH, int tempW){
    x = tempX;
    y = tempY;
    d = tempH;
    d = tempW;

    fillColor = color(220, 15, 15);
    
  }
  
  void display() {
    fill(fillColor);
    ellipse(x, y, d, d);
  }
};