package products.vehicles;

import products.IProduct;

public class Car extends Vehicles implements IMotorised, ILandInterface { //ILandInterface is basically renamed from ILandvehicle.
    IMotorised engine;

    public Car(IProduct baseProduct, IMotorised engine, float weight, int maxSpeed){
        super(baseProduct,weight,maxSpeed);
        this.engine = engine;
    }


    @Override
    public int getWheelCount() {
     return getWheelCount();
    }

    @Override
    public void setWheelCount(int count) {
        System.out.println("Cars have 4 wheels");

    }

    @Override
    public void startEngine() {
        engine.startEngine();

    }

    @Override
    public void stopEngine() {
        engine.stopEngine();

    }

    @Override
    public int getHp() {
        return engine.getHp();
    }

    @Override
    public void setHp(int hp) {
        engine.setHp(hp);

    }

    @Override
    public int getFuellevel() {
        return engine.getFuellevel();
    }

    @Override
    public void setFuellevel(int fuellevel) {
        engine.setFuellevel(fuellevel);

    }
}
