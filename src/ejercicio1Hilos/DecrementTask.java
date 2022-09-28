package ejercicio1Hilos;

public class DecrementTask implements Runnable {

    private final Accumulator accumulator;

    public DecrementTask(Accumulator accumulator) {
        this.accumulator = accumulator;
    }

    @Override
    public void run() {
        while(accumulator.getValue() != 0){
            accumulator.decrement();
            try{
                Thread.sleep(10);
            }catch(Exception e){
                throw new RuntimeException();
            }
        }
    }
}
