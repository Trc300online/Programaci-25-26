public class Customer {
    public int customerId = 1;
    public char status = 'N';
    public double totalPurchase = 0.0;

    public void displayCustomerInfo() {
        System.out.println("customer ID: " + customerId + " - customer status: "
                + status + " - Total purchases made are: " + totalPurchase);
    }
}
