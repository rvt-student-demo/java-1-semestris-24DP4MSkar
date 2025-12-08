package rvt;

public class OverloadedCounter {

    private int counter;

    public OverloadedCounter(int startValue) {
        this.counter = startValue;
    }

    public OverloadedCounter() {
        this(0);
    }

    public int value() {
        return this.counter;
    }

    public void increase() {
        this.counter++;
    }

    public void decrease() {
        this.counter--;
    }

    public void increase(int increaseBy) {
        if (increaseBy >= 0) {
            this.counter = this.counter + increaseBy;
        }
    }

    public void decrease(int decreaseBy) {
        if (decreaseBy >= 0) {
            this.counter = this.counter - decreaseBy;
        }
    }
    

    public String toString(){
        return "Count: " + this.counter;
    }
}