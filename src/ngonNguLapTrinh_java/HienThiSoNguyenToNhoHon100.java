package ngonNguLapTrinh_java;

import java.util.Scanner;

public class HienThiSoNguyenToNhoHon100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap n: ");
        int n = scanner.nextInt();

        for (int i = 2; i < n; i++){
            if (laSoNguyenTo(i)){
                System.out.println(i);
            }
        }
    }public static boolean laSoNguyenTo(int n) {
        int cont = 0;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                cont++;
            }
        }
        return cont == 0;
    }
}
