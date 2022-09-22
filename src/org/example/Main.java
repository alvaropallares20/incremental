package org.example;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

       Accumulator acomulator = new Accumulator(0);
       LinkedList<Thread> listaHilos = new LinkedList<>();

        for (int i = 0; i < 100; i++) {
            Thread thread = new Thread(new IncrementTask(acomulator, 1000));
            thread.start();
            listaHilos.add(thread);
        }

            for (Thread incrementThread:listaHilos) {
                try{
                    incrementThread.join();
                }catch(InterruptedException e){
                    throw new RuntimeException(e);
                }
            }

        System.out.println(acomulator.getValue());
    }
}