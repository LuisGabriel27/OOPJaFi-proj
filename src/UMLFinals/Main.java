package UMLFinals;

public class Main {
    public static void main(String[] args) {
        Apparels app1 = new Shorts("Large", "Blue", "Nigga", 1500.0, true, 10, false, false, true);
        Apparels app2 = new Shirt ("XX Large", "Blue", "Niggas", 1200.0, true, 5, false, false, true);
        Apparels app3 = new Pants ("XX Small", "Blue", "Niggas", 1600.0, true, 3, true, false, false);

        Customer customer1 = new Customer("Luis", "Luis", 23, "Luis St,", "Luis@Luis.com", "09981235684", 6000);

        Order order1 = new Order(2, customer1, app1);

        System.out.println(order1.computeOrder());
        System.out.println(app1.getStock());

    }
}
