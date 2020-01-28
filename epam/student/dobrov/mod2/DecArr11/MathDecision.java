package by.epam.student.dobrov.mod2.DecArr11;

/*
Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
 */
public class MathDecision {

    public static int findArrLength(int number) {
        int counter = 0;

        while (number != 0) {
            int digit = number % 10;
            counter++;
            number = number / 10;
        }

        return counter;
    }

    public static  void determineWhichNum( int counter1, int counter2){

        if ( counter1 > counter2 ){
            System.out.println("В первом числе  цифр больше ");
        }else{
            System.out.println("Во втором числе цифр больше");
        }if (counter1 == counter2){
            System.out.println("Кол-во  цифр в каждом числе одинаково");
        }
    }
}


