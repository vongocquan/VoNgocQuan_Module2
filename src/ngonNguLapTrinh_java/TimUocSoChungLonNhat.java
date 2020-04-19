package ngonNguLapTrinh_java;

import java.util.Scanner;

public class TimUocSoChungLonNhat {
    public static void main(String[] args) {
        int a,b;
        Scanner scanner =new Scanner(System.in);
        System.out.print("nhập số a: ");
        a = scanner.nextInt();
        System.out.print("nhập số b: ");
        b = scanner.nextInt();
        Math.abs(a);
        Math.abs(b);
        if (a == 0 || b == 0) {
            System.out.println("No greatest common factor");
        }
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        System.out.println("Greatest common factor: " + a);
    }
}
