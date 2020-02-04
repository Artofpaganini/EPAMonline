package by.epam.student.dobrov.mod4.AggrClasses5;

public enum DaysQuantity {
    SEVEN(7,150),
    FORTEEN(14,300),
    TWENTYONE(21,420),
    TWENTYEIGHT(28,520);

    private int daysQuantity;
    private double daysQuantityPrice;


    DaysQuantity(int daysQuantity, double daysQuantityPrice) {
        this.daysQuantity = daysQuantity;
        this.daysQuantityPrice = daysQuantityPrice;
    }

    public int getDaysQuantity() {
        return daysQuantity;
    }

    public double getDaysQuantityPrice() {
        return daysQuantityPrice;
    }

    @Override
    public String toString() {
        return String.format("DaysQuantity{" +
                "daysQuantity=" + daysQuantity +
                ", daysQuantityPrice=" + daysQuantityPrice +
                '}');
    }
}
