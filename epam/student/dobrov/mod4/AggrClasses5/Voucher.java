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
/*
 клиенту выдается список страны , он вводит  ее номер , после чего   если данный номер есть в  каталоге стран  то
 страна  присваивается  в ваучер а ее  цена  в гет прайс

 сортировка путевок   зависит  от варианта   на который будет ссылаться клиент  ,  т.е. у нас будет метод который принимает  обджект  и  производит
  сортировку взависимости от того  что было  выбрано , старан или тур  или
 */