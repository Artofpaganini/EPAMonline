package by.epam.student.dobrov.mod4.AggrClasses2;

import java.util.Arrays;

/*
Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.
 */
public class Car {
    private String model;
    private int gas;

    private Engine engine;
    private Wheel[] wheels;


    public Car(String model, int gas, Engine engine, Wheel[] wheel) {
        this.model = model;
        this.gas = gas;
        this.engine = engine;
        this.wheels = wheel;

    }

    public String getModel() {
        return model;
    }

    public int getGas() {
        return gas;
    }

    public Engine getEngine() {
        return engine;
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public boolean isCheckPower() {
        if (gas > 0) {
            engine.setPowerStatus(true);
        }
        return engine.isPowerStatus();
    }

    @Override
    public String toString() {
        return String.format("Car{" +
                "model='" + model + '\'' +
                ", gas=" + gas +
                ", engine=" + engine +
                ", wheels=" + Arrays.toString(wheels) +
                '}');
    }
}
