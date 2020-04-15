package Mang;

import java.util.Scanner;

public class DemSoLuongHocSinhThiDo {
    public static void main(String[] args) {
        int size;
        Scanner scanner =new Scanner(System.in);
        do {
            System.out.print("nhập số lượng học sinh: ");
            size = scanner.nextInt();
            if (size > 30 | size < 1){
                System.out.println("số lượng học sinh tối thiểu 30 người ");
            }
        }while (size > 30| size < 1);
        int[] arr = new int[size];
        for (int i = 1; i <= size; i++){
            do {
                System.out.print("nhập điểm học sinh thứ: " + i + ": ");
                arr[i - 1] = scanner.nextInt();
                if (arr[i-1] < 0 | arr[i-1] > 10){
                    System.out.println("thang điểm không hợp lệ, yêu cầu nhập lại");
                }
            }while (arr[i-1] <0 | arr[i -1] >10);
        }int cont = 0;
        for (int i = 1; i <= size; i++){
            if (arr[i - 1] >= 5){
                cont++;
            }
        }System.out.println("có " + cont + " đỗ kỳ thi");
    }
}
