package by.epam.student.dobrov.mod4.AggrClasses2;

/*
Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.
 */
public class Engine {

    private boolean powerStatus;

    public Engine() {
        this.powerStatus = false;
    }

    public boolean isPowerStatus() {
        return powerStatus;
    }

    public void setPowerStatus(boolean powerStatus) {
        this.powerStatus = powerStatus;
    }

    @Override
    public String toString() {
        return String.format("Engine{" +
                "powerStatus=" + powerStatus +
                '}');
    }
}
