package CaseStudy.FindEmployee;

import CaseStudy.Employee.Employee;


import java.io.IOException;

import java.text.ParseException;

import java.util.Stack;

import static CaseStudy.Controllers.MainController.displayMainMenu;
import static CaseStudy.Employee.Employee.*;

public class FindEmployee {
    public static void findEmployee() throws IOException, ParseException {
        int cont;
        boolean check = false;
        do {
            cont = 0;
            System.out.print("input code employee: ");
            String codeEmployee = scanner.next();
            Stack<Employee> stack = new Stack<>();
            for (String key : set) {
                stack.push(map.get(key));
                if (key.equals(codeEmployee)) {
                    cont++;
                    break;
                }
            }
            if (cont == 1){
                    System.out.println(stack.pop().toString());
                    check = true;
            }else {
                System.out.println("code Unknown! again input code employee: ");
            }

        }while (!check);
        displayMainMenu();
    }


}
