package AdvancedObjectOrientedDesign.InterfaceComparableArray;

import java.util.Arrays;
import java.util.Collections;

public class Test {


    public static void main(String[] args) {
        CircleComparator[] circles = new CircleComparator[4];
        circles[0] = new CircleComparator(3.5);
        circles[1] = new CircleComparator(6.3);
        circles[2] = new CircleComparator(3.5, "blue");
        circles[3] = new CircleComparator(3.9);

        Arrays.sort(circles, CircleComparator::compareTo);
        System.out.println("After-sorted:");
        for (int i = 0; i < 4; i++){
            System.out.println(circles[i]);
        }
    }
}
