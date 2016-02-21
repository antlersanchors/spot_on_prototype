class Token {
  int x;
  int y;
  int w;
  int h;

  color fillColor;
  
  Token(int tempX, int tempY, int tempH, int tempW){
    x = tempX;
    y = tempY;
    h = tempH;
    w = tempW;

    fillColor = color(220, 15, 15);
    
  }
  
  void display() {
    fill(fillColor);
    ellipse(x, y, w, h);
  }
};