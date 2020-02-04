package by.epam.student.dobrov.mod4.AggrClasses5;

public enum NutritionType {
    UAI("UAI", 120),
    AU("AU", 100),
    BB("BB", 40),
    HB("HB", 60),
    FB("FB", 80),
    RO("RO", 20);

    private String nutritionType;
    private double nutritionTypePrice;

    NutritionType(String nutritionType, double nutritionTypePrice) {
        this.nutritionType = nutritionType;
        this.nutritionTypePrice = nutritionTypePrice;
    }

    public String getNutritionType() {
        return nutritionType;
    }

    public double getNutritionTypePrice() {
        return nutritionTypePrice;
    }

    @Override
    public String toString() {
        return String.format("Тип питания: " + nutritionType + ", Стоимость: " + nutritionTypePrice);
    }
}
