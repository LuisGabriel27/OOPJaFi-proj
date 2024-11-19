package UMLFinals;

public class Shorts extends Apparels implements DisplayProduct {
    private boolean isJorts;
    private boolean isSixPockets;
    private boolean isMesh;

    public Shorts(String size, String color, String brand, Double price, Boolean isAvailable, int stock, boolean isJorts, boolean isSixPockets, boolean isMesh) {
        super(size, color, brand, price, isAvailable, stock);
        this.isJorts = isJorts;
        this.isSixPockets = isSixPockets;
        this.isMesh = isMesh;
    }

    public boolean isJorts() {
        return isJorts;
    }

    public void setJorts(boolean jorts) {
        isJorts = jorts;
    }

    public boolean isSixPockets() {
        return isSixPockets;
    }

    public void setSixPockets(boolean sixPockets) {
        isSixPockets = sixPockets;
    }

    public boolean isMesh() {
        return isMesh;
    }

    public void setMesh(boolean mesh) {
        isMesh = mesh;
    }

    @Override
    public void display() {
        System.out.println("Jorts: " + this.isJorts);
        System.out.println("SixPockets: " + this.isSixPockets);
        System.out.println("Mesh: " + this.isMesh);
    }
}
