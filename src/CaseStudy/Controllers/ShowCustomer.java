package CaseStudy.Controllers;


import CaseStudy.Customer.Customer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;

import static CaseStudy.Controllers.MainController.displayMainMenu;
import static CaseStudy.Customer.AddNewCustomer.customerList;
import static CaseStudy.Customer.WriteCustomer.saveListCustomer;

public class ShowCustomer {
    public static void showInformationCustomer() throws IOException, ClassNotFoundException {
        customerList = new ArrayList<>();
        saveListCustomer();
        Comparator<Customer> comparator = new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                if (o1.getNameCustomer().compareTo(o2.getNameCustomer()) == 0) {
                    return compareYear(o1, o2);
                }
                return o1.getNameCustomer().compareTo(o2.getNameCustomer());

            }
            public int compareYear(Customer o1, Customer o2) {
                int yearCustomer1 = Integer.parseInt(o1.getBirthDay().substring(6, 10));
                int yearCustomer2 = Integer.parseInt(o2.getBirthDay().substring(6, 10));
                return Integer.compare(yearCustomer1, yearCustomer2);
            }
        };
        customerList.sort(comparator);
        for (Customer customer : customerList){
            System.out.println(customer.showInfor());
        }

        displayMainMenu();
    }
}
