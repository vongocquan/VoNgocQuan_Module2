package NgonNguLapTrinhJava;
import java.util.Scanner;
public class DientichHinhChuNhat {
    public static void main(String[] args){
        float chieuRong;
        float chieuDai;
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập chiều rộng: ");
        chieuRong = scanner.nextFloat();
        System.out.print("nhập chiều dài: ");
        chieuDai = scanner.nextFloat();
        float dienTich = chieuDai * chieuRong;
        System.out.println("dien tích hình chữ nhật là: " + dienTich);

    }
}
