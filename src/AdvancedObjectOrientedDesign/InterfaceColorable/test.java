package AdvancedObjectOrientedDesign.InterfaceColorable;

public class test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(3.4);
        shapes[1] = new Rectangle(3.4,7.4);
        shapes[2] = new Square(3.4);
        for (int i = 0; i < shapes.length; i++){
                System.out.println(shapes[i].getArea());
                if (shapes[i] instanceof Square){
                    Colorable colorable = (Square) shapes[i];
                    colorable.howToColor();
            }
        }
    }
}
