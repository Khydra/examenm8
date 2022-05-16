// A sample class Shape which provides a method to get the Shape's area
class Shape {
  
  /** 
   * @return double
   */
  public double getArea() {
    return 0;
  }
}
// A Rectangle is a Shape with a specific width and height
class Rectangle extends Shape {   // extended form the Shape class
  private double width;
  private double height;
  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }
  public double getArea() {
    return width * height; 
  }
  public void Quadrat(double width) {
    this.width = width;
  }
  public double getAreaQuadrat() {
    return width * width; 
  }
}
// A Circle is a Shape with a specific radius
class Circle extends Shape {
  private double radius;
  public Circle(double radius) {
    this.radius = radius; 
  }
  public double getArea() {
    return 3.14 * radius * radius; 
  }
}
