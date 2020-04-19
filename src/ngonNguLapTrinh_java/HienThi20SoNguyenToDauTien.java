package ngonNguLapTrinh_java;

import java.util.Scanner;

public class HienThi20SoNguyenToDauTien {
    public static void main(String[] args) {
        int dem;
        Scanner scanner = new Scanner(System.in);
        System.out.print("hiển thị bao nhiêu số nguyên tố: ");
        dem = scanner.nextInt();
        int m = 0;
        int i = 2;
        while (m<dem){
            if (kiemTraSoNguyenTo(i)){
                System.out.println(i);
                m++;
            }i++;
        }

    }

    public static boolean kiemTraSoNguyenTo(int n) {
        if (n == 2) {
            return true;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++){
                if (n % i ==0){
                    return false;
                }
            }return true;
        }
    }
}
