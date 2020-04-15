package Mang;
import java.util.Scanner;
public class BT_SuDungLopArrayIndexOutBoundsException {
    public static void main(String[] args) {
        double[] arr = new double[3];
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap canh a: ");
        double a = scanner.nextDouble();
        System.out.print("nhap canh b: ");
        double b = scanner.nextDouble();
        System.out.print("nhap canh c: ");
        double c = scanner.nextDouble();
        try {
            System.out.print("ba canh tam giac: " + kiemTra(a,b,c)[0] + ", " + kiemTra(a,b,c)[1] + ", " + kiemTra(a,b,c)[2]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.print("khong hop le");
        }
    }
    public static double[] kiemTra(double a, double b, double c) {
        double[] arr = new double[3];
        if (a <= 0 | b <= 0 | c <= 0) {
            arr[4] = a;
            return arr;
        } else if (a + b <= c | a + c <= b | b + c <= a) {
            arr[4] = a;
            return arr;
        } else {
            arr[0] = a;
            arr[1] = b;
            arr[2] = c;
            return arr;
        }
    }
}