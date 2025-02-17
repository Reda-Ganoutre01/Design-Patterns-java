
package Singleton;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThreadSafeSingleton {
    private String[] letters = { "a", "b", "c", "d", "e" };
    private List<String> data = Arrays.asList(letters);

    // instance for class
    private static volatile ThreadSafeSingleton instance;

    private static boolean delayMe = true;

    public static ThreadSafeSingleton getInstance() {
        if (instance == null) {

            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) {
                    if (delayMe) {
                        delayMe = false;
                        Thread.currentThread();
                        try {
                            Thread.sleep(100);

                        } catch (InterruptedException e) {

                        }

                    }
                    instance = new ThreadSafeSingleton();
                }
            }

        }
        return instance;
    }

    private ThreadSafeSingleton() {
        Collections.shuffle(data);
    }

    public void printData() {
        for (String item : data) {
            System.out.printf("%s", item);
        }
        System.out.println("");
    }

}