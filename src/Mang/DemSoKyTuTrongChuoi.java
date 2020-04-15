package Mang;

import java.util.Scanner;

public class DemSoKyTuTrongChuoi {
    public static void main(String[] args) {
        String str = "fsfdsgfscxeqmhjteaz";
        char kyTu;
        String a;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("nhập một ký tự: ");
            a = scanner.nextLine();
            kyTu = a.charAt(0);
            int cont = 0;
            for (int i = 0; i < str.length(); i++){
                if (kyTu == str.charAt(i)){
                    cont++;
                }
                }if (cont == 0){
                    System.out.println("ký tự " + kyTu + " không nằm trong chuỗi");
                }else {
                    System.out.print(cont);
                }
            if (a.length() > 1){
                System.out.println("cần nhập 1 ký tự, vui lòng nhập lại!");
            }
        }while (a.length() > 1);
    }
}
