package edu.nagaraju.lambda;

public class ThreadExample {
    public static void main(String[] args) {
        Runnable r  = ()->{
            for (int i=0;i<10;i++){
                System.out.println("Tread - "+i);
            }
        };
        new Thread(r).start();

        for (int i=0;i<10;i++){
            System.out.println("Main - "+i);
        }
    }
}
