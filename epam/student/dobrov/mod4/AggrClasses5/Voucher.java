package by.epam.student.dobrov.mod4.AggrClasses5;

/*
Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки различного типа
 (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора.
 Учитывать возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
 */
public class Voucher {

    private TourAgent tourAgent;
    private int daysQuantity;
    private double price;

    public Voucher(TourAgent tourAgent, int daysQuantity) {
        this.tourAgent = tourAgent;
        this.daysQuantity = daysQuantity;

    }

    public TourAgent getTourAgent() {
        return tourAgent;
    }

    public int getDaysQuantity() {
        return daysQuantity;
    }

    public void setPrice(double price) {
        this.price = tourAgent.getPrice();
    }

    public void setDaysQuantity(int daysQuantity) {
        this.daysQuantity = daysQuantity;
    }

    public double getPrice() {
        price = tourAgent.getPrice() + (daysQuantity * 400);
        return price;
    }

    @Override
    public String toString() {
        return String.format("Страна: " + tourAgent.getCountry().getCountryName() + "\n" +
                "Тип тура: " + tourAgent.getTourType().getTourType() + "\n" +
                "Кол-во дней: " + daysQuantity + "\n" +
                "Вид транспорта: " + tourAgent.getTransportType().getTransportType() + "\n" +
                "Тип питания: " + tourAgent.getNutritionType().getNutritionType() + "\n" +
                "Стоимость тура: " + getPrice() + "\n");
    }
}
