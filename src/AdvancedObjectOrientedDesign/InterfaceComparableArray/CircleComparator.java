package AdvancedObjectOrientedDesign.InterfaceComparableArray;


public class CircleComparator extends Circle implements Comparator<CircleComparator> {
    public CircleComparator(double radius) {
        super(radius);
    }

    public CircleComparator(double radius, String color) {
        super(radius, color);
    }

    public CircleComparator() {
    }

    @Override
    public int compareTo(CircleComparator o) {
        if (getRadius() > o.getRadius()) {
            return 1;
        }
        else if (getRadius() < o.getRadius()) {
            return -1;
        }
        else {
            return 1;
        }
    }
}
