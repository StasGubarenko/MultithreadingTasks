package Мусор;

import java.util.concurrent.Semaphore;

public class Philosoph extends Thread{

    Semaphore table;
    String name;
    int id;

    public Philosoph(Semaphore table, String name, int id){
        this.table = table;
        this.name = name;
        this.id = id;
        //Изучить конструктор класса thread
        new Thread(this).start();
    }

    @Override
    public void run(){

        System.out.println(name + " waiting table");

        try {
            table.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(name + " is sitting at the table");

        //"Философ" обедает
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(name + " went out table");
        table.release();
    }
}
