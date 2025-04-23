//Main.java
// Name: Janhavi Doijad
// PRN: 23070126153
// Batch: B3


public class Main {
    public static void main(String[] args) {
        new Thread(new MyThread(1, 2, 300)).start();
        new Thread(new MyThread(100, 20, 1000)).start();
    }
}

