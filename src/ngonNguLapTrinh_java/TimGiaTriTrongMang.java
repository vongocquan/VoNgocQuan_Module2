package ngonNguLapTrinh_java;

import java.util.Scanner;

public class TimGiaTriTrongMang {
    public static void main(String[] args){
        String[] student = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập tên học sinh: ");
        String input_name = sc.nextLine();
        boolean isExist = false;
        for (int i = 0; i < student.length; i++ ){
            if (student[i].equals(input_name)){
                System.out.println("vị trí của sinh viên " + input_name + " là " + (i + 1));
                isExist = true;
                break;
            }
        }if (!isExist){
            System.out.println("không có học sinh này");
        }
    }
}
