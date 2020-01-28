package by.epam.student.dobrov.mod4.AggrClasses4;

import java.util.Scanner;

/*
Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета. Реализовать поиск и сортировку счетов.
Вычисление общей суммы по счетам. Вычисление суммы по всем счетам, имеющим положительный и отрицательный балансы отдельно.
 */
public class AggrClass4 {
    public static void main(String[] args) {

        Account account1 = new Account(111, 111);
        Account account2 = new Account(222, -222);
        Account account3 = new Account(333, 333);
        Account account4 = new Account(444, -444);
        Account account5 = new Account(555, -555);

        Client client1 = new Client(account3, account1);
        Client client2 = new Client(account5, account4);
        Client client3 = new Client(account2);


        Bank bank = new Bank(client1, client2, client3);
        bank.showInfo();

        System.out.println();

        //Поиск
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите № счета: ");
        int numAccount = sc.nextInt();
        bank.isAccountSearch(numAccount);

        System.out.println();

        //блокировка счета
        System.out.println("Введите № счета для блокировки: ");
        int accNum = sc.nextInt();
        bank.statusChange(accNum);
        bank.showInfo();

        System.out.println();

        //сортировка
        bank.sortAcc();
        bank.showInfo();

        System.out.println();

        // сумма счетов каждого клиента
        int[] sumArr = bank.totalSum();
        System.out.println("Суммы счетов каждого клиента = ");

        for (int i = 0; i < sumArr.length; i++) {
            System.out.println(sumArr[i]);
        }

        System.out.println();

        //Сумма счетов с положительным балансом
        int sumPos = bank.showPositiveSumOfAllAcc();
        System.out.println("Сумма всех счетов с  положительным балансом " + sumPos);

        //Сумма счетов с отрицательным балансом
        int sumNeg = bank.showNegativeSumOfAllAcc();
        System.out.println("Сумма всех счетов с  отрицательным балансом " + sumNeg);
    }

}
