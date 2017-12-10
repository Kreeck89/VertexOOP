package hack.threads;

import java.util.ArrayList;

public class ThreadsWork {

    private static ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) {

        MyAwesome myAwesome = new MyAwesome();
        Thread thread = new Thread(myAwesome);
        thread.start();

        Awesome awesome = new Awesome();
        awesome.start();
    }

    private static class Awesome extends Thread {

        @Override
        public void run() {
            for (int i = 0; i < 1000000; i++) {
                list.add(i);
            }
//            System.out.println(Thread.currentThread().getName());
//            System.out.println("Hello");
        }
    }

    private static class MyAwesome implements Runnable {
        @Override
        public void run() {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
//            System.out.println(Thread.currentThread().getName());
//            System.out.println("MyAwesome");
        }
    }


}
