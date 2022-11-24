package products.vehicles;

import products.IProduct;
import products.Products;

public abstract class Vehicles implements IVehicles {
    //CMD N is a easy way to add setters and getters which saves time.
    private IProduct baseProduct;
    private float weight;
    private  int maxSpeed;

    public Vehicles(IProduct baseProduct,float weight, int maxSpeed){
        this.baseProduct = baseProduct;
        this.weight=weight;
        this.maxSpeed=maxSpeed;
    }

    @Override
    public float getPrice() {
        return baseProduct.getPrice();
    }

    @Override
    public long getinventroy() {
        return baseProduct.getinventroy();
    }

    @Override
    public void setInventory(long amount) {
        baseProduct.setInventory(amount);

    }

    @Override
    public void setPrice(float price) {
        baseProduct.setPrice(price);

    }

    @Override
    public void setTitle(String title) {
        baseProduct.setTitle(title);

    }

    @Override
    public String getTitle() {
        return baseProduct.getTitle();
    }

    @Override
    public void addInventory(long amount) {
        baseProduct.addInventory(amount);

    }

    @Override
    public void removeInventory(long amount) throws Exception {
baseProduct.removeInventory(amount);
    }

    @Override
    public float getWeight() {
        return this.weight;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public void setMaxtSpeect(int maxSpeed) {
        this.maxSpeed = maxSpeed;

    }

}
