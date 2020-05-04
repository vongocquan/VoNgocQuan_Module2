import javax.xml.crypto.Data;
import java.io.*;
import java.util.Date;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\test"));
        bufferedWriter.write("as");
        bufferedWriter.newLine();
        bufferedWriter.write("b");
        bufferedWriter.close();
        BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\test"));
        System.out.println(bufferedReader.read());
        System.out.println(bufferedReader.read());
    }
}
