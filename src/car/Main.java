package car;

import java.util.Scanner;

/**
 * Created by 1 on 21.07.2017.
 */
public class Main {
    public static void main(String[] args) {
        CarDoor carDoor = new CarDoor();
        CarWheel carWheel = new CarWheel();
        Car car = new Car(21072017,"DVS",230,5.6,
                5,3,140);
            boolean x = true;
            do {
                Scanner sc = new Scanner(System.in);
                System.out.println
                        ("Выберите действие, которое хотели бы поизвести с автомобилем: " + "\n" +
                                "1.Узнать состояние дверей и окон"+ "\n" +
                                "2.Открыть дверь "+ "\n" +
                                "3.Закрыть дверь"+ "\n" +
                                "4.Открыть окно" + "\n" +
                                "5.Закрыть окно" + "\n" +
                                "6.Узнать состояние шин (0 - стерто/1 - новое)" + "\n" +
                                "7.Поменять шину на новую " + "\n" +
                                "8.Стереть шину на X%" + "\n" +
                                "9.Изменить текущую скорость автомобиля" + "\n" +
                                "10.Посадить 1 пассажира в автомобиль" + "\n" +
                                "11.Высадить 1 пассажира из автомобиля" + "\n" +
                                "12.Высадить всех пассажиров из автомобиля" + "\n" +
                                "13.Получить дверь по индексу" + "\n" +
                                "14.Получить колесо по индексу" + "\n" +
                                "15.Снять все колеса с машины" + "\n" +
                                "16.Установить на машину Х новых колес" + "\n" +
                                "17.Узнать текущую максимальную скорость автомобиля" + "\n" +
                                "18.Посмотреть техпаспорт автомобиля" + "\n" + "\n" + "Введите число");

                int action = sc.nextInt();
                int argument;
                double argument2;
                String str;
                String y = "y";
                switch (action) {
                    case 1:
                        carDoor.conditionDoor();
                        break;
                    case 2:
                        carDoor.openDoor();
                        break;
                    case 3:
                        carDoor.closeDoor();
                        break;
                    case 4:
                        carDoor.openWindow();
                        break;
                    case 5:
                        carDoor.closeWindow();
                        break;
                    case 6:
                        carWheel.consoleWheelInfo();
                        break;
                    case 7:
                        carWheel.changeWheel();
                        break;
                    case 8:
                        System.out.println("Сотрите шину на число Х:");
                        argument2 = sc.nextDouble();
                        carWheel.earseWheel(argument2);
                        break;
                    case 9:
                        System.out.println("Введите скорость");
                        argument = sc.nextInt();
                        car.setSpeedNow(argument);
                        break;
                    case 10:
                        car.putPass();
                        break;
                    case 11:
                        car.outPass();
                        break;
                    case 12:
                        car.outAllPass();
                        break;
                    case 13:
                        System.out.println("Введите номер двери");
                        argument = sc.nextInt();
                        System.out.println(car.getDoorFromIndex(argument));
                        break;
                    case 14:
                        argument = sc.nextInt();
                        car.getWheelFromIndex(argument);
                        break;
                    case 15:
                        car.takeOffAllWheels();
                        break;
                    case 16:
                        System.out.println("Введите количество колес");
                        argument = sc.nextInt();
                        car.addWheels(argument);
                        break;
                    case 17:
                        car.maxSpeedNow();
                        break;
                    case 18:
                        car.consoleCarInfo();
                        break;
                    default:
                        System.out.println("Вы выбрали неверное действие.");
                }
                sc.nextLine();
                System.out.println("Хотите подолжить?: Y/N");
                str = sc.nextLine();
                if(y.equals(str)){x=true;}
                else x=false;
            }while (x);
        }
    }

