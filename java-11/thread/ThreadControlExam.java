package thread;

import java.util.ArrayList;
import java.util.List;

public class ThreadControlExam {
    public static void main(String[] args) {
        Pool pool = new Pool();
        Thread consumer = new Thread(new ProductConsumer(pool));
        Thread provider = new Thread(new ProductProvider(pool));

        consumer.start();
        provider.start();
    }
}

class Pool {
    List<String> products = new ArrayList<>();

    public synchronized void get() throws InterruptedException {
        if (products.size() == 0) {
            wait();
        }
        products.remove(0);
        System.out.println("소비! 재고 = " + products.size());
    }

    public synchronized void add(String value) {
        products.add(value);
        System.out.println("생산! 재고 = " + products.size());
        notifyAll();
    }
}

class ProductConsumer implements Runnable {
    private Pool pool;

    public ProductConsumer(Pool pool) {
        this.pool = pool;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 100; i++) {
                this.pool.get();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class ProductProvider implements Runnable {
    private Pool pool;

    public ProductProvider(Pool pool) {
        this.pool = pool;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            this.pool.add("상품");
        }
    }
}
