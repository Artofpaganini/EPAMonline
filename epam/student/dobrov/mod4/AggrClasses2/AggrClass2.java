package by.epam.student.dobrov.mod4.AggrClasses2;

import java.util.ArrayList;
import java.util.List;

/*
Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.
 */

//  надо поебаться с поиском и поиском для блокировки
public class AggrClass2 {
    public static void main(String[] args) {

        Engine engine1 = new Engine();
        Engine engine2 = new Engine();
        Engine engine3 = new Engine();

        List<Car> cars = new ArrayList<>();

        cars.add(new Car("Audi", 50, engine1, new Wheel[3]));
        cars.add(new Car("BMW", 0, engine2, new Wheel[6]));
        cars.add(new Car("Subaru", 1, engine3, new Wheel[4]));

        for (int i = 0; i < cars.size(); i++) {
            CarAction carAction = new CarAction(cars.get(i));
            carAction.showModel();
            carAction.isCheckGas();
        }

        System.out.println();

        for (int i = 0; i < cars.size(); i++) {
            CarAction carAction = new CarAction(cars.get(i));
            System.out.println("Нужна ли замена колеса? " + carAction.isChangeTheWheel());
        }

        System.out.println();

        for (int i = 0; i < cars.size(); i++) {
            CarAction carAction = new CarAction(cars.get(i));
            System.out.println("Нужна ли заправка? " + carAction.isCheckGas());
        }

        System.out.println();

        for (int i = 0; i < cars.size(); i++) {
            CarAction carAction = new CarAction(cars.get(i));
            System.out.println("Включается ли двигатель? " + carAction.isStatusPower());
        }

        System.out.println();

        for (int i = 0; i < cars.size(); i++) {
            CarAction carAction = new CarAction(cars.get(i));
            System.out.println("Можно ехать? " + carAction.isMove());
        }
    }
}
