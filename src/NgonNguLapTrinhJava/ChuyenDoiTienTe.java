package NgonNguLapTrinhJava;
import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập USD: ");
        usd = scanner.nextDouble();
        double vnd = usd * 23000;
        System.out.println(vnd + " vnd");
    }
}
