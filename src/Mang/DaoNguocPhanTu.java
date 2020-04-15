package Mang;

import java.util.Scanner;

public class DaoNguocPhanTu {
    public static void main(String[] args) {
        int size;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("nhập số phần tử: ");
            size = scanner.nextInt();
            if (size > 20){
                System.out.print("số phần tử không lớn hơn 20");
            }
        }while (size > 20);
        String[] arr = new String[size];
        for (int i = 1; i <= size; i++){
            System.out.print("phần tử thứ " + i + ": ");
            arr[i-1] = scanner.next();
        }System.out.println("chưa đảo ngược: ");
        for (int i = 0; i < size; i++){
            System.out.print(arr[i] + ", ");
        }System.out.println(" ");
        System.out.println("đảo ngược: ");
        for (int i = size; i > 0; i--){
            System.out.print( arr[i-1] +", ");
        }
    }
}
