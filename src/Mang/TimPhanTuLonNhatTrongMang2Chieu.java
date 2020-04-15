package Mang;

public class TimPhanTuLonNhatTrongMang2Chieu {
    public static void main(String[] args) {
        int arr[][] ={{4,5,2}, {3,2}, {8,3}};
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                if (max < arr[i][j]){
                    max = arr[i][j];
                }
            }
        }System.out.println("max = " +max);
    }
}
