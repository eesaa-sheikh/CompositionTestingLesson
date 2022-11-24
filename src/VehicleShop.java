import products.IProduct;
import products.Products;
import products.parts.Part;
import products.vehicles.*;
import products.vehicles.water.Kayak;
import products.vehicles.water.SpeedBoat;

import java.util.List;

public class VehicleShop {
    private static List <IVehicles> vehicles;
    public static void main(String[] args) {
        System.out.println("Hello World");

        //Bike Vehicle shop
        IProduct product = new Bicycle(new Products("new bike", 30,1000), 10,30);
       ILandInterface product2 =(ILandInterface)product;
       product2.getWheelCount();

       //Parts Vehicle shop
       IProduct partProduct = new Part(new Products("Bulb", 10, 10),
               "HackSmith",1021);

        //Car Vehicle shop
        Car car = new Car(new Products("Cool car",100,1203),
                new Engine(1300,90),1,1);
        vehicles.add(car);

        //Kayak Vehicle shop
        Kayak kayak = new Kayak(new Products("SpeedBoat",1000,1230401),
                        "V -shaped Hulls",100,9_000_000);
    vehicles.add(kayak);
        //speedboat Vehicle shop
        SpeedBoat speedBoat =new SpeedBoat(new Products("Eesaa's SpeedBoat", 10,
                15_000_000),new Motor(100000,99,
                "FWO FEOW FEOW", "..."),100,150);
        vehicles.add(speedBoat);
        speedBoat.startEngine();

        System.out.println(speedBoat.getinventroy());
        System.out.println(kayak.getTitle());
        System.out.println("hull is  " +kayak.getHullType());

        System.out.println(partProduct.getTitle());
    }
    }



