package by.epam.student.dobrov.mod4.AggrClasses5;

public enum TourType {
    REST("Rest", 500),
    EXCURSIONS("Excursions", 250),
    TREATMENT("Treatment", 700),
    SHOPPING("Shopping", 400),
    CRUISE("Cruise", 450);

    private String tourType;
    private double tourTypePrice;

    TourType(String tourType, double tourTypePrice) {
        this.tourType = tourType;
        this.tourTypePrice = tourTypePrice;
    }

    public String getTourType() {
        return tourType;
    }

    public double getTourTypePrice() {
        return tourTypePrice;
    }

    @Override
    public String toString() {
        return String.format("Тип отдыха: " + tourType + ", Стоимость: " + tourTypePrice);
    }
}
