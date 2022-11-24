package products.vehicles;
import products.IProduct;

public class Bicycle extends Vehicles implements ILandInterface {
    private int wheelCount;

    public Bicycle(IProduct baseProduct,float weight, int maxSpeed){
        super(baseProduct, weight, maxSpeed);
        this.wheelCount = 2; //limit of wheel count on a bicycle
    }

    @Override
    public int getWheelCount() {
        return wheelCount;
    }

    @Override
    public void setWheelCount(int count) {
      //  throw Exception("What are you ding? This is a bike");
        System.out.println("Cannot change number of wheels on bike");
    }
}
