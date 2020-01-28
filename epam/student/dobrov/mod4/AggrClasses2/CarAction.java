package by.epam.student.dobrov.mod4.AggrClasses2;

/*
Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.
 */
public class CarAction {
    private Car cars;

    public CarAction(Car car) {
        this.cars = car;
    }

    public Car cargetCars() {
        return cars;
    }

    public void showModel() {
        System.out.println(cars.getModel());
    }

    public boolean isChangeTheWheel() {
        if (cars.getWheels().length >= 4) {
            return false;
        }
        return true;
    }

    public boolean isCheckGas() {
        if (cars.getGas() <= 0) {
            return true;
        }
        return false;
    }

    public boolean isStatusPower() {
        if (cars.isCheckPower()) {
            return true;
        }
        return false;
    }

    public boolean isMove() {
        if (isChangeTheWheel() == false) {
            if (isStatusPower()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("CarAction{" +
                "cars=" + cars +
                '}');
    }
}

