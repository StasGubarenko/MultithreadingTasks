package Мусор;



import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadFactory;

/*
1. Нужно создать 100 потоков (Философов)
2. Каждый поток должен взаимодействовать с объектом table
3. При этом максимальное количество потоков взаимодействующие с объектом table не превышает 8
 */

public class Main {

    public static void main(String[] args) {
        //Устанавливаю лимит
        Semaphore table = new Semaphore(1);

        int[] id = new int[5];

        for(int i = 0; i < 5; i++){
            id[i] = i;
        }

        String[] name = new String[5];
        for(int i = 0; i < 5; i++){
            name[i] = "Философ" + id[i];
        }

       for(int i = 0; i < 5; i++){
           new Philosoph(table,name[i],id[i]);
       }

    }
}
