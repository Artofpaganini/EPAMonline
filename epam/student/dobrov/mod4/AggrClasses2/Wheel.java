package by.epam.student.dobrov.mod4.AggrClasses2;

import java.util.Arrays;

/*
Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.
 */
public class Wheel {
    private int[] wheels;

    public Wheel(int[] wheels) {
        this.wheels = wheels;
    }

    public int[] getWheels() {
        return wheels;
    }

    @Override
    public String toString() {
        return String.format("Wheel{" +
                "wheels=" + Arrays.toString(wheels) +
                '}');
    }
}
