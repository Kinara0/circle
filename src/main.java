public class main {
    public static void main(String[] args) {
        //Circle,

        Circle c = new Circle();
        Circle circle1 = new Circle(2.0, 5.0, 9.0);

        System.out.println(circle1);
        double area = circle1.area();
        System.out.println("Area "+area);
        System.out.println(circle1.circumference());
    }
}
