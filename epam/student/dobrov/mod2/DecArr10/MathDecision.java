package by.epam.student.dobrov.mod2.DecArr10;

/*
Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого являются цифры числа N
 */
public class MathDecision {

    public static boolean isNaturalNumber(int number) {
        if (number <= 0 || number % 1 != 0) {
            return false;
        }
        return true;
    }


    public static int findArrLength(int number) {
        int counter = 0;


        if (isNaturalNumber(number)) {
            while (number != 0) {

                int digit = number % 10;
                counter++;
                number = number / 10;
            }

        }
        return counter;
    }



    public static int[] addElements(int number, int arrLength) {
        int[] arr = new int[arrLength];

        while (number != 0) {
            for (int i = arr.length - 1; i >= 0; i--) {
                int digit = number % 10;
                arr[i] = digit;
                number = number / 10;
            }
        }

        return arr;
    }

    public static void outputArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
