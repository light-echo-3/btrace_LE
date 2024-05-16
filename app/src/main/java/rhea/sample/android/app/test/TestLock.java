package rhea.sample.android.app.test;

public class TestLock {
    private static final Object lock = new Object();
    public static void testWait() {
        try {
            synchronized (lock){
                lock.wait(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void testWait2() {
        new Thread("hdq---test"){
            @Override
            public void run() {
                super.run();
                try {
                    synchronized (lock){
                        lock.wait(501);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();
    }

}
