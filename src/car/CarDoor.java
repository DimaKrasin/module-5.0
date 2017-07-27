package car;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by 1 on 19.07.2017.
 */
public class CarDoor {
    private boolean door;
    private boolean window;

    public CarDoor (){
        this.door = false;
        this.window = false;
    }
    CarDoor(boolean door, boolean window){
        this.door = false;
        this.window = false;
    }

    public void openDoor() {
        if (door == false) {
            door = true;
            System.out.println("Открываем дверь");
        }else System.out.println("Дверь открыта");
    }
    public void closeDoor(){
        if(door){
            door=false;
            System.out.println("Закрываем дверь");
        }else System.out.println("Дверь закрыта");

    }
    public void invertDoor(){
        if(door){
            door=false;
            System.out.println("Закрываем открытые двери");
        }else{
            door = true;
            System.out.println("Открываем закрытые двери");
        }
    }

    public void openWindow(){
        if(window==false){
            window=true;
            System.out.println("Открываем окно");
        }else System.out.println("Окно открыто");
    }
    public void closeWindow(){
        if(window){
            window=false;
            System.out.println("Закрывем окно");
        }else System.out.println("Окно закрыто");
    }
    public void invertWindow(){
        if(window){
            window=false;
            System.out.println("Закрываем открытое окно");
        }else{
            window = true;
            System.out.println("Открываем закрытое окно");
        }
    }
    public void conditionDoor(){
        if(getDoor()) System.out.println("Дверь открыта");
        else System.out.println("Дверь закрыта");
        if (getWindow()) System.out.println("Окно открыто");
        else System.out.println("Окно закрыто");
    }
    public boolean getDoor(){
        return door;
    }
    public boolean getWindow(){
        return window;
    }
    public void consoleDoorInfo(){
        System.out.println("Состояние дверей:" + getDoor());
        System.out.println("Состояние окна: "+ getWindow());
    }

}
