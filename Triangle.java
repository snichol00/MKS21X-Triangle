public class Triangle{
  private Point v1,v2,v3;
  private double x1,y1,x2,y2,x3,y3;

  public Triangle(Point A, Point B, Point C){
    v1=A;
    v2=B;
    v3=C;
  }

  public Triangle(double X1, double Y1, double X2, double Y2, double X3, double Y3){
    x1=X1;
    y1=Y1;
    x2=X2;
    y2=Y2;
    x3=X3;
    y3=Y3;
  }

  public double getPerimeter(){
    return v1.distanceTo(v2) + v2.distanceTo(v3) + v3.distanceTo(v1);
  }

  public String toString(){
    return "Triangle: A" + v1 + " B" + v2 + " C" + v3;
  }

  public Point getVertex(int index){
    Point output;
    if (index == 0){
       output = new Point(v1.getX(), v1.getY());
    }
    else if(index == 1){
      output = new Point(v2.getX(), v2.getY());
    }
    else{
      output = new Point(v3.getX(), v3.getY());
    }
    return output;
  }

  public void setVertex(int index, Point newP){
    if (index == 0){
      v1 = newP;
    }
    else if(index == 1){
      v2 = newP;
    }
    else{
      v3 = newP;
    }
  }
}
