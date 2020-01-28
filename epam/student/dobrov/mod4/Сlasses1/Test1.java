package by.epam.student.dobrov.mod4.Сlasses1;

class Test1 {

    private int number1;
    private int number2;

    public Test1(int number1,int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public int getNumber1() {
        return number1;

    }

    public int getNumber2() {
        return number2;

    }

    @Override
    public String toString() {

        return String.format("num1:%d, num2:%d",number1,number2);
    }


    public void setNumber1(int num) {
        this.number1 = num;

    }

    public void setNumber2(int num) {
        this.number2 = num;

    }

    public int sumNum() {
        int sum = number1 + number2;
        return sum;
    }

    public int maxNum() {
        int max = number1;

        if (number2 > max) {
            max = number2;
        }
        return max;
    }


}
