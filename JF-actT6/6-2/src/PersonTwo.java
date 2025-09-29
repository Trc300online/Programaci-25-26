public class PersonTwo {
    public StringBuilder name = new StringBuilder(8);
    public StringBuilder phoneNumber = new StringBuilder();

    public void displayPersonInfo() {
        name.append("Toni");
        name.append(" ");
        name.append("Riera");
        phoneNumber.append("6563634260");
        phoneNumber.insert(3, "-");
        phoneNumber.insert(7, "-");

        System.out.println("Name: " + name.toString());
        System.out.println("Name object capacity: " + name.capacity());
        System.out.println(phoneNumber.toString());

        System.out.println(name.substring(0, 4));
    }
}
