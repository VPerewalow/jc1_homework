package lesson17;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {

    private static Warehouse warehouse = new Warehouse();

    public static Warehouse getInstance() {
        return warehouse;
    }

    private Warehouse() {
    }

    private List<String> goods = new ArrayList<String>();

    public synchronized void addGood(String s) {
        while (goods.size() >= 5) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        notifyAll();
        goods.add(s);
        System.out.println(Thread.currentThread().getName() + " adds " + s + " - have [" + goods.size() + "]");

    }


    public synchronized String takeGood() {
        while (goods.size() == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        notifyAll();
        String s = goods.remove(0);
        System.out.println(Thread.currentThread().getName() + " takes " + s + " - have [" + goods.size() + "]");
        return s;
    }
}

