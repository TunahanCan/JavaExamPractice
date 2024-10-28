package com.ocp.chapter13.creat_thread_concurincy_api;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


/**
 * Once you have finished using a thread executor, it is important that you call the shutdown()
 * method. A thread executor creates a non-daemon thread on the first task that is executed, so
 * failing to call shutdown() will result in your application never terminating.
 * The shutdown process for a thread executor involves first rejecting any new tasks sub-
 * mitted to the thread executor while continuing to execute any previously submitted tasks.
 * During this time, calling isShutdown() will return true, while isTerminated() will
 * return false. If a new task is submitted to the thread executor while it is shutting down,
 * a RejectedExecutionException will be thrown. Once all active tasks have been com-
 * pleted, isShutdown() and isTerminated() will both return true. Figure 13.3 shows the
 * life cycle of an ExecutorService object.
 */
public class IntroducingTheSingleThreadWithExecutor {

    public static void main(String[] args) {
        Runnable printInventory = ()-> {
            for (int i = 0; i < 3; i++) {
                System.out.println("printing zoo inventory" + i + Thread.currentThread().getName()) ;
            }
        } ;
        Runnable printRecords = ()-> {
            for (int i = 0; i < 3; i++) {
                System.out.println("printing record " + i + Thread.currentThread().getName());
            }
        };
        ExecutorService service = Executors.newSingleThreadExecutor();
        try{
            System.out.println("begin");
            service.execute(printInventory);
            service.execute(printRecords);
            service.execute(printInventory);
            System.out.println("end");
        } finally {
        }
    }
}
