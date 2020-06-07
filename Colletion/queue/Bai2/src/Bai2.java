import java.util.*;

public class Bai2 {
    static Scanner scanner = new Scanner(System.in);
    static Queue<Customer> customerQueue = new LinkedList<>();
    static Map<Integer, Customer> customerMap = new HashMap<>();
    static List<Customer> customerList = new ArrayList<>();
    static Stack<Customer> customerStack = new Stack<>();
    public static void displayMenu(){
        System.out.println("----------0. Kết thúc phục vu------------̣");
        System.out.println("----------1. Thêm khách hàng-------------");
        System.out.println("----------2. phục vụ người có độ ưu tiên cao nhất------------");
        System.out.println("----------3. Phục vụ người có độ ưu tiên thấp nhất-----------");
        System.out.print("choose: ");
        int choose = scanner.nextInt();
        switch (choose){
            case 0:
                System.out.println("-----------------------Kết Thúc Phục Vụ---------------");
                break;
            case 1:
                addCustomer();
                break;
            case 2:
                serveCustomerBig();
                break;
            case 3:
                serveCustomerSmall();
                break;
            default:
                displayMenu();
        }

    }
    static int p = 1;
    public static void addCustomer(){
        Customer customer = new Customer();
        System.out.print("nhập id: ");
        customer.setK(scanner.nextInt());
        System.out.print("nhập tên khách hàng: ");
        customer.setNameCustomer(scanner.next());
        customerQueue.add(customer);
        customerMap.put(p, customer);
        customerList.add(customer);
        customerStack.add(customer);
        p++;
        displayMenu();

    }

    public static void serveCustomerBig(){
        int num = 0;
        Set<Integer> set = customerMap.keySet();
         Customer customer = customerQueue.poll();
        for (int i = 0; i < customerMap.size(); i++){
             for (Object key : set) {
                 if (customerMap.get(key).equals(customer)) {
                     num = (int) key;
                 }
             }

        }System.out.println("Độ ưu tiên P = " + num);
        try {
            System.out.println("id = " + customer.getK());
            System.out.println("name = " + customer.getNameCustomer());
            customerStack.clear();
            customerList.remove(0);
            customerStack.addAll(customerList);
        }catch (NullPointerException | IndexOutOfBoundsException e){
            System.out.println("hết khách");
        }
        displayMenu();
    }

    public static void serveCustomerSmall(){
        int num = 0;
        Set<Integer> set = customerMap.keySet();
        try {
            Customer customer = customerStack.pop();
            for (int i = 0; i < customerMap.size(); i++){
                for (Object key : set){
                    if (customerMap.get(key).equals(customer)){
                        num = (int) key;
                    }
                }

            }
            System.out.println("Độ ưu tiên P = " + num);

            System.out.println("id = " + customer.getK());
            System.out.println("name = " + customer.getNameCustomer());
            customerQueue.clear();

            customerList.remove(customerList.size() - 1);
            customerQueue.addAll(customerList);
        }catch (EmptyStackException | NullPointerException |IndexOutOfBoundsException e){
            System.out.println("hết khách");
        }
        displayMenu();
    }
    public static void main(String[] args) {
        displayMenu();
    }
}
