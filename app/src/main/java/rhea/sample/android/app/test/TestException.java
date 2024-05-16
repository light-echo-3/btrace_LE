package rhea.sample.android.app.test;

import android.util.Log;

public class TestException {
    private static final String TAG = "TestException";

    public static void testException() {
        testExceptionCatch();
    }
    public static void testExceptionCatch() {
        Log.d(TAG, "testExceptionCatch: b");
        try {
            testExceptionThrow1();
        } catch (Exception e) {
            e.printStackTrace();
            Log.d(TAG, "testExceptionCatch: exp");
        }
        Log.d(TAG, "testExceptionCatch: e");
    }

    public static void testExceptionThrow1() {
        testExceptionThrow2();
    }

    public static void testExceptionThrow2() {
        testExceptionThrow3();
    }

    public static void testExceptionThrow3() {
        testExceptionThrow();
    }

    public static void testExceptionThrow() {
        Log.d(TAG, "testExceptionThrow: b");
        int[] array = new int[3];
        int test = array[33];
        Log.d(TAG, "testExceptionThrow: e");
    }
}
