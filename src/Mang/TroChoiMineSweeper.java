package Mang;

import java.util.Scanner;

public class TroChoiMineSweeper {
    public static void main(String[] args) {
        char[][] map = {{'.','.','.','.','.','.'},
                {'.','*', '.', '.', '.','.'},
                {'.','.','.','.','.','.'},
                {'.','.','*','.','.','.'},
                {'.','.','.','.','.','.'},
                {'.','.','.','.','.','.'}};
        for (int x = 1; x<5; x++){
            for (int y = 1; y<5; y++){
                System.out.print(map[x][y]);
            }System.out.println("");
        }
        Scanner scanner = new Scanner(System.in);
        for (int x = 1; x < 5; x++){
            for (int y = 1; y < 5; y ++){
                int cont = 0;
                for (int a = x -1; a <= x+1; a++){
                    for (int b = y - 1; b <= y +1; b++){
                        if (map[a][b] == '*' & map[a][b] != map[x][y]){
                            cont++;
                        }
                    }
                }if (map[x][y] != '*'){
                    if (cont == 0){
                        map[x][y] = '0';
                    }else if (cont == 1){
                        map[x][y] = '1';
                    }else if (cont == 2){
                        map[x][y] = '2';
                    }else if (cont == 3){
                        map[x][y] = '3';
                    }else if(cont == 4){
                        map[x][y] = '4';
                    }else if (cont == 5){
                        map[x][y] = '5';
                    }else if (cont == 6){
                        map[x][y] = '6';
                    }else if (cont == 7){
                        map[x][y] = '7';
                    }else {
                        map[x][y] = '8';
                    }
                }
            }
        }
        for (int x = 1; x<5; x++){
            for (int y = 1; y<5; y++){
                System.out.print(map[x][y]);
            }System.out.println("");
        }
    }
}