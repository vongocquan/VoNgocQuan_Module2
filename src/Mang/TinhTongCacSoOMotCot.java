package Mang;

import java.util.Scanner;

public class TinhTongCacSoOMotCot {
    public static void main(String[] args) {
        int cot;
        double tong = 0;
        Scanner scanner = new Scanner(System.in);
        double[][] arr = {
                {6.4, 3.9, 9.2, 14.12, 32.76, 24.9},
                {7.43, 23.12, 15.98, 41.23, 4.56, 28.03},
                {4.4, 23.98, 41.23, 15.13, 21.12, 8.02},
                {20.7, 10.11, 4, 51.23, 27.54, 17.23},
                {13.54, 17.76, 29.89, 9.1, 5.3, 19.23},
                {65.4, 13.5, 43.74, 15.23, 25.04, 17.1}};
        do {
            System.out.print("nhập cột cần tính tổng, tính từ cột 0: ");
            cot = scanner.nextInt();
            if (cot >= arr.length){
                System.out.println("ma trận không có cột:  "+ cot + ". nhập lại");
            }else if(cot < 0){
                System.out.println("cột không hợp lệ, vui lòng nhập lại");
            }
        }while (cot >= arr.length | cot < 0);
        for (int i = 0; i < arr.length; i++){
            if (arr[i].length > cot){
                tong += arr[i][cot];
            }
        }System.out.println(tong);
    }
}
