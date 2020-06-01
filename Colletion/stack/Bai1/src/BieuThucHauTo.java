import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class BieuThucHauTo {
    static  Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int num1;
        int num2;
        Stack<String> stack = new Stack<>();
        System.out.print("nhập biểu thức hậu tố: ");
        String expression = scanner.nextLine();
        String[] expressionArr = expression.split(" ");
        int result = 0;
        for (String s : expressionArr) {
            if (!s.equals("-") & !s.equals("+") & !s.equals("*")) {
                stack.push(s);
            }
            else {
                switch (s){
                    case "+":
                        num1 = Integer.parseInt(stack.pop());

                        num2 = Integer.parseInt(stack.pop());

                        result = num1 + num2;
                        stack.push(String.valueOf(result));
                        break;
                    case "-":
                        num1 = Integer.parseInt(stack.pop());

                        num2 = Integer.parseInt(stack.pop());

                        result = num2 - num1;
                        stack.push(String.valueOf(result));
                        break;
                    case "*":
                        num1 = Integer.parseInt(stack.pop());

                        num2 = Integer.parseInt(stack.pop());

                        result = num1 * num2;
                        stack.push(String.valueOf(result));
                        break;
                }
            }
        }

        System.out.println("result = " +result);
    }
}
