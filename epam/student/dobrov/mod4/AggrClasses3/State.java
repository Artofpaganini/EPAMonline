package by.epam.student.dobrov.mod4.AggrClasses3;

import java.util.Arrays;

//Методы: вывести на консоль столицу, количество областей, площадь, областные центры.
//___________________________________________
class State {

    private City capital;
    private Area[] area;

    public State(City capital, Area... area) {
        this.capital = capital;
        this.area = area;
    }

    public City getCapital() {
        return capital;
    }

    public void setCapital(City capital) {
        this.capital = capital;
    }

    public Area[] getArea() {
        return area;
    }

    public void setArea(Area[] area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "State{" +
                "capital=" + capital +
                ", area=" + Arrays.toString(area) +
                '}';
    }

    public int getQuantityOfAreas() {
        return area.length;
    }


    public int getSquareOfState() {
        int sumSquare = 0;
        for (Area i : area) {
            sumSquare += i.getSquareOfArea();

        }
        return sumSquare;
    }

    // вывести областные центра , находятся в классе область , переменная типа город
    public City[] getAreaCityCentre() {
        City[] arr = new City[area.length];

        for (int i = 0; i < area.length; i++) {

            arr[i] = area[i].getAreaCityName();
        }

        return arr;
    }

}
