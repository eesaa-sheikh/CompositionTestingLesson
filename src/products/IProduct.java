package products;

public interface IProduct {

    public float  getPrice();
    public long getinventroy();
    public void   setInventory(long amount);
    public void setPrice(float price);
    public void setTitle(String title);
    public String getTitle();
    public void addInventory(long amount);
    public  void removeInventory(long amount) throws Exception;

}
