package by.epam.student.dobrov.mod4.AggrClasses3;

import java.util.Arrays;

//Методы: вывести на консоль столицу, количество областей, площадь, областные центры.
//___________________________________________
class StateAction {

    private State state;

    public StateAction(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void showTheCapital() {
        System.out.println(state.getCapital());
    }

    public void showTheQuantityOfAreas() {
        System.out.println(state.getQuantityOfAreas());
    }

    public void showBySquare() {
        System.out.println(state.getSquareOfState());
    }

    public void showTheQuantityOfAreasCentres() {
        System.out.println(state.getQuantityOfAreas());
    }

    public void showAreaCityCentre() {
        System.out.println(Arrays.toString(state.getAreaCityCentre()));
    }

    @Override
    public String toString() {
        return String.format("StateAction{" +
                "state=" + state +
                '}');
    }
}
