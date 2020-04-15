package Mang;

public class TimGiaTriNhoNhatTrongMangBangPhuongThuc {
    public static void main(String[] args) {
        int[] arr= {5, 2, 43, -5, -2};
        System.out.println(giaTriNhoNhat(arr));
    }public static int giaTriNhoNhat(int[] arr){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (min > arr[i]){
                min = arr[i];
            }
        }return min;
    }
}
