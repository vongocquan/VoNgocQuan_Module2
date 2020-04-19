package ngonNguLapTrinh_java;

import java.util.Scanner;

public class TinhTienLaiChoVay {
    public static void main(String[] args) {
        int soTienGui;
        double tiLeLaiSuat;
        int soThangGui;
        Scanner scanner = new Scanner(System.in);
        System.out.print("số tiền gửi: ");
        soTienGui = scanner.nextInt();
        System.out.print("lãi suất (%): ");
        tiLeLaiSuat = scanner.nextDouble();
        System.out.print("số tháng gửi: ");
        soThangGui = scanner.nextInt();
        double soTienLai = 0;
        for (int i = 0; i < soThangGui; i++){
            soTienLai += soTienGui * (tiLeLaiSuat / 100) / 12 * 3;
        }System.out.println("số tiền lãi: " + soTienLai);
    }
}
