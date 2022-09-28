package ejercicio1Hilos;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Accumulator accumulator = new Accumulator(100);

        Thread incremnetThread = new Thread(new IncrementTask(accumulator));
        Thread decrementThread = new Thread(new DecrementTask(accumulator));

        incremnetThread.start();
        decrementThread.start();

        try{
            incremnetThread.join();
            decrementThread.join();
        }catch (Exception e){
            throw new RuntimeException();
        }


        System.out.println(accumulator.getValue());

    }
}
