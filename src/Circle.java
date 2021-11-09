public class Circle {
    private double x,y;
    private double r;

    public Circle (){

    }
public Circle(double x,double y, double r ){
    this.x=x;
    this.y=y;
    this.r=r;
}
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
    public double circumference(){
        return 2*3.14* r;
    }
    public double area(){
        return 3.14*r*r;
    }
}
