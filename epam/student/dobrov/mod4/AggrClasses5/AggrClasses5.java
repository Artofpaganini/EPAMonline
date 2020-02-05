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

        int daysDesignation = 0;

        TourAgent tourAgent = new TourAgent(countries, tourTypes, transportTypes, nutritionTypes);

        tourAgent.showInfo(countries);
        System.out.println("Сделайте выбор страны: ");
        tourAgent.selectCountry(checkDesignation());

        System.out.println();

        tourAgent.showInfo(tourTypes);
        System.out.println("Сделайте выбор тура: ");
        tourAgent.selectTour(checkDesignation());
        System.out.println();

        tourAgent.showInfo(transportTypes);
        System.out.println("Сделайте выбор транспорта: ");
        tourAgent.selectTransport(checkDesignation());

        System.out.println();

        tourAgent.showInfo(nutritionTypes);
        System.out.println("Сделайте выбор типа питания: ");
        tourAgent.selectNutrition(checkDesignation());

        System.out.println();

        System.out.println("Введите кол-во дней отдыха: ");
        Voucher voucher = new Voucher(tourAgent, checkDaysDesignation(daysDesignation));
        System.out.println(voucher.toString());


        //Сортировка цен по возрастанию
        System.out.println("Сортировка по возрастанию цен: ");



        tourAgent.sortCountries();
        tourAgent.showInfo(countries);
        System.out.println("Сделайте выбор страны: ");
        tourAgent.selectCountry(checkDesignation());

        System.out.println();

        tourAgent.sortTour();
        tourAgent.showInfo(tourTypes);
        System.out.println("Сделайте выбор тура: ");
        tourAgent.selectTour(checkDesignation());

        System.out.println();

        tourAgent.sortTransport();
        tourAgent.showInfo(transportTypes);
        System.out.println("Сделайте выбор транспорта: ");
        tourAgent.selectTransport(checkDesignation());

        System.out.println();

        tourAgent.sortNutrition();
        tourAgent.showInfo(nutritionTypes);
        System.out.println("Сделайте выбор типа питания: ");
        tourAgent.selectNutrition(checkDesignation());

        System.out.println();

        System.out.println("Введите кол-во дней отдыха: ");
        voucher.setDaysQuantity(checkDaysDesignation(daysDesignation));
        System.out.println(voucher.toString());

    }

    public static String checkDesignation() {
        Scanner sc = new Scanner(System.in);
        String designation = new String();
        if (designation.isEmpty()) {
            designation = sc.nextLine();
        } else {
            sc.nextLine();
        }
        return designation;
    }

    public static int checkDaysDesignation(int daysDesignation) {
        Scanner sc = new Scanner(System.in);

        if (daysDesignation == 0) {
            daysDesignation = sc.nextInt();
        } else {
            sc.nextInt();
            daysDesignation = sc.nextInt();
        }
        return daysDesignation;
    }
}

