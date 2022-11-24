package products;

public class Products implements IProduct {

    private float price;
    private long inventory;
    private String title;


    public  Products (String title, long inventory, float price) {
        this.title = title;
        this.price = price;
        this.inventory = inventory;
    }

    @Override
    public float getPrice() {
        return price;
    }

    @Override
    public long getinventroy() {
        return inventory;
    }

    @Override
    public void setInventory(long amount) {
        this.inventory = amount;
    }

    @Override
    public void setPrice(float price) {
        this.price = price;

    }

    @Override
    public void setTitle(String title) {
        this.title = title;

    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void addInventory(long amount) {
        this.inventory += amount;

    }

    @Override
    public void removeInventory(long amount) throws Exception { //throws Exception

        try {
            if (this.inventory - amount < 0) throw new Exception("Can't remove more then inventory the is available");
            else { this.inventory -= amount;}
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
