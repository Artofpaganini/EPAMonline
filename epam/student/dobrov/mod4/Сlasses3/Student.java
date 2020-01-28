package by.epam.student.dobrov.mod4.Сlasses3;

class Student {

    private String surname;
    private String name;
    private String numberOfGroup;
    private int progress [];

    public Student(String surname, String name, String numberOfGroup, int[] progress) {
        this.surname = surname;
        this.name = name;
        this.numberOfGroup = numberOfGroup;
        this.progress  = new int[5];
        this.progress  = progress;
    }

    @Override

    public String toString() {
        return String.format("surname: %s, group: %s", surname,numberOfGroup );
    }

    public boolean checkExcellent() {
        for (int i = 0; i < progress.length; i++) {
            if (progress[i] < 9) {
                return false;
            }
        }
        return true;
    }
}
