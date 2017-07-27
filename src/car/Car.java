package car;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by 1 on 19.07.2017.
 */
public class Car {
    private int dateOfProduction;
    private String typeOfEngine;
    private int maxSpeed;
    private double acceleration;
    private int maxPassenger;
    private int passngerNow;
    private int speedNow;
    private CarDoor[] carDoors = new CarDoor[5];
    private CarWheel[] carWheels = new CarWheel[4];

    public Car(int dateOfProduction) {
        this.dateOfProduction = dateOfProduction;
    }

    public Car(int dateOfProduction, String typeOfEngine, int maxSpeed, double acceleration, int maxPassenger, int passngerNow, int speedNow) {
        this.dateOfProduction = dateOfProduction;
        this.typeOfEngine = typeOfEngine;
        this.maxSpeed = maxSpeed;
        this.acceleration = acceleration;
        this.maxPassenger = maxPassenger;
        this.passngerNow = passngerNow;
        this.speedNow = speedNow;
    }

    public void putPass() {
        if (passngerNow > 0 && passngerNow < maxPassenger) {
            passngerNow++;
            System.out.println("Вы посадили одного пассажира");
        } else {
            System.out.println("В машине нет места для пассажиров");
        }
    }

    public void outPass() {
        if (passngerNow > 0 && passngerNow <= maxPassenger) {
            passngerNow--;
            System.out.println("Вы высадили одного пассажира");
        } else {
            System.out.println("В машине нет пассажиров");
        }
    }

    public void outAllPass() {
        if (passngerNow > 0 && passngerNow <= maxPassenger) {
            passngerNow = 0;
        }
    }
    public void getDoorFromIndex(int index) {
        boolean x = true;
        for (int i = 0; i < carDoors.length; i++) {
            carDoors[i] = new CarDoor();
            if (index == i) {
                x = carDoors[i].getDoor();
            }
        }
        System.out.println("Состояние двери = " + x);
    }

    public void getWheelFromIndex(int index) {
        double x = 0;
            for(int i = 0; i < carWheels.length; i++){
                carWheels[i] = new CarWheel();
            if (index == i) {
                x = carWheels[i].getWheel();
            }
        }
        System.out.println("Состояние колеса = "+ x);
    }

    public void takeOffAllWheels() {
        for (int i = 0; i < carWheels.length; i++) {
            carWheels[i] = null;
        }
    }

    public void addWheels(int x) {
        CarWheel[]newWheel = new CarWheel[carWheels.length + x];
        System.arraycopy(carWheels,0,newWheel,0,carWheels.length - 1);
        }


    public double maxSpeedNow() {
        double maxSpeedNow;
        for(int i = 0; i < carWheels.length; i++){
            carWheels[i] = new CarWheel();
        }
        double maxEarse = carWheels[0].getWheel();
        if (passngerNow == 0) maxSpeedNow = 0;
        else {
            for (int i = 0; i < carWheels.length; i++) {
                if (maxEarse > carWheels[i].getWheel()) {
                    maxEarse = carWheels[i].getWheel();
                }
            }
            maxSpeedNow = maxSpeed * maxEarse;
        }

        return maxSpeedNow;
    }

    public void setPassngerNow(int passnger) {
        this.passngerNow = passnger;
    }

    public int getPassngerNow() {
        return passngerNow;
    }
    public void setSpeedNow(int speed) {
        if(speedNow > maxSpeedNow()){
            System.out.println("Превышена максимальная скорость");
        }else speedNow = speed;
    }
    public int getSpeedNow() {
        return speedNow;
    }

    public void consoleCarInfo(){
        System.out.println("Дата производства автомобиля: " + dateOfProduction);
        System.out.println("Тип двигателя автомобиля: " + typeOfEngine);
        System.out.println("Максимальная скорость нового автомобиля = " + maxSpeed);
        System.out.println("Разгон до 100км/ч = " + acceleration);
        System.out.println("Пассажиовместимость = " + maxPassenger);
        System.out.println("Текущая скорость = " + speedNow);
        System.out.println("Количество колес = " + carWheels.length);
        System.out.println("Количество дверей = " + carDoors.length);
        System.out.println("Текущее число пассажиров = " + passngerNow);
        System.out.println("Текущая максимальная скорость = " + speedNow);



    }
}
