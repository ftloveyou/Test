package demo01;

public class Test08 extends Thread {
    private int ticket = 100;
    @Override
    public void run() {
        synchronized (Test08.class){
            for (int i = 0;i<35 && ticket>0;i++){
                System.out.println(Thread.currentThread().getName() + "卖了张"+ticket);
                ticket--;
            }
        }

    }

    public static void main(String[] args) {
        Test08 t = new Test08();
        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);
        Thread t3 = new Thread(t);
        t1.start();
        t2.start();
        t3.start();
    }
}
