package UMLFinals;

public class Pants extends Apparels implements DisplayProduct{
    private boolean isCargo;
    private boolean isCorduroy;
    private boolean isDenim;

    public Pants(String size, String color, String brand, Double price, Boolean isAvailable, int stock, boolean isCargo, boolean isCorduroy, boolean isDenim) {
        super(size, color, brand, price, isAvailable, stock);
        this.isCargo = isCargo;
        this.isCorduroy = isCorduroy;
        this.isDenim = isDenim;
    }

    public boolean isCargo() {
        return isCargo;
    }

    public void setCargo(boolean cargo) {
        isCargo = cargo;
    }

    public boolean isCorduroy() {
        return isCorduroy;
    }

    public void setCorduroy(boolean corduroy) {
        isCorduroy = corduroy;
    }

    public boolean isDenim() {
        return isDenim;
    }

    public void setDenim(boolean denim) {
        isDenim = denim;
    }

    @Override
    public void display(){
        System.out.println("Cargo: " + this.isCargo);
        System.out.println("Corduroy: " + this.isCorduroy);
        System.out.println("Denim: " + this.isDenim);
    }
}
