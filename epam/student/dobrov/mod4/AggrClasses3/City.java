package by.epam.student.dobrov.mod4.AggrClasses3;

//Методы: вывести на консоль столицу, количество областей, площадь, областные центры.
//___________________________________________
class City {
    private String cityName;

    public City(String cityName) {
        this.cityName = cityName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @Override
    public String toString() {
        System.out.println();
        return String.format("City{" +
                "cityName='" + cityName + '\'' +
                '}');
    }
}
