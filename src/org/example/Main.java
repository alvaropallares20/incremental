package org.example;

public class Main {
    public static void main(String[] args) {
       Accumulator acomulator = new Accumulator(0);

        for (int i = 0; i < 100; i++) {
            Thread thread = new Thread(new IncrementTask(acomulator, 1000));
            thread.start();
        }
        try{
            Thread.sleep(15000);
        }catch(InterruptedException e){
            throw new RuntimeException(e);
        }

        System.out.println(acomulator.getValue());
    }
}