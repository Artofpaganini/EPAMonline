package by.epam.student.dobrov.mod4.AggrClasses5;

public enum Country {
    THAILAND("Thailand", 500),
    RUSSIA("Russia", 250),
    SINGAPURE("Singapure", 700),
    SPAIN("Spain", 400),
    GERMANY("Germany", 450);

    private String countryName;
    private double countryPrice;

    Country(String countryName, double countryPrice) {
        this.countryName = countryName;
        this.countryPrice = countryPrice;

    }

    public String getCountryName() {
        return countryName;
    }

    public double getCountryPrice() {
        return countryPrice;
    }

    @Override
    public String toString() {
        return String.format("Страна:" + " - " + countryName + ", Стоимость: " + countryPrice);
    }

}
