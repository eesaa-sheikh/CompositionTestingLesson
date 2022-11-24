package products.vehicles;

public class Motor implements IMotorised{

    private int hp;
    private int fuelLevel2;
    private String startEngine;
    private String stopEngine;


    public Motor (int hp,int fuelLevel2, String startEngine, String stopEngine){


        this.hp = hp;
        this.fuelLevel2 = fuelLevel2;
        this.startEngine = startEngine;
        this.stopEngine= stopEngine;

    }
    //Setters and Getters Basically
    @Override
    public void startEngine() {
        System.out.println("FWO FEOW FEOW");

    }

    @Override
    public void stopEngine() {
        System.out.println("...");
    }

    @Override
    public int getHp() {
        return this.hp;
    }

    @Override
    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public int getFuellevel() {
        return fuelLevel2;

    }

    @Override
    public void setFuellevel(int fuellevel) {

    }
}
