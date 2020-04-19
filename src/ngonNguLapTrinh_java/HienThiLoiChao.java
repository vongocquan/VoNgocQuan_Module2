package ngonNguLapTrinh_java;

import java.util.Scanner;

public class HienThiLoiChao {
    public static void main(String[] args) {
        String ten;
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập tên: ");
        ten = scanner.nextLine();
        System.out.println("xin chào " + ten);
    }
}
