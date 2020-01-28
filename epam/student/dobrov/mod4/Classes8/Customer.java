package by.epam.student.dobrov.mod4.Classes8;

class Customer {
    private int id;
    private String surname;
    private String name;
    private String fatherName;
    private String address;
    private int numberOfCreditCard;
    private int numberOfBankAcc;

    public Customer(int id, String surname, String name, String fatherName, String address, int numberOfCreditCard, int numberOfBankAcc) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.fatherName = fatherName;
        this.address = address;
        this.numberOfCreditCard = numberOfCreditCard;
        this.numberOfBankAcc = numberOfBankAcc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumberOfCreditCard() {
        return numberOfCreditCard;
    }

    public void setNumberOfCreditCard(int numberOfCreditCard) {
        this.numberOfCreditCard = numberOfCreditCard;
    }

    public int getNumberOfBankAcc() {
        return numberOfBankAcc;
    }

    public void setNumberOfBankAcc(int numberOfBankAcc) {
        this.numberOfBankAcc = numberOfBankAcc;
    }

    @Override
    public String toString() {
        return String.format("Customer{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", address='" + address + '\'' +
                ", numberOfCreditCard=" + numberOfCreditCard +
                ", numberOfBankAcc=" + numberOfBankAcc +
                '}');
    }

    public boolean checkSurname(String surname) {
        if (surname.compareTo(this.surname) > 0) {
            return true;
        }
        return false;
    }
}
