package lesson10OOP.threads;

import java.util.ArrayList;
import java.util.List;

public class YarikThreads {
    public static void main(String[] args) throws InterruptedException {
        ListTwo fillList = new ListTwo();
        ListOne readList = new ListOne();
        AddList addList = new AddList();
        Thread thread = new Thread(fillList);
        Thread thread1 = new Thread(readList);
        Thread thread2 = new Thread(addList);
        thread.start();
        thread1.start();
        thread2.start();
    }
}

class ListOne implements Runnable {
    private static List<Integer> arrayList = new ArrayList<>();

    public List<Integer> getList() {
        return arrayList;
    }
    @Override
    public synchronized void run() {
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 10; i++) {
            if (i % 2 != 0) {
                arrayList.add(i);
            }
        }
        System.out.println(arrayList);
    }

    @Override
    public String toString() {
        return "" + arrayList;
    }
}

class ListTwo implements Runnable {
    private static List<Integer> list = new ArrayList<>();

    public List<Integer> getListTwo() {
        return list;
    }

    @Override
    public synchronized void run() {
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                list.add(i);
            }
        }
        System.out.println(list);
    }
}

class AddList implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName());
        List<Integer> list = new ListOne().getList();
        List<Integer>list1 = new ListTwo().getListTwo();
        List<Integer>integerList = new ArrayList<>();
        integerList.addAll(list);
        integerList.addAll(list1);
        System.out.println(integerList);
    }
}
