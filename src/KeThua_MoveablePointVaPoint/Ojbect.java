package KeThua_MoveablePointVaPoint;

public class Ojbect {
    public static void main(String[] args) {
        Point point = new Point();
        point.setX(6.7f);
        point.setY(8.3f);
        System.out.println("point: ");
        System.out.println(point.toString());
        MoveablePoint moveablePoint = new MoveablePoint();
        moveablePoint.setxSpeed(0.3f);
        moveablePoint.setySpeed(1.2f);
        moveablePoint.setX(7.4f);
        moveablePoint.setY(5.4f);
        System.out.println("moveablePoint: ");
        System.out.println(moveablePoint.toString());
        System.out.println(moveablePoint.move());
    }
}
