package threads;

class ThreadA extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Thread A: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class ThreadB extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Thread B: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class ThreadC implements Runnable {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Thread C: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadsTutorial {
    public static void main(String[] args) {
        ThreadA threadA = new ThreadA();
        ThreadB threadB = new ThreadB();
        Thread threadC = new Thread(new ThreadC());
        Runnable runnable = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("Thread D: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread threadD = new Thread(runnable);
        threadA.start();
        threadB.start();
        threadC.start();
        threadD.start();
    }
}