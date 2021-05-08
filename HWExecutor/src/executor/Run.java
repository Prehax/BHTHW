package executor;

import java.util.*;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Run {
    public static void main(String[] args) {
        runSameTime();
    }
    private static void runSameTime() {
        ExecutorService service = Executors.newCachedThreadPool();

        try {
            Future<String> futureA = service.submit(() -> new A().getMethod());
            Future<String> futureB = service.submit(() -> new B().getMethod());

            boolean allDone = false;
            while(!allDone) {
                if(futureA.isDone() && futureB.isDone()) {
                    System.out.println(futureB.get() + " " + futureA.get());
                    allDone = true;
                }
            }
        } catch (ExecutionException | InterruptedException e) {
            e.printStackTrace();
        } finally {
            service.shutdown();
        }

    }
}
