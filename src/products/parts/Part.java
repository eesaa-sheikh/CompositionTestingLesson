package products.parts;

import products.IProduct;

public class Part implements IParts{
    private IProduct baseProduct;
    private String manufacturer;
    private long partNumber;

    public Part(IProduct baseProduct, String manufacturer, long partNumber){
        this.baseProduct = baseProduct;
        this.manufacturer= manufacturer;
        this.partNumber= partNumber;


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
    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public long getPartNumber() {
        return partNumber;
    }

    @Override
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;

    }

    @Override
    public void setPartNumber(long partNumber) {
        this.partNumber = partNumber;

    }
}
