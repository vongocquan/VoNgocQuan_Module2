package KeThua_Point2DPoint3D;

public class Ojbect {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        point2D.setX(8.4f);
        point2D.setY(7.5f);
        System.out.println("point2D: ");
        System.out.println(point2D.toString());
        Point3D point3D = new Point3D();
        point3D.setX(8);
        point3D.setY(4.5f);
        point3D.setZ(9.2f);
        System.out.println("point3D: ");
        System.out.println(point3D.toString());
    }
}
