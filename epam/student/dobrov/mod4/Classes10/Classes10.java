package by.epam.student.dobrov.mod4.Classes10;

import java.util.Arrays;

/*
Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
и метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и
методами. Задать критерии выбора данных и вывести эти данные на консоль.
Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
Найти и вывести:
a) список рейсов для заданного пункта назначения;
b) список рейсов для заданного дня недели;
c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
 */
public class Classes10 {
    public static void main(String args[]) {

        Airline[] airline = new Airline[5];
        airline[0] = new Airline("Minsk", "123qwe", "airplane1", 1, 11, "Friday");
        airline[1] = new Airline("Grodno", "321qwe", "airplane2", 2, 22, "Monday");
        airline[2] = new Airline("Minsk", "231qwe", "airplane3", 3, 33, "Wednesday");
        airline[3] = new Airline("Pinsk", "132qwe", "airplane4", 4, 44, "Monday");
        airline[4] = new Airline("Minsk", "312qwe", "airplane5", 5, 55, "Monday");


        AirlineInformation airlineInfo = new AirlineInformation(airline);

        airlineInfo.outPutInformation();

        System.out.println();

        Airline[] arrayAirlineInfo = airlineInfo.flightTillTargetPlace("Minsk");

        airlineInfo.outPutInformation(arrayAirlineInfo);

        System.out.println();

        arrayAirlineInfo = airlineInfo.flightByDays("Tuesday");

        airlineInfo.outPutInformation(arrayAirlineInfo);

        System.out.println();

        arrayAirlineInfo = airlineInfo.flightByDaysAndTime("Monday", 2, 11);

        airlineInfo.outPutInformation(arrayAirlineInfo);

    }
}

