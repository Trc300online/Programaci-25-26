public class CustomerTest {

    public static void main (String[] args) {
        Customer cust1, cust2;
        cust1 = new Customer();
        cust2 = new Customer();

        cust1.customerID = 1;
        cust1.name = "Miquel";
        cust1.emailAddress = "mgaia@politecnicllevant.cat";

        cust2.customerID = 2;
        cust2.name = "Toni";
        cust2.emailAddress = "triera265@alumnes.politecnicllevant.cat";

        cust1.displayCustomerInfo();
        System.out.println();
        cust2.displayCustomerInfo();
    }
}
