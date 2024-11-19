package UMLFinals;

public class Order{
    private int quantity;
    private Customer customer;
    private Apparels apparels;

    public Order(int quantity, Customer customer, Apparels apparels) {
        this.quantity = quantity;
        this.customer = customer;
        this.apparels = apparels;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
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

    public double computeOrder(){
       int newStock = apparels.getStock() - quantity;
       apparels.setStock(newStock);
       return (customer.getPayment() - (apparels.getPrice() * quantity));
    }
    public void displayReceipt(){
        System.out.println("Hello world");
    }
    public void showCart(){


    }
}
