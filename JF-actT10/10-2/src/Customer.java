public class Customer {
    int customerID = 0;
    String name = "-name required-";
    String address = "-address required-";
    String phoneNumber = "-phone required-";
    String eMail = "-email required-";

    public void setCustomerInfo(int id, String nm, String addr,
                                String phNumber) {
        customerID = id;
        name = nm;
        address = addr;
        phoneNumber = phNumber;
    }

    public void setCustomerInfo(int id, String nm, String addr,
                                String phNumber, String email) {
        customerID = id;
        name = nm;
        address = addr;
        phoneNumber = phNumber;
        eMail = email;
    }

    public void displayInfo() {
        System.out.println(customerID + ", " + name  + ", " + address  + ", " + phoneNumber + ", " + eMail);
    }
}
