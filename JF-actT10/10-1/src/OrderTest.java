public class OrderTest {
    public static void main(String[] args) {
        Shirt shirt1 = new Shirt();
        Shirt shirt2 = new Shirt();
        Shirt shirt3 = new Shirt();
        Shirt shirt4 = new Shirt();
        Shirt shirt5 = new Shirt();
        Shirt shirt6 = new Shirt();
        Order order1 = new Order();
        double totalCost = 0.0;

        shirt1.price = 14.99;
        totalCost = order1.addShirt(shirt1);
        System.out.println("Total amount for the order is $" + totalCost);

        shirt2.price = 9.99;
        shirt3.price = 11.12;
        shirt4.price = 15.89;
        shirt5.price = 19.99;
        shirt6.price = 21.99;

        order1.addShirt(shirt2);
        order1.addShirt(shirt3);
        order1.addShirt(shirt4);
        order1.addShirt(shirt5);
        totalCost = order1.addShirt(shirt6);
        System.out.println("Total amount for the order is $" + totalCost);
    }
}
