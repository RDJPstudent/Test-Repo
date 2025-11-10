class Stopwatch {
    private long start; private long elapsed; private boolean running;
    void start() { /* TODO */ }
    void stop()  { /* TODO */ }
    void reset() { /* TODO */ }
    long elapsedMillis() {
        // if running, return now-start+elapsed; else return elapsed
        return 0;
    }
}
public class OopPractice {
    public static void main(String[] args) throws InterruptedException {
        Stopwatch sw = new Stopwatch();
        sw.start(); Thread.sleep(120);
        sw.stop();  System.out.println(sw.elapsedMillis());
    }
}


