package ejercicio1Hilos;

public class Accumulator {

    private int value;

    public Accumulator(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public synchronized void increment(){
        value= value + 1;
    }
    //synchronized para que no ocurra a la vez
    public synchronized void decrement(){
        value= value - 1;
    }

}
