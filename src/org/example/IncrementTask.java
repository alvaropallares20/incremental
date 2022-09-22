package org.example;

public class IncrementTask implements Runnable{

    private Accumulator acomulator;
    private int times;

    public IncrementTask(Accumulator acomulator, int times) {
        this.acomulator = acomulator;
        this.times = times;
    }

    @Override
    public void run() {
    for(int i = 0; i < times; i++){
            acomulator.increment();
            try{
                Thread.sleep(10);
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }
}
