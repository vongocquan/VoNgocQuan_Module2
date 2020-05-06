package CaseStudy.Employee;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.io.*;
import java.text.ParseException;
import java.util.*;

import static CaseStudy.Controllers.MainController.displayMainMenu;

public class Employee {
    private String nameEmployee;
    private String old;
    private String address;

    public Employee() {
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public String getOld() {
        return old;
    }

    public void setOld(String old) {
        this.old = old;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Employee(String nameEmployee, String old, String address) {
        this.nameEmployee = nameEmployee;
        this.old = old;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "nameEmployee='" + nameEmployee + '\'' +
                ", old=" + old +
                ", address='" + address + '\'' +
                '}';
    }
    public static List<Employee> employeeList = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);
    public static void fileEmployee() throws IOException {
        boolean check = false;


            Employee employee = new Employee();
            System.out.println("input code: ");
            String code = scanner.next();
            System.out.print("input name employee: ");
            employee.setNameEmployee(scanner.next());
            do {
                try {
                    System.out.print("input old: ");
                    employee.setOld(scanner.next());
                    if (Integer.parseInt(employee.getOld()) > 0){
                        check = true;
                    }

                } catch (NumberFormatException e) {
                    System.out.print("again input old: ");


                }
            }while (!check);

            System.out.print("input address: ");
            employee.setAddress(scanner.next());

            map.put(code, employee);



        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File("").getAbsoluteFile() + "\\src\\CaseStudy\\Data\\Employee.csv"));
        for (Map.Entry<String, Employee> a : map.entrySet()) {
            bufferedWriter.write("code= " + a.getKey() + ". " + a.getValue());
            bufferedWriter.newLine();
        }
        bufferedWriter.close();



    }
    public static Map<String, Employee> map = new HashMap<>();
    public static Set<String> set = map.keySet();
    public static void showEmployee(){

        for (String key : set){
            System.out.println("code: " + key + " " + map.get(key));
        }
    }

    public static void menuEmployee() throws IOException, ParseException {
        System.out.println("1. input employee: "+
                "\n 2. show employee" +
                "\n 3. back menu");
        System.out.print("input: ");
        int num = scanner.nextInt();
        switch (num){
            case 1:{
                fileEmployee();
                menuEmployee();
                break;
            } case 2: {
                showEmployee();
                menuEmployee();
                break;
            } case 3:{
                displayMainMenu();
            }
        }
    }

}


