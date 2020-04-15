package Mang;

public class TaoBanDoTroChoiMineSweeper {
    public static void main(String[] args) {
        String[][] map = new String[4][4];
        map[0][0] = "*";
        map[2][1] = "*";
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j ++){
                System.out.print(map[i][j] + " ");
            }System.out.println("");
        }
    }
}
