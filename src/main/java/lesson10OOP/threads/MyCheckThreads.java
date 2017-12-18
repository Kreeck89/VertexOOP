package lesson10OOP.threads;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyCheckThreads {

    static List<Integer> listEven = new ArrayList<>();
    static List<Integer> listOdd = new ArrayList<>();
    static List<Integer> newList = new ArrayList<>();
    static int count = 20;

    public static void main(String[] args) throws InterruptedException {

        ThreadEven even = new ThreadEven();
        even.start();
        even.join();

        ThreadOdd odd = new ThreadOdd();
        odd.start();
        odd.join();

        Thread implThread = new Thread(new SetToNewList());
        implThread.start();
    }

    private static class ThreadEven extends Thread {
        @Override
        public void run() {
            System.out.println("ThreadEven started set.");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for (int i = 0; i < count; i++) {
                if (i % 2 == 0) {
                    listEven.add(i);
                }
            }
        }
    }

    private static class ThreadOdd extends Thread {
        @Override
        public void run() {
            System.out.println("ThreadOdd started set.");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for (int i = 0; i < count; i++) {
                if (i % 2 != 0) {
                    listOdd.add(i);
                }
            }
        }
    }

    private static class SetToNewList implements Runnable {
        @Override
        public void run() {
            System.out.println("Started set to new List");
            newList.addAll(listEven);
            newList.addAll(listOdd);
            System.out.println(Arrays.toString(newList.toArray()));
        }
    }
}
