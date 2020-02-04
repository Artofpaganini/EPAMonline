package by.epam.student.dobrov.mod4.AggrClasses5;

public enum TransportType {
    AIRPLANE("Airplane", 200),
    BUS("Bus", 50),
    TRAIN("Train", 100),
    SHIP("Ship", 150);

    private String transportType;
    private double transportTypePrice;

    TransportType(String transportType, double transportTypePrice) {
        this.transportType = transportType;
        this.transportTypePrice = transportTypePrice;
    }

    public String getTransportType() {
        return transportType;
    }

    public double getTransportTypePrice() {
        return transportTypePrice;
    }

    @Override
    public String toString() {
        return String.format("Тип транспорта: " + transportType + ", Стоимость: " + transportTypePrice);
    }
}
