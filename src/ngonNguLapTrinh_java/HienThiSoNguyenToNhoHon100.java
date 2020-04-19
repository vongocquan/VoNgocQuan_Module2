package ngonNguLapTrinh_java;

public class HienThiSoNguyenToNhoHon100 {
    public static void main(String[] args) {

        for (int i = 2; i < 100; i++){
            if (laSoNguyenTo(i)){
                System.out.println(i);
            }
        }
    }public static boolean laSoNguyenTo(int n) {
        int cont = 0;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                cont++;
            }
        }if (cont == 0){
            return true;
        }return false;
    }
}
