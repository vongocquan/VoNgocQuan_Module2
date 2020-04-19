package ngonNguLapTrinh_java;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        String a = "";
        String b ="";
        int ve;
        System.out.println("1. In hình chữ nhật");
        System.out.println("2. In hình tam giác vuông, có cạnh góc vuông ở botton-left");
        System.out.println("3. In hình tam giác vuông, có cạnh góc vuông ở top-left");
        System.out.println("4. Tam giác cân");
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập số: ");
        ve = scanner.nextInt();
        switch (ve){
            case 1:{
                for (int i = 0; i < 3; i++){
                    for (int j = 0; j < 7; j++){
                        System.out.print("*");
                    }System.out.println("");
                }
            } case 2:{
                for (int i = 0; i < 6; i++){
                    for (int j = 0; j < i; j++){
                        System.out.print("*");
                    }System.out.println("");
                }
            } case 3:{
                for (int i = 5; i >= 1; i--){
                    for (int j = 1; j <= i; j++){
                        System.out.print("*");
                    }System.out.println("");
                }
            } case 4:{
                for (int i = 1; i <= 5; i++){
                    for (int j = 5 - i; j > 0; j--){
                        System.out.print(" ");
                    }for (int k = 1; k <= i; k++){
                        System.out.print("*");
                    }for (int z = 2; z <= i; z++){
                        System.out.print("*");
                    }System.out.println(" ");
                }

            }
        }
    }
}
