package Mang;

import java.util.Scanner;

public class ChuongTrinhChuyenDoiNhietDo {
    public static void main(String[] args) {
        int menu;
        double doC;
        double doF;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("menu");
            System.out.println("1. chuyễn độ C sang độ F");
            System.out.println("2. chuyễn độ F sang độ C");
            System.out.println("0. exit");
            System.out.print("chọn: ");
            menu = scanner.nextInt();
            switch (menu){
                case 1:{
                    System.out.print("nhập độ F: ");
                    doF = scanner.nextInt();
                    System.out.println(doF +" độ F bằng "+ chuyenSangDoC(doF) + " độ C");
                    break;
                } case 2:{
                    System.out.print("nhập độ C: ");
                    doC = scanner.nextInt();
                    System.out.println(doC + " độ C bằng " + chuyenSangDoF(doC) + " độ F");
                    break;
                } case 0:{
                    System.exit(0);
                }
            }
        }while (menu != 0);


    }
    public static double chuyenSangDoC(double doF){
        double doC = (5 / 9) * (doF - 32);
        return doC;
    }
    public static double chuyenSangDoF(double doC){
        double doF = (9 / 5) * doC +32;
        return doF;
    }
}
