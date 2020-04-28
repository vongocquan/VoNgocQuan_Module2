import javax.swing.plaf.basic.BasicButtonUI;
import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {

        BufferedWriter bufferedWriter1 = new BufferedWriter(new FileWriter("D:\\Test.svc"));
        bufferedWriter1.write("vo");
        bufferedWriter1.newLine();

        bufferedWriter1.write("quan");
        bufferedWriter1.close();
        BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\Test.svc"));
        System.out.println(bufferedReader.readLine().split("newLine()")[0]);

    }
}
