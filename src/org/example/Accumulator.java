package org.example;

public class Accumulator{
    private int value;

    public Accumulator(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
    public void increment(){
        value = value + 1;
    }


}
