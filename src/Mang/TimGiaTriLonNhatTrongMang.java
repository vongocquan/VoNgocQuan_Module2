package Mang;

import java.util.Scanner;

public class TimGiaTriLonNhatTrongMang {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("số phần tử: ");
            size = scanner.nextInt();
            if (size > 20){
                System.out.println("phần tử phải bé hơn 20");
            }

        }while (size > 20);
        arr =  new int[size];
        for (int i = 1; i <= size; i++){
            System.out.print("phần tử thứ " + i + ": ");
            arr[i-1] = scanner.nextInt();
        }
        int max = arr[0];
        for (int i = 1; i < size; i++){
            if (max < arr[i]){
                max = arr[i];
            }
        }System.out.print("max = " + max);
    }
}
