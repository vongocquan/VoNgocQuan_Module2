
package NgonNguLapTrinhJava;
import java.util.Scanner;

public class DocSo {
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
            switch (num) {
                case 0: {
                    System.out.println("zero");
                    break;
                }
                case 1: {
                    System.out.println(so[1]);
                    break;
                }
                case 2: {
                    System.out.println(so[2]);
                    break;
                }
                case 3: {
                    System.out.println(so[3]);
                    break;
                }
                case 4: {
                    System.out.println(so[4]);
                    break;
                }
                case 5: {
                    System.out.println(so[5]);
                    break;
                }
                case 6: {
                    System.out.println(so[6]);
                    break;
                }
                case 7: {
                    System.out.println(so[7]);
                    break;
                }
                case 8: {
                    System.out.println(so[8]);
                    break;
                }
                case 9: {
                    System.out.println(so[9]);
                    break;

                }
            }
        } else if (num <= 15) {
            switch (num) {
                case 10: {
                    System.out.println(chuc[0]);
                    break;
                }
                case 11: {
                    System.out.println(chuc[1]);
                    break;
                }
                case 12: {
                    System.out.println(chuc[2]);
                    break;
                }
                case 13: {
                    System.out.println(chuc[3]);
                    break;
                }
                case 14: {
                    System.out.println(chuc[4]);
                    break;
                }
                case 15: {
                    System.out.println(chuc[5]);
                    break;
                }
            }
        } else if (num < 20) {
            for (int i = 6; i <= 10; i++) {
                if (num % 10 == i) {
                    result += so[i] + "teen";
                    System.out.println(result);
                    break;
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

