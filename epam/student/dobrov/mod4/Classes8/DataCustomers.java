package by.epam.student.dobrov.mod4.Classes8;

import java.util.Arrays;

class DataCustomers {

    private Customer[] customers;


    public DataCustomers(Customer[] customers) {
        this.customers = customers;

    }

    public Customer[] getCustomers() {
        return customers;
    }

    @Override
    public String toString() {
        return String.format("DataCustomers{" +
                "customers=" + Arrays.toString(customers) +
                '}');
    }

    //список покупателей в алфавитном порядке;
    public void sortBySurname() {

        Customer temp;

        for (int i = customers.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (customers[j].getSurname().compareTo(customers[j + 1].getSurname()) > 0) {
                    temp = customers[j];
                    customers[j] = customers[j + 1];
                    customers[j + 1] = temp;

                }
            }
            ;
        }

    }
    //список покупателей, у которых номер кредитной карточки находится в заданном интервале
    public Customer[] dataCustomersByCreditCard(int a, int b) {

        int counter = 0;
        for (int i = 0; i < this.customers.length; i++) {
            if (customers[i].getNumberOfCreditCard() >= a && customers[i].getNumberOfCreditCard() <= b) {
                counter++;
            }
        }
        Customer customersNew[] = new Customer[counter];
        int j = 0;

        for (int i = 0; i < this.customers.length; i++) {
            if (customers[i].getNumberOfCreditCard() >= a && customers[i].getNumberOfCreditCard() <= b) {
                customersNew[j] = customers[i];
                j++;
            }
        }
        return customersNew;
    }

    //вывод на консоль
    public void showCustomer() {

        for (int i = 0; i < customers.length; i++) {
            System.out.println(customers[i]);
        }

    }

    //вывод на консоль с параметрами
    public void showCustomer(Customer[] customers) {

        for (int i = 0; i < customers.length; i++) {
            System.out.println(customers[i]);
        }

    }


}
