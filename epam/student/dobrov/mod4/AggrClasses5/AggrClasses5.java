package by.epam.student.dobrov.mod4.AggrClasses5;

import java.util.*;

/*
Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки различного типа
(отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора.
 Учитывать возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
 */
public class AggrClasses5 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Country[] countries = Country.values();
        TourType[] tourTypes = TourType.values();
        TransportType[] transportTypes = TransportType.values();
        NutritionType[] nutritionTypes = NutritionType.values();

        TourAgent tourAgent = new TourAgent(countries, tourTypes, transportTypes, nutritionTypes);


        tourAgent.showInfo(countries);
        System.out.println("Сделайте выбор страны: ");
        String designationCountry1 = sc.nextLine();
        tourAgent.selectCountry(designationCountry1);

        System.out.println();

        tourAgent.showInfo(tourTypes);
        System.out.println("Сделайте выбор тура: ");
        String designationTour1 = sc.nextLine();
        tourAgent.selectTour(designationTour1);

        System.out.println();

        tourAgent.showInfo(transportTypes);
        System.out.println("Сделайте выбор транспорта: ");
        String designationTransport1 = sc.nextLine();
        tourAgent.selectTransport(designationTransport1);

        System.out.println();

        tourAgent.showInfo(nutritionTypes);
        System.out.println("Сделайте выбор типа питания: ");
        String designationNutrition1 = sc.nextLine();
        tourAgent.selectNutrition(designationNutrition1);

        System.out.println();

        System.out.println("Введите кол-во дней отдыха: ");
        int daysQuantity = sc.nextInt();
        Voucher voucher = new Voucher(tourAgent, daysQuantity);
        System.out.println(voucher.toString());


        //Сортировка цен по возрастанию

        // как сделать  так что бы  вводить значение через сканер  постоянно и за счет одного стринга  а не  создавать его постоянно
        System.out.println("Сортировка по возрастанию цен: ");
// почему сканер  перепрыгивает в месте где  начинается новый переменные

        tourAgent.sortCountries();
        tourAgent.showInfo(countries);
        System.out.println("Сделайте выбор страны: ");
        String designationCountry2 = sc.nextLine();
        tourAgent.selectCountry(designationCountry2);

        System.out.println();

        tourAgent.sortTour();
        tourAgent.showInfo(tourTypes);
        System.out.println("Сделайте выбор тура: ");
        String designationTour2 = sc.nextLine();
        tourAgent.selectTour(designationTour2);

        System.out.println();

        tourAgent.sortTransport();
        tourAgent.showInfo(transportTypes);
        System.out.println("Сделайте выбор транспорта: ");
        String designationTransport2 = sc.nextLine();
        tourAgent.selectTransport(designationTransport2);

        System.out.println();

        tourAgent.sortNutrition();
        tourAgent.showInfo(nutritionTypes);
        System.out.println("Сделайте выбор типа питания: ");
        String designationNutrition2 = sc.nextLine();
        tourAgent.selectNutrition(designationNutrition2);

        System.out.println();

        System.out.println("Введите кол-во дней отдыха: ");
        daysQuantity = sc.nextInt();
        System.out.println(voucher.toString());

    }

}

/*
 клиенту выдается список страны , он вводит  ее номер , после чего   если данный номер есть в  каталоге стран  то
 страна  присваивается  в ваучер а ее  цена  в гет прайс
 */