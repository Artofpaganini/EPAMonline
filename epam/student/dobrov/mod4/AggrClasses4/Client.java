package by.epam.student.dobrov.mod4.AggrClasses4;

import java.util.Arrays;

/*
Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета. Реализовать поиск и сортировку счетов.
Вычисление общей суммы по счетам. Вычисление суммы по всем счетам, имеющим положительный и отрицательный балансы отдельно.
 */
public class Client {
    private Account[] account;

    public Client(Account... account) {
        this.account = account;
    }

    public Account[] getAccount() {
        return account;
    }

    public boolean isAccNum(int number) {
        for (Account i : account) {
            if (i.getAccNumber() == number) {
                return true;

            }
        }
        return false;
    }

    public Account findAccount(int number) {
        Account correctAcc = null;
        for (Account i : account) {
            if (isAccNum(number)) {
                correctAcc = i;

            }
        }
        return correctAcc;
    }


    public boolean isChangeStatus(int accNum) {
        for (Account i : account) {
            if (i.getAccNumber() == accNum) {
                if (findAccount(accNum).getAccNumber() == accNum) {
                    i.setAccStatus(false);
                    return true;
                }
            }
        }
        return false;

    }

    public Account[] sortAcc() {
        Account tempAcc;
        Account[] newSortAcc = new Account[account.length];

        for (int i = account.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (account[j].getAccNumber() > account[j + 1].getAccNumber()) {
                    tempAcc = account[j];
                    account[j] = account[j + 1];
                    account[j + 1] = tempAcc;
                }

            }
        }
        return newSortAcc;
    }

    public int showTotalSum() {
        int sum = 0;

        for (Account i : account) {
            sum += i.getBalance();
        }
        return sum;
    }

    //вычисление общей суммы по всем счетам одельно, положительные с положительными, отрицательные с отрицательными

    public int showTotalPositiveSum() {
        int sum = 0;

        for (Account i : account) {
            if (i.getBalance() > 0) {
                sum += i.getBalance();
            }
        }
        return sum;
    }

    //вычисление общей суммы по всем счетам одельно, положительные с положительными, отрицательные с отрицательными
    public int showTotalNegativeSum() {
        int sum = 0;

        for (Account i : account) {
            if (i.getBalance() < 0) {
                sum += i.getBalance();
            }
        }
        return sum;
    }

    @Override
    public String toString() {
        return String.format("Client{" +
                "account=" + Arrays.toString(account) +
                '}');
    }
}
