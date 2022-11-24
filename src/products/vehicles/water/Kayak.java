package products.vehicles.water;

import products.IProduct;
import products.vehicles.Vehicles;

public class Kayak extends Vehicles implements IWaterVehicle {
    private  String hullType;
    private IProduct baseProduct;


    public Kayak(IProduct baseProduct, String hullType,float weight, int maxSpeed){
        super(baseProduct, weight, maxSpeed);

        this.hullType = hullType; //limit of wheel count on a bicycle
        this.baseProduct = baseProduct;
    }

    @Override
    public String getHullType() {
        return hullType;
    }

    @Override
    public void setHullType() {
        System.out.println("Hull Type not available");
    }


    }



