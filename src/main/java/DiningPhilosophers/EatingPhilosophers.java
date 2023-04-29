package DiningPhilosophers;

import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.Semaphore;

/**
 * Задача про обедающих философов
 * За одним столом могут сидеть одновременно не более 8 философов. Если на столе оказывается
 * 9 философов, то ни один из них не может начать обедать. Каждый философ может обедать только один раз,
 * после чего он должен освободить ложки и уйти за стол.
 */
public class EatingPhilosophers {
    public static void main(String[] args) {
        System.out.println("Поток " + Thread.currentThread().getName());


        int[] id = new int[100];

        for (int i = 0; i < 100; i++) {
            id[i] = i;
        }

        String[] name = new String[100];
        for (int i = 0; i < 100; i++) {
            name[i] = "Философ" + " " + id[i];
        }

        //Устанавливаю лимит
        Semaphore table = new Semaphore(8);

        for (int i = 0; i < 100; i++) {
            new Philosopher(table, name[i], id[i]);
        }


    }
}
