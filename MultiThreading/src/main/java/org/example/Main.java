package org.example;

class Work{
    int counter = 0;
    public void print(){
        counter++;
        System.out.println(counter + Thread.currentThread().getName());
    }
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Work w = new Work();
        Thread t1 = new Thread(() -> {
            for(int i=0; i<5; i++){
                w.print();
            }
        });

        Thread t2 = new Thread(() -> {
            for(int i=0; i<5; i++){
                w.print();
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted: " + e.getMessage());
        }


    }
}
