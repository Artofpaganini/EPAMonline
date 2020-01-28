package by.epam.student.dobrov.mod4.Сlasses4;

class Train {
    private String targetPlace;
    private int trainNumber;
    private int hoursDelivery;
    private int minDelivery;


    public Train(String targetPlace, int trainNumber, int hoursDelivery, int minDelivery) {
        this.targetPlace = targetPlace;
        this.trainNumber = trainNumber;
        this.hoursDelivery = hoursDelivery;
        this.minDelivery = minDelivery;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public String getTargetPlace() {
        return targetPlace;
    }

    public int getHoursDelivery() {
        return hoursDelivery;
    }

    public int getMinDelivery() {
        return minDelivery;
    }

    public boolean checkTrainNumber(int trainNumber) {
        if (trainNumber == this.trainNumber) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("Train{" +
                "targetPlace='" + targetPlace + '\'' +
                ", trainNumber=" + trainNumber +
                ", hoursDelivery=" + hoursDelivery +
                ", minDelivery=" + minDelivery +
                '}');
    }
}
