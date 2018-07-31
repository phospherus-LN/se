/**
 * @author lining 2018/7/31
 */
public class ThreadDemo  extends Thread {



    public ThreadDemo(String name) {
        super(name);
    }

    public static void main(String[] args) {



        new ThreadDemo("000").start();

        new ThreadDemo("111").start();

        for (int i = 0; i < 10; i++) {

            for (int i1 = 0; i1 < 1000; i1++);
            System.out.println(i +"\t"+Thread.currentThread().getName());
        }

    }


    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {

            for (int i1 = 0; i1 < 1000; i1++);
            System.out.println(i + "\t"+Thread.currentThread().getName());
        }
    }
}
