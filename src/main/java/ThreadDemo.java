public class ThreadDemo {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            System.out.println("Thread is running using a ...!");
        });

        thread.start();
    }
}