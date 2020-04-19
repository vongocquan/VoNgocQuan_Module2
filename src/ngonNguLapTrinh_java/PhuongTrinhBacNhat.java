package ngonNguLapTrinh_java;

import java.util.Scanner;

public class PhuongTrinhBacNhat {
    public static void main(String[] args){
        double a;
        double b;
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập a" );
        a = scanner.nextDouble();
        System.out.print("nhập b: ");
        b = scanner.nextDouble();
        if (a == 0){
            if (b == 0){
                System.out.println("phương trình vô số nghiệm");
            }else {
                System.out.println("phương trình vô nghiệm");
            }
        }else {
            System.out.println(-b / a);
        }

    }
}
