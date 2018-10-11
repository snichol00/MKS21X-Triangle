//immutable point class:
public class Point{
  private double x,y;

  public Point(double X, double Y){
    x=X;
    y=Y;
  }

  public Point(Point p){
    x= p.x;
    y= p.y;
  }

  public double getX(){
    return x;
  }

  public double getY(){
    return y;
  }

  public Point copy(){
    return new Point(x,y);
  }

  public String toString(){
    return "(" + x + ", " + y + ")";
  }

  public static double distance(Point a, Point b){
    return Math.sqrt(((b.x - a.x) * (b.x - a.x)) + ((b.y - a.y) * (b.y - a.y)));
  }

  public double distanceTo(Point a){
    return Math.sqrt(((this.x - a.x) * (this.x - a.x)) + ((this.y - a.y) * (this.y - a.y)));
  }
}
