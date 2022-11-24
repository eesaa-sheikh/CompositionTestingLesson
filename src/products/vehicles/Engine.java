package products.vehicles;

public class Engine implements IMotorised{
    private int hp;
    private int fuelLevel;

    public Engine(int hp, int fuelLevel){
        this.hp = hp;
        this.fuelLevel = fuelLevel;
    }

    @Override
    public void startEngine() {
        System.out.println("vrooom");

    }

    @Override
    public void stopEngine() {
        System.out.println("...");

    }

    @Override
    public int getHp() {
        return hp;
    }

    @Override
    public void setHp(int hp) {
        this.hp = hp;

    }

    @Override
    public int getFuellevel() {
        return fuelLevel;
    }

    @Override
    public void setFuellevel(int fuellevel) {
        this.fuelLevel = fuellevel;

    }
}
