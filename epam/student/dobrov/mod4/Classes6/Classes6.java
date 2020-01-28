package by.epam.student.dobrov.mod4.Classes6;

/*
Составьте описание класса для представления времени.
Предусмотрте возможности установки времени и изменения его отдельных полей (час, минута, секунда)
с проверкой допустимости вводимых значений. В случае недопустимых значений полей поле устанавливается в значение 0.
Создать методы изменения времени на заданное количество часов, минут и секунд.
 */
public class Classes6 {
    public static void main(String args[]) {

        ShowTime showTime = new ShowTime(5, 10, 15);
        System.out.printf("%d:%02d:%02d", showTime.getHour(), showTime.getMin(), showTime.getSec());

        System.out.println();

        showTime.setHour(1);
        showTime.setMin(2);
        showTime.setSec(3);
        System.out.printf("%d:%02d:%02d", showTime.getHour(), showTime.getMin(), showTime.getSec());

        System.out.println();

        showTime.setMin(5);
        System.out.printf("%d:%02d:%02d", showTime.getHour(), showTime.getMin(), showTime.getSec());

        System.out.println();

        showTime.setHour(1);
        showTime.setMin(2);
        showTime.setSec(3);
        System.out.printf("%d:%02d:%02d", showTime.changeHour(1), showTime.changeMin(2), showTime.changeSec(3));
    }

}

