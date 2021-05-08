package MultiThreads;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread("t1");
        MyThread t2 = new MyThread("t2");
        MyThread t3 = new MyThread("t3");

        t1.start();
        // 如果join了，那么后面的进程就无法插入，必须等待t1结束之后才可以开始
        t1.join();
        t2.start();
        t3.start();

    }
}
