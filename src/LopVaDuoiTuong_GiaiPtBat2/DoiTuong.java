package LopVaDuoiTuong_GiaiPtBat2;

import java.util.Scanner;

public class DoiTuong {
    public static void main(String[] args) {
        PhuongTrinhBac2 phuongTrinh = new PhuongTrinhBac2();
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap a: ");
        double a = scanner.nextDouble();
        phuongTrinh.setA(a);
        System.out.print("nhap b: ");
        phuongTrinh.setB(scanner.nextDouble());
        System.out.print("nhap c: ");
        phuongTrinh.setC(scanner.nextDouble());
        System.out.println(phuongTrinh.GiaiPhuongTrinhBatHai(phuongTrinh.getA(), phuongTrinh.getB(), phuongTrinh.getC()));
    }
}