public class Item {
    private int id;
    private String name;
    private int stock;

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getStock() {
        return stock;
    }
    public void updateStock( int newStock) {
        this.stock = newStock;
    }
}
