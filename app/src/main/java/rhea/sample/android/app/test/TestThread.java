package rhea.sample.android.app.test;

import android.util.Log;

public class TestThread {

    public static void testStartThread() {
        new Thread("hdq---testStartThread"){
            @Override
            public void run() {
                super.run();
                Log.d("TAG", "---testStartThread---run: ");
            }
        }.start();
    }

}
