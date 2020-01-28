package by.epam.student.dobrov.mod4.AggrClasses3;

/*
Создать объект класса Государство, используя классы Область, Район, Город.
Методы: вывести на консоль столицу, количество областей, площадь, областные центры.
*/
public class AggrClass3 {
    public static void main(String[] args) {
// Cоздание класса государство со всеми городами, обл, районами
        City cityMinsk = new City("Minsk");

        City cityGrodno = new City("Grodno");

        City cityGomel = new City("Gomel");

        District districtMinsk = new District("Минский", 5000, cityMinsk);
        District districtJodino = new District("Жодинский ", 250);

        District districtGrodno = new District("Гродненский", 2000, cityGrodno);
        District districtGoja = new District("Гожский", 100);

        District districtGomel = new District("Гомельский", 3000, cityGomel);


        Area areaMinsk = new Area(cityMinsk, districtMinsk, districtJodino);

        Area areaGrodno = new Area(cityGrodno, districtGrodno, districtGoja);

        Area areaGomel = new Area(cityGomel, districtGomel);

        State state = new State(cityMinsk, areaMinsk, areaGomel, areaGrodno);



        StateAction stateAction = new StateAction(state);

        stateAction.showTheCapital();
        System.out.println();

        stateAction.showTheQuantityOfAreas();
        System.out.println();

        stateAction.showBySquare();
        System.out.println();

        stateAction.showTheQuantityOfAreasCentres();
        System.out.println();

        stateAction.showAreaCityCentre();
    }
}


