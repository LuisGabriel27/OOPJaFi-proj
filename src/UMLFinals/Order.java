package UMLFinals;

public class Order{
    private int quantity;
    private double payment;
    private Customer customer;
    private Apparels apparels;

    public Order(int quantity, double payment, Customer customer, Apparels apparels) {
        this.quantity = quantity;
        this.payment = payment;
        this.customer = customer;
        this.apparels = apparels;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Apparels getApparels() {
        return apparels;
    }

    public void setApparels(Apparels apparels) {
        this.apparels = apparels;
    }

    public double computeOrder() {
        if (apparels.reduceStock(this.quantity)) {
            return (getPayment() - (apparels.getPrice() * this.quantity));
        } else {
            System.out.println("Insufficient Stock cant continue order.");
            return getPayment();
        }
    }

    public void displayReceipt(){
        System.out.println("Hello world");
    }
    public void showCart(){


    }
}
