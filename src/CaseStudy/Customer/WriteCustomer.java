package CaseStudy.Customer;


import java.io.*;

import static CaseStudy.Controllers.MainController.displayMainMenu;
import static CaseStudy.Customer.AddNewCustomer.customerList;

public class WriteCustomer {
    public static void writeCustomer() throws IOException, ClassNotFoundException {
        saveListCustomer();
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File("").getAbsoluteFile() + "\\src\\CaseStudy\\Data\\Customer.csv"));
        for (Customer customer : customerList) {
            bufferedWriter.write(customer.showFile());
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
        displayMainMenu();
    }

//    luu customer vao list ----------------------------------------------------------------------------
    public static void saveListCustomer() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("").getAbsoluteFile() + "\\src\\CaseStudy\\Data\\Customer.csv"));
        String str = "";
        do {
            str = bufferedReader.readLine();
            if (str != null){

                String[] arr = str.split(",");
                Customer customer = new Customer(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], arr[7]);
                customerList.add(customer);

            }
        }while (str != null);
    }
}
