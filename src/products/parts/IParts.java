package products.parts;

import products.IProduct;

public interface IParts extends IProduct {
    public String getManufacturer();
    public long getPartNumber();
    public void setManufacturer(String manufacturer);
    public void setPartNumber(long partNumber);
}
