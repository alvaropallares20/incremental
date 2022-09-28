package ejercicio1Hilos;

public class IncrementTask implements Runnable{

    private final Accumulator accomulator;


    public IncrementTask(Accumulator accomulator) {
        this.accomulator = accomulator;
    }

    @Override
    public void run() {

        while(accomulator.getValue() != 0){
            accomulator.increment();
            try{
                Thread.sleep(20);
            }catch (Exception e){
                throw new RuntimeException();
            }
        }
    }
}
