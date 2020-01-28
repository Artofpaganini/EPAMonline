package by.epam.student.dobrov.mod4.Classes8;

import java.util.Arrays;

/*
Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод toString().
Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и методами.
Задать критерии выбора данныхи вывести эти данные на консоль.
Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.

Найти и вывести:
a) список покупателей в алфавитном порядке;
b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
 */
public class Classes8 {
    public static void main(String args[]) {

        Customer[] customers = new Customer[3];
        customers[0] = new Customer(111, "Qwert7", "Qwert1", "Qwert1", "Qwe1", 1111, 1111);
        customers[1] = new Customer(222, "Qwert1", "Qwert2", "Qwert2", "Qwe2", 2222, 2222);
        customers[2] = new Customer(333, "Qwert3", "Qwert3", "Qwert3", "Qwe3", 3333, 3333);


        DataCustomers dataCustomers = new DataCustomers(customers);
        dataCustomers.showCustomer();

        System.out.println();

        dataCustomers.sortBySurname();

        System.out.println();

        dataCustomers.showCustomer();

        System.out.println();

        Customer[] arrayCustomer =dataCustomers.dataCustomersByCreditCard(1000, 2500);
        dataCustomers.showCustomer(arrayCustomer);
    }


}



