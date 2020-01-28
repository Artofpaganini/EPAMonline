package by.epam.student.dobrov.mod4.AggrClasses4;

/*
Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета. Реализовать поиск и сортировку счетов.
Вычисление общей суммы по счетам. Вычисление суммы по всем счетам, имеющим положительный и отрицательный балансы отдельно.
 */
public class Account {

    private int accNumber;
    private int balance;
    private boolean accStatus;

    public Account(int accNumber, int balance) {
        this.accNumber = accNumber;
        this.balance = balance;
        this.accStatus= true;

    }

    public boolean isAccStatus() {
        return accStatus;
    }

    public void setAccStatus(boolean accStatus) {
        this.accStatus = accStatus;
    }

    public int getAccNumber() {
        return accNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accNumber=" + accNumber +
                ", balance=" + balance +
                ", accStatus=" + accStatus +
                '}';
    }
}
