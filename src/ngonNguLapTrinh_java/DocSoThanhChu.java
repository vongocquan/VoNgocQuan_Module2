package ngonNguLapTrinh_java;

import java.util.Scanner;

public class DocSoThanhChu {
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập số: ");
        num = scanner.nextInt();
        String[] so = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] chuc = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] hangChuc = {"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        String result = "";
        if (num >= 0 & num < 10) {
            for (int i = 0; i < 10; i++){
                if (num == i){
                    System.out.println(so[i]);
                }
            }
        } else if (num < 20) {
           for (int i = 0; i < 10; i++){
               if (num == (i+10)){
                   System.out.println(chuc[i]);
               }
           }
        } else if (num < 60) {
            int i;
            for (i = 0; i < 4; i++) {
                if (num < (i + 3) * 10 & num >= (i + 2) * 10) {
                    result += hangChuc[i];
                    break;
                }
            }
            for (int j = 0; j < 10; j++) {
                if (num % ((i + 2) * 10) == j) {
                    result = result + " " + so[j];
                    System.out.println(result);
                    break;
                }
            }
        } else if (num < 100) {
            int i;
            for (i = 6; i < 10; i++) {
                if (Math.floor(num / 10) == i) {
                    result += hangChuc[i];
                    break;
                }
            }
            for (int j = 0; j < 10; j++) {
                if (num % (i * 10) == j) {
                    result += " " + so[j];
                    System.out.println(result);
                    break;
                }
            }
        } else if (num < 1000) {
            int i;
            for (i = 0; i < 10; i++) {
                if (Math.floor(num / 100) == i) {
                    result += so[i] + "hundred";
                    break;
                }
            }
            for (int j = 1; j < 100; j++) {
                if (num % (100 * i) == j) {
                    if (j < 10) {
                        result += " " + so[j];
                        System.out.println(result);
                    } else if (j < 20) {
                        result += chuc[j - 10];
                        System.out.println(result);
                    } else if (j < 100) {
                        int k;
                        for (k = 2; k < 10; k++) {
                            if (Math.floor(j / 10) == k) {
                                result += " " + hangChuc[k - 2];
                                break;
                            }
                        }
                        for (int z = 0; z < 10; z++) {
                            if (j % (k * 10) == z) {
                                result += " " + so[z];
                                System.out.println(result);
                            }
                        }
                    }
                }
            }
        }
    }
}
