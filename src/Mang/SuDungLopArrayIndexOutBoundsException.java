package Mang;

import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;

public class SuDungLopArrayIndexOutBoundsException {
    public static void main(String[] args) {
        Integer[] arr = createRandom();

        Scanner scaner = new Scanner(System.in);
        System.out.println("\nVui lòng nhập chỉ số của một phần tử bất kỳ: ");
        int x = scaner.nextInt();
        try {
            System.out.println("Giá trị của phần tử có chỉ số thứ" + x + " là " + arr[x]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Chỉ số vượt quá giới hạn của mảng");
        }
    }public static Integer[] createRandom() {
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("Danh sách phần tử của mảng: " );
        for (int i = 0; i < 100; i++) {
            arr[i] = rd.nextInt(100);
            System.out.print(arr[i]+ " ");
        }
        return arr;
    }

}
