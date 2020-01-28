package by.epam.student.dobrov.mod4.AggrClasses3;

import java.util.Arrays;

//Методы: вывести на консоль столицу, количество областей, площадь, областные центры.
//___________________________________________
class Area {
    private District[] districts;
    private City areaCityCentre;

    public Area(City areaCityCentre, District... districts) {
        this.areaCityCentre = areaCityCentre;
        this.districts = districts;
    }

    public District[] getDistricts() {
        return districts;
    }

    public void setDistricts(District[] districts) {
        this.districts = districts;
    }

    public City getAreaCityCentre() {
        return areaCityCentre;
    }

    public void setAreaCityCentre(City areaCityCentre) {
        this.areaCityCentre = areaCityCentre;
    }

    @Override
    public String toString() {
        return "Area{" +
                "districts=" + Arrays.toString(districts) +
                ", areaCityCentre=" + areaCityCentre +
                '}';
    }

    public int getSquareOfArea() {
        int sumSquare = 0;

        for (District i : districts) {
            sumSquare += i.getSquareOfDistrict();
        }
        return sumSquare;
    }

    public City getAreaCityName() {
        return areaCityCentre;
    }
}
