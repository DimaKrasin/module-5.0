package car;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by 1 on 19.07.2017.
 */
public class CarDoor {
    private boolean door = false;
    private boolean window = false;

    CarDoor(){

    }
    public CarDoor (boolean door, boolean window){
        this.door = door;
        this.window = window;
    }

    public void openDoor() {
        if (door == false) {
            door = true;
            System.out.println("Дверь открыта");
        }
    }
    public void closeDoor(){
        if(door){
            door=false;
            System.out.println("Дверь закрыта");
        }

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
        }
    }
    public void closeWindow(){
        if(window==true){
            window=false;
            System.out.println("Закрывем окно");
        }
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
