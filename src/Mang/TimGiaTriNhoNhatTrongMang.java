package Mang;

import java.util.Scanner;

public class TimGiaTriNhoNhatTrongMang {
    public static void main(String[] args) {
        int size;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhập số phần tử trong mảng: ");
            size = scanner.nextInt();
            if (size < 2){
                System.out.println("số phần tử trong mảng không dưới 2 phần tử, Yêu cầu nhập lại!");
            }
        }while (size < 2);
        int[] arr = new int[size];
        for (int i = 1; i <= arr.length; i++){
            System.out.print("nhập phần tử thứ " + i + ": ");
            arr[i-1] = scanner.nextInt();
        }int min = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (min > arr[i]){
                min = arr[i];
            }
        }System.out.println("min = " + min);
    }
}
