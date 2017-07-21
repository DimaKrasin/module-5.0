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
    public void conditinnWheel(){
        if(wheel==0){
            System.out.println("Шина стерта");
        }if(wheel==1){
            System.out.println("Шина новая");
        }
    }
    public double changeWheel(){
        if(wheel >=0 && wheel <= 1);
            return 1;
    }
    public double earseWheel(double x){
        return wheel - x/100;
    }

    public double getWheel() {
        return wheel;
    }

    public void consoleWheelInfo(){
        System.out.println("Текущее состояние шины: " + getWheel());
    }

}
