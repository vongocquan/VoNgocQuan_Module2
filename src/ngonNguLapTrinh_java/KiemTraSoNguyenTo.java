package ngonNguLapTrinh_java;

import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static void main(String[] args){
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập một số: ");
        num = scanner.nextInt();
        int cont = 0;
        for (int i = 2; i < Math.sqrt(num); i++){
            if (num % i == 0){
                cont++;
            }
        }if (num <= 1){
            System.out.println(num + " không phải là số nguyên tố");
        }else if (cont == 0){
            System.out.println(num + " là số nguyên tố");
        }else {
            System.out.println(num + " không phải là số nguyên tố");
        }
    }
}
