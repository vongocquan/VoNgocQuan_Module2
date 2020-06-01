public class Customer {
    private int K;
    private String nameCustomer;

    public Customer() {
    }

    public Customer(int k, String nameCustomer) {
        K = k;
        this.nameCustomer = nameCustomer;
    }

    public int getK() {
        return K;
    }

    public void setK(int k) {
        K = k;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }
}
