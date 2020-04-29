import javax.swing.plaf.basic.BasicButtonUI;
import java.io.*;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) throws IOException {
        String regexMaDichVu = "^[S][V][V][L][-][0-9]{4}$";
        boolean check = false;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("nah");
            String  a = scanner.next();
            if (Pattern.matches(regexMaDichVu, a)){
                check = true;
            }else {
                System.out.println("ads");
            }
        }while (!check);
        String i = "^[A-Z]$";
        check = false;
        do {
            System.out.println("nhap");
            String c = scanner.next();
            if (Pattern.matches(i, c)){
                check = true;
            }else {
                System.out.println("nhap lai");
            }
        }while (!check);

    }
}
