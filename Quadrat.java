class Quadrat extends Shape {   // extended form the Shape class
    private double width;
 
    public  Quadrat(double width) {
      this.width = width;
    }
    public double getAreaQuadrat() {
      return width * width; 
    }
    
  }