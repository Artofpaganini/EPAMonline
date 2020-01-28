package by.epam.student.dobrov.mod4.AggrClasses4;

import java.util.Arrays;

/*
Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета. Реализовать поиск и сортировку счетов.
Вычисление общей суммы по счетам. Вычисление суммы по всем счетам, имеющим положительный и отрицательный балансы отдельно.
 */
public class Bank {
    private Client[] clients;

    public Bank(Client... clients) {
        this.clients = clients;

    }

    public Client[] getClients() {
        return clients;
    }

    public void isAccountSearch(int number) {
        Account correctNum = null;
        for (Client i : clients) {
            if (i.isAccNum(number)){
                correctNum = i.findAccount(number);
                // невоводит на консоль  ответа поиска аккаунта, выбивает ошибку если акк не верный
            }
        }
        System.out.println(correctNum);
    }

    public void statusChange(int accNum) {
        for (Client i : clients) {
            if (i.isChangeStatus(accNum)) {
                break;
            }
        }
    }

    public void sortAcc() {
        for (Client i : clients) {
            i.sortAcc();
        }
    }

    public int[] totalSum() {
        int[] sumArr = new int[clients.length];

        for (int i = 0; i < sumArr.length; ) {
            for (int j = 0; j < clients.length; j++) {
                sumArr[i] = clients[j].showTotalSum();
                i++;
            }
        }
        return sumArr;
    }

    public int showPositiveSumOfAllAcc() {
        int sumPos = 0;

        for (Client i : clients) {
            sumPos += i.showTotalPositiveSum();
        }
        return sumPos;
    }

    public int showNegativeSumOfAllAcc() {
        int sumNeg = 0;

        for (Client i : clients) {
            sumNeg += i.showTotalNegativeSum();
        }
        return sumNeg;
    }

    public void showInfo() {
        for (int i = 0; i < clients.length; i++) {
            System.out.println(getClients()[i]);
        }
    }

    @Override
    public String toString() {
        return String.format("Bank{" +
                "clients=" + Arrays.toString(clients) +
                '}');
    }
}
