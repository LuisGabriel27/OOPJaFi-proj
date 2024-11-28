package UMLFinals;

public class Main {
    public static void main(String[] args) {
        Apparels app1 = new Shorts("Large", "Blue", "jabai", 1500.0, true, 10, Shorts.MaterialUsed.CANVAS, Shorts.ShortsStyle.SIXPOCKETS);
        Apparels app2 = new Shirt ("XX Large", "Blue", "jabai", 1200.0, true, 10, Shirt.MaterialUsed.LINEN, Shirt.ShirtStyle.RELAXEDFIT);
        Apparels app3 = new Pants ("XX Small", "Blue", "jabai", 1600.0, true, 10, Pants.MaterialUsed.CORDUROY, Pants.PantsStyle.CORDUROY_PANTS);
        Apparels app4 = new Jacket ("XX Small", "Blue", "jabai", 1600.0, true, 10, Jacket.JacketStyle.WINDBREAKER, Jacket.MaterialUsed.MICROFIBER);

        Customer customer1 = new Customer("Luis", "Luis", 23, "Luis St,", "Luis@Luis.com", "09981235684");

        Order order1 = new Order(2, 6000, customer1, app1);
        Order order2 = new Order(2, 6000, customer1, app2);
        Order order3 = new Order(2, 6000, customer1, app3);
        Order order4 = new Order(2, 6000, customer1, app4);


        System.out.println(order1.computeOrder());
        System.out.println(app1.getStock());
        app1.display();
        System.out.println("-----------------------------");
        System.out.println(order2.computeOrder());
        System.out.println(app2.getStock());
        app2.display();
        System.out.println("-----------------------------");
        System.out.println(order3.computeOrder());
        System.out.println(app3.getStock());
        app3.display();
        System.out.println("-----------------------------");
        System.out.println(order4.computeOrder());
        System.out.println(app4.getStock());
        app4.display();
//        System.out.println(order2.computeOrder());
//        System.out.println(app1.getStock());

    }
}
