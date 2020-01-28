package by.epam.student.dobrov.mod4.Classes5;

/*
Опишите класс, реализующий десятичный счетчик, который может увеличивать или
 уменьшать свое значение на единицу в заданном диапазоне.
 Предусмотрите инициализацию счетчика значениями по умолчанию и произвольными значениями.
 Счетчик имеет методы увеличения и уменьшения состояния, и метод позволяющее получить его текущее состояние.
 Написать код, демонстрирующий все возможности класса.
 */
public class Classes5 {
    public static void main(String args[]) throws Exception {

        Counter1 counter = new Counter1( );
        System.out.println(counter.getCount());

        counter.incrementCount();

        System.out.println(counter.getCount());
        counter.decrementCount();
        System.out.println(counter.getCount());


        Counter1 counter1 = new Counter1( 0,1,10);
        System.out.println(counter1.getCount());

        counter1.incrementCount();
        System.out.println(counter1.getCount());

        counter1.decrementCount();
        System.out.println(counter1.getCount());
    }
}

