package Mang;

import java.util.Scanner;

public class XoaPhanTuRaKhoiMang {
    public static void main(String[] args) {
        int[] value = {10, 4, 3, 7, 8, 6, 0, 4, 0, 0};
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập giá trị cần xóa: ");
        int X = scanner.nextInt();
        int i;
        int cont = 0;
        for (i = 0; i < value.length; i++) {
            if (X == value[i]) {
                cont++;
                break;
            }
        }
        if (cont == 0) {
            System.out.println(X + " không nằm trong mảng!");
        } else {
            for (int j = i; j < value.length - 1; j++) {
                value[j] = value[j + 1];
            }
            value[value.length - 1] = 0;
            for (int j = 0; j < value.length; j++) {
                System.out.print(value[j] + ", ");
            }
        }
    }
}
