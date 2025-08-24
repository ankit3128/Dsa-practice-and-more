class Table2Thread extends Thread {
    public void run() {
        System.out.println("\nThread-Table-2 is printing table of 2");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Thread-Table-2: 2 x " + i + " = " + (2 * i));
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Table3Thread extends Thread {
    public void run() {
        System.out.println("\nThread-Table-3 is printing table of 3");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Thread-Table-3: 3 x " + i + " = " + (3 * i));
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Table7Thread extends Thread {
    public void run() {
        System.out.println("\nThread-Table-7 is printing table of 7");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Thread-Table-7: 7 x " + i + " = " + (7 * i));
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class DifferentRunFunctions {
    public static void main(String[] args) {
        Table2Thread t2 = new Table2Thread();
        Table3Thread t3 = new Table3Thread();
        Table7Thread t7 = new Table7Thread();

        try {
            t2.start();
            t2.join(); // wait for t2 to finish

            t3.start();
            t3.join(); // wait for t3 to finish

            t7.start();
            t7.join(); // wait for t7 to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
