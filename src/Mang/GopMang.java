package Mang;

public class GopMang {
    public static void main(String[] args) {
        int[] arr1 = {3, 6, 7, 3, 4, 15, 27};
        int[] arr2 = {45, 23, 24, 56, 32};
        int[] arr3 = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++){
            arr3[i] = arr1[i];
        }for (int i = arr1.length; i < arr3.length; i++){
            arr3[i] = arr2[i-arr1.length];
        }for (int i = 0; i < arr3.length; i++){
            System.out.print(arr3[i] + ", ");
        }
    }
}
