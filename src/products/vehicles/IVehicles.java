package products.vehicles;

import products.IProduct;

public interface IVehicles extends IProduct {
    public float getWeight();
    public int getMaxSpeed();
    public void  setWeight (float weight);
    public void  setMaxtSpeect(int speed);
}
