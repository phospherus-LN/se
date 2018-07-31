/**
 * @author lining 2018/7/31
 */
public class ThreadDemo  extends Thread {



    public ThreadDemo(String name) {
        super(name);
    }

    public static void main(String[] args) {

        ThreadDemo thread1 = new ThreadDemo("000");

        ThreadDemo thread2 = new ThreadDemo("000");

        thread1.start();

        thread2.start();


        for (int i = 0; i < 10000*100000; i++) {

            if (i>16){
                thread1.notify();


            }
        }

    }


    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {

            System.out.println(i + "\t"+Thread.currentThread().getName());

            if (i==6){
                try {
                    Thread.currentThread().wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }





        }
    }
}
