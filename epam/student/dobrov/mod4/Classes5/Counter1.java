package by.epam.student.dobrov.mod4.Classes5;

class Counter1 {
    private int count;
    private int maxCount;
    private int minCount;

    public Counter1() {

        this.count = 0;
        this.maxCount = 10;
        this.minCount = -10;
    }


    public Counter1(int count, int minCount,int maxCount) throws Exception {

        CheckParametrs(count, minCount,maxCount);
        this.count = count;
        this.maxCount = maxCount;
        this.minCount = minCount;

    }

    public int getCount() {
        return count;
    }

    public void CheckParametrs(int count, int minCount,int maxCount)throws Exception{
        if (maxCount < minCount) {
            throw new Exception("illegal values");
        }
        if (count < minCount) {
            throw new Exception("illegal values");
        }
        if (count > maxCount) {
            throw new Exception("illegal values");
        }

    }

    public void incrementCount() {
        count++;

        if (count > maxCount) {
            count = minCount;
        }
    }

    public void decrementCount() {
        count--;

        if (count < minCount) {
            count = maxCount;
        }
    }

    @Override
    public String toString() {
        return String.format("Counter1{" +
                "count=" + count +
                ", maxCount=" + maxCount +
                ", minCount=" + minCount +
                '}');
    }
}
