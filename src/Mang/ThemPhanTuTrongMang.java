package Mang;

import java.util.Scanner;

public class ThemPhanTuTrongMang {
    public static void main(String[] args) {
        int[] arr = {10, 4, 6, 7, 8, 0, 0, 0, 0, 0, 0};
        int X;
        int index;
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập số cần chèn: ");
        X = scanner.nextInt();
        System.out.print("vị trí muốn chèn: ");
        index = scanner.nextInt();
        if (index <= 1 | index >= arr.length-1){
            System.out.println("không chèn được phần tử " + X +" vào mảng");
        }else{
            for (int i = arr.length - 1; i >= index; i--){
                arr[i] = arr[i-1];
            }arr[index] = X;
            for (int i = 0; i < arr.length; i++){
                System.out.print(arr[i] + ", ");
            }
        }
    }
}
