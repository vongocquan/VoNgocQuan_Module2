package ngonNguLapTrinh_java;

import java.util.Scanner;

public class KiemTraNamNhuan {
    public static void main(String[] args) {
        int year;
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập năm: ");
        year = scanner.nextInt();
        if (year % 400 == 0){
            System.out.println("năm " + year + " là năm nhuận");
        }else {
            System.out.println("năm " + year + " không phải là năm nhuận");
        }
    }
}
