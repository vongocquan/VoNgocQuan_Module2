
import java.util.*;

public class TimChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, String> mapTable = new HashMap<>();
        ArrayList<String> arrayList = new ArrayList<>();
        String[] strings = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        for (int i = 1; i <= 25; i++) {
            mapTable.put(i, strings[i - 1]);
        }


        System.out.println("-----kích thước bảng------");
        System.out.print("Nhập số hàng: ");
        int N = scanner.nextInt();
        System.out.print("Nhập số cột: ");
        int M = scanner.nextInt();
        for (int i = 1; i <= N; i++){

            StringBuilder str = new StringBuilder();
            for (int j = 1; j <= M; j++){
                String character = mapTable.get((int) (Math.random() *24 + 1));
                str.append(character);
                System.out.print(character);
            }
            arrayList.add(str.toString());
            System.out.println();
        }
        boolean bool = true;
        while (bool) {
            String result = "";
            System.out.print("nhập chuỗi cần tìm (nhấn 0 để thoát): ");
            String string = scanner.next();
            if (string.equals("0")) {
                System.out.println("-------đã thoát trò chơi---------");
                bool = false;
            } else {
                for (int i = 0; i < arrayList.size(); i++) {
                    int num = arrayList.get(i).indexOf(string);
                    if (num >= 0) {
                        result += (i + 1) + ", " + (num + 1) + ", " + 1;
                        break;
                    }


                }
                if (result.toString().equals("")) {
                    for (int i = 0; i < M; i++) {
                        StringBuilder str = new StringBuilder();
                        for (int j = 0; j < N; j++) {
                            str.append(arrayList.get(j).charAt(i));
                        }
                        int num = str.indexOf(string);
                        if (num >= 0) {
                            result += (num + 1) + (", ") + (i + 1) + (", ") + 2;
                            break;
                        }
                    }
                }
                if (result.equals("")) {
                    if (N == M) {
                        StringBuilder str = new StringBuilder();
                        for (int i = 0; i < N; i++) {
                            str.append(arrayList.get(i).charAt(i));
                        }
                        int num = str.indexOf(string);
                        if (num >= 0) {
                            result += (num + 1) + ", " + (num + 1) + ", " + 3;
                        }
                    }
                }
                if (result.equals("")) {
                    if (N == M) {
                        StringBuilder str = new StringBuilder();
                        for (int i = N; i > 0; i--) {
                            str.append(arrayList.get(N - i).charAt(i - 1));
                        }
                        int num = str.indexOf(string);
                        if (num >= 0) {
                            result += (num + 1) + ", " + (N - num) + ", " + 4;
                        }
                    }
                }
                if (result.equals("")) {
                    result += -1;
                }
                System.out.println(result);
            }
        }
    }
}
