package avada.course.question_07._04;

import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadLocalRandom;

public class Tunnel {
    private final int LINES_IN_TUNNEL = 3;
    private Semaphore semaphore = new Semaphore(LINES_IN_TUNNEL);

    public void passingTunnel(int num) throws InterruptedException {
        semaphore.acquire();
        System.out.println("Гонка № " + num + " заїхала в тунель");
        Thread.sleep(ThreadLocalRandom.current().nextLong(1500, 2500));
        semaphore.release();
    }
}
