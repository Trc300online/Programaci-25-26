public class CustomerTest {
   
  public static void main (String args[]) {
      Customer c1 = new Customer();
      Customer c2 = new Customer();

      c1.setCustomerInfo(1, "Toni", "c/exemple1", "656363426");
      c2.setCustomerInfo(2, "Miquel", "c/exemple2", "554863210", "mike@gmail.com");

      c1.displayInfo();
      c2.displayInfo();
  } 
}
