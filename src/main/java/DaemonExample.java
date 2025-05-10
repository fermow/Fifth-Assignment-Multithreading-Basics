public class DaemonExample {
    static class DaemonRunnable implements Runnable {
        public void run() {
            for(int i = 0; i < 20; i++) {
                System.out.println("Daemon thread running...");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    //[Handling Exception...]
                }
            }
        }
    }
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new DaemonRunnable());
        //thread.setDaemon(true);
        thread.start();
        System.out.println("Main thread ends.");
    }
}