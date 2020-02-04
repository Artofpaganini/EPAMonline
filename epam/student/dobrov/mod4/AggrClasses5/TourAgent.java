package by.epam.student.dobrov.mod4.AggrClasses5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки различного типа
(отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора.
 Учитывать возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
 */
public class TourAgent {

    private Country[] countries;
    private TourType[] tourTypes;
    private TransportType[] transportTypes;
    private NutritionType[] nutritionTypes;

    private Country country;
    private TourType tourType;
    private TransportType transportType;
    private NutritionType nutritionType;


    private double price;

    public TourAgent(Country[] countries, TourType[] tourTypes, TransportType[] transportTypes, NutritionType[] nutritionTypes) {
        this.countries = countries;
        this.tourTypes = tourTypes;
        this.transportTypes = transportTypes;
        this.nutritionTypes = nutritionTypes;
    }

//    public TourAgent(Country country, TourType tourType, TransportType transportType, NutritionType nutritionType) {
//        this.country = country;
//        this.tourType = tourType;
//        this.transportType = transportType;
//        this.nutritionType = nutritionType;
//    }

    public Country[] getCountries() {
        return countries;
    }

    public TourType[] getTourTypes() {
        return tourTypes;
    }

    public TransportType[] getTransportTypes() {
        return transportTypes;
    }

    public NutritionType[] getNutritionTypes() {
        return nutritionTypes;
    }

    public void setCountries(Country[] countries) {
        this.countries = countries;
    }

    public void setTourTypes(TourType[] tourTypes) {
        this.tourTypes = tourTypes;
    }

    public void setTransportTypes(TransportType[] transportTypes) {
        this.transportTypes = transportTypes;
    }

    public void setNutritionTypes(NutritionType[] nutritionTypes) {
        this.nutritionTypes = nutritionTypes;
    }


    public Country getCountry() {
        return country;
    }

    public TourType getTourType() {
        return tourType;
    }

    public TransportType getTransportType() {
        return transportType;
    }

    public NutritionType getNutritionType() {
        return nutritionType;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public void setTourType(TourType tourType) {
        this.tourType = tourType;
    }

    public void setTransportType(TransportType transportType) {
        this.transportType = transportType;
    }

    public void setNutritionType(NutritionType nutritionType) {
        this.nutritionType = nutritionType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void showInfo(Object[] object) {
        for (Object i : object) {
            System.out.println(i.toString());
        }
    }

     public boolean isCheckDesignation(String string1,String string2){
        if ( string1.equalsIgnoreCase(string2)){
            return true;
        }
        return false;
     }

    public void selectCountry(String designation) {

        for (Country i : countries) {
            if (isCheckDesignation(i.getCountryName(),designation)) {
                setCountry(i);
                setPrice(i.getCountryPrice() + getPrice());
            }
        }
    }

    public void selectTour(String designation) {

        for (TourType i : tourTypes) {
            if (isCheckDesignation(i.getTourType(),designation)) {
                setTourType(i);
                setPrice(i.getTourTypePrice() + getPrice());
            }
        }
    }

    public void selectTransport(String designation) {

        for (TransportType i : transportTypes) {
            if (isCheckDesignation(i.getTransportType(),designation)) {
                setTransportType(i);
                setPrice(i.getTransportTypePrice() + getPrice());
            }
        }
    }

    public void selectNutrition(String designation) {

        for (NutritionType i : nutritionTypes) {
            if (isCheckDesignation(i.getNutritionType(),designation)) {
                setNutritionType(i);
                setPrice(i.getNutritionTypePrice() + getPrice());
            }
        }
    }
    //можно сделать один метод  для  них всех с указанием  входных  параметров как ссылуи на объект. но нужно ли?


    public Country[] sortCountries() {

        Country temp;
        double price1 = 0;
        double price2 = 0;
        Country[] sortCountries = new Country[countries.length];

        for (int i = countries.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                price1 = countries[j].getCountryPrice();
                price2 = countries[j + 1].getCountryPrice();
                if (price1 > price2) {
                    temp = countries[j];
                    countries[j] = countries[j + 1];
                    countries[j + 1] = temp;
                }
            }
            sortCountries = countries;
        }
        return sortCountries;

    }

    public TourType[] sortTour() {

        TourType temp;
        double price1 = 0;
        double price2 = 0;
        TourType[] sortTour = new TourType[tourTypes.length];

        for (int i = tourTypes.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                price1 = tourTypes[j].getTourTypePrice();
                price2 = tourTypes[j + 1].getTourTypePrice();
                if (price1 > price2) {
                    temp = tourTypes[j];
                    tourTypes[j] = tourTypes[j + 1];
                    tourTypes[j + 1] = temp;
                }
            }
            sortTour = tourTypes;
        }
        return sortTour;
    }

    public TransportType[] sortTransport() {

        TransportType temp;
        double price1 = 0;
        double price2 = 0;
        TransportType[] sortTransport = new TransportType[transportTypes.length];

        for (int i = transportTypes.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                price1 = transportTypes[j].getTransportTypePrice();
                price2 = transportTypes[j + 1].getTransportTypePrice();
                if (price1 > price2) {
                    temp = transportTypes[j];
                    transportTypes[j] = transportTypes[j + 1];
                    transportTypes[j + 1] = temp;
                }
            }
            sortTransport = transportTypes;
        }
        return sortTransport;
    }

    public NutritionType[] sortNutrition() {

        NutritionType temp;
        double price1 = 0;
        double price2 = 0;
        NutritionType[] sortNutrition = new NutritionType[nutritionTypes.length];

        for (int i = nutritionTypes.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                price1 = nutritionTypes[j].getNutritionTypePrice();
                price2 = nutritionTypes[j + 1].getNutritionTypePrice();
                if (price1 > price2) {
                    temp = nutritionTypes[j];
                    nutritionTypes[j] = nutritionTypes[j + 1];
                    nutritionTypes[j + 1] = temp;
                }
            }
            sortNutrition = nutritionTypes;
        }
        return sortNutrition;
    }
}

/*
 клиенту выдается список стран , он вводит  ее номер , после чего   если данный номер есть в  каталоге стран  то
 страна  присваивается  в ваучер а ее  цена  в гет прайс
 список  стран  предоставляет  турагент
 из массива выбирается    конкретный  тип страны и  присваивается ваучеру

 отсортировать по ценнику
 */



