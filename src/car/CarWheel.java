package car;

/**
 * Created by 1 on 19.07.2017.
 */
public class CarWheel {
    private double wheel = 1;

    public CarWheel(){

    }
    public CarWheel(double wheel){
        this.wheel = wheel;
    }


    public double changeWheel(){
        if(wheel >=0 && wheel <= 1);
            return 1;
    }
    public double earseWheel(double x){
        if(x > 100 || x < 0){
            System.out.println("Вы ввели неверное число");
        }
        else wheel -= x/100;
        if (wheel <= 0){
            System.out.println("Вы спалили колесо, нужно ставить новое");
            wheel = 1;
        }return  wheel;
    }

    public double getWheel() {
        return wheel;
    }

    public void consoleWheelInfo(){
        System.out.println("Текущее состояние шины: " + getWheel());
    }

}
