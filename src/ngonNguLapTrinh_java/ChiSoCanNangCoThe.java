package ngonNguLapTrinh_java;

import java.util.Scanner;

public class ChiSoCanNangCoThe {
    public static void main(String[] args) {
        double weight;
        double height;
        Scanner scanner = new Scanner(System.in);
        System.out.print("cân nặng: ");
        weight = scanner.nextDouble();
        System.out.print("chiều cao: ");
        height = scanner.nextDouble();
        double BMI = weight / (height * height);
        if (BMI < 18.5){
            System.out.println("Underweight");
        }else if (BMI < 25){
            System.out.println("Normal");
        }else if (BMI < 30){
            System.out.println("Overweght");
        }else {
            System.out.println("Obese");
        }
    }
}
