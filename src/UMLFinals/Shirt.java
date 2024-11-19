package UMLFinals;

public class Shirt extends Apparels implements DisplayProduct{
    private boolean isRelaxed;
    private boolean isOversized;
    private boolean isSlimfit;

    public Shirt(String size, String color, String brand, Double price, Boolean isAvailable, int stock, boolean isRelaxed, boolean isOversized, boolean isSlimfit) {
        super(size, color, brand, price, isAvailable, stock);
        this.isRelaxed = isRelaxed;
        this.isOversized = isOversized;
        this.isSlimfit = isSlimfit;
    }

    public boolean isRelaxed() {
        return isRelaxed;
    }

    public void setRelaxed(boolean relaxed) {
        isRelaxed = relaxed;
    }

    public boolean isOversized() {
        return isOversized;
    }

    public void setOversized(boolean oversized) {
        isOversized = oversized;
    }

    public boolean isSlimfit() {
        return isSlimfit;
    }

    public void setSlimfit(boolean slimfit) {
        isSlimfit = slimfit;
    }

    @Override
    public void display(){
        System.out.println("Relaxed Fit: " + this.isRelaxed);
        System.out.println("Oversized Fit: " + this.isOversized);
        System.out.println("Slimfit Fit: " + this.isSlimfit);
    }
}
