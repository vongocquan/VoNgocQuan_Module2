package CaseStudy.Employee;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import static CaseStudy.Controllers.MainController.displayMainMenu;

public class Employee {


    private String nameEmployee;
    private String old;
    private String address;

    public Employee() {
    }

    public Employee(String nameEmployee, String old, String address) {
        this.nameEmployee = nameEmployee;
        this.old = old;
        this.address = address;
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

    @Override
    public String toString() {
        return "Employee{" +
                "nameEmployee='" + nameEmployee + '\'' +
                ", old='" + old + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
    public String showCSV(){
        return nameEmployee + "," + old + "," + address;
    }

    public static  Scanner scanner = new Scanner(System.in);
    public static void menuEmployee() throws IOException, ClassNotFoundException {
        System.out.println("1. input employees" +
                "\n2. show employee");
        System.out.println("-------------------------------------input-------------------------------");
        int input = scanner.nextInt();
        switch (input){
            case 1:{
                inputEmployees();
                break;
            } case 2:{
                showEmployees();
                break;
            }
        }
        displayMainMenu();
    }
    public static Map<String, Employee> map;
    public static void inputEmployees() throws IOException {
        map = new HashMap<>();
        Employee employee = new Employee();
        System.out.println("input code: ");
        String code = scanner.next();
        System.out.print("input name employee: ");
        employee.setNameEmployee(scanner.next());
        boolean check = false;
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
        saveEmployeeMap();

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File("").getAbsoluteFile() + "\\src\\CaseStudy\\Data\\Employee.csv"));
        for (Map.Entry<String, Employee> a : map.entrySet()){
            bufferedWriter.write(a.getKey() +"," + a.getValue().getNameEmployee() +"," + a.getValue().getOld() + ","+a.getValue().getAddress());
            bufferedWriter.newLine();
        }bufferedWriter.close();
    }

    public static void showEmployees() throws IOException {
        map = new HashMap<>();
        saveEmployeeMap();
        Set<String> set = map.keySet();
        for (String key : set){
            System.out.println("code = " + key + " " + map.get(key));
        }
    }

    public static void saveEmployeeMap() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("").getAbsoluteFile() + "\\src\\CaseStudy\\Data\\Employee.csv"));
        String string;
        do {
            string = bufferedReader.readLine();
            if (string != null){
                String[] arr = string.split(",");
                Employee employee1 = new Employee(arr[1], arr[2], arr[3]);
                map.put(arr[0], employee1);
            }
        }while (string != null);
    }
}
