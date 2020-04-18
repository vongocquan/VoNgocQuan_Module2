package AdvancedObjectOrientedDesign.interfaceResizeable;

import java.util.Random;

public class test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(3.5);
        shapes[1] = new Rectangle(2.3, 5.8);
        shapes[2] = new Square(2.3);
        Resizeable resizeable;
        for (int i = 0; i < 3; i++){
            System.out.print("trước khi tăng: ");
            System.out.println(shapes[i].getArea());
            if (shapes[i] instanceof Circle) {
                resizeable = (Circle) shapes[i];
            }else if (shapes[i] instanceof Rectangle){
                resizeable = (Rectangle) shapes[i];
            }else {
                resizeable = (Square) shapes[i];
            }resizeable.resize(30);
        }



    }
}
