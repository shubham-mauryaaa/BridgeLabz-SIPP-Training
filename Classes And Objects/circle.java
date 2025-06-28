package OOps_Basic;
public class circle {
    static final double PI = 3.14;
    public static void main(String[] args) {
        Area area = new Area(5);
        System.out.println("The radius of the circle is: " + area.radius*PI);
    }
}
class Area{
    int radius;
    Area(int radius) {
        this.radius = radius;
    }
}
