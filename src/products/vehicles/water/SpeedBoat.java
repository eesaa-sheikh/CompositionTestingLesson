package products.vehicles.water;

import products.IProduct;
import products.parts.Part;
import products.vehicles.IMotorised;
import products.vehicles.Vehicles;

import javax.swing.plaf.PanelUI;

public class SpeedBoat extends Vehicles implements IWaterVehicle, IMotorised {
    private String hullType;

    private final IMotorised motorised;

    public SpeedBoat(IProduct baseProduct, IMotorised motorised, float weight, int maxSpeed) {
        super(baseProduct, weight, maxSpeed);

        this.motorised = motorised;
        this.hullType = "Pontoon Hulls";
    }

    //Setters and Getters
    @Override
    public void startEngine() {
        System.out.println("Vroom Vroom");

    }

    @Override
    public void stopEngine() {
        System.out.println("dead engine");

    }

    @Override
    public int getHp() {
        return motorised.getHp();

    }

    @Override
    public void setHp(int hp) {
        motorised.setHp(hp);


    }

    @Override
    public int getFuellevel() {
        return motorised.getFuellevel();
    }

    @Override
    public void setFuellevel(int fuellevel) {
        motorised.setFuellevel(fuellevel);

    }

    @Override
    public String getHullType() {
        return getHullType();
    }

    @Override
    public void setHullType() {
        System.out.println("Hull Type not available");


    }
}