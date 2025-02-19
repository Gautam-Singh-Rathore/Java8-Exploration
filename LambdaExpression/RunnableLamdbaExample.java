
class ThreadDemo implements Runnable {

    @Override
    public void run() {
        System.out.println("Running from class ...");
    }

}

public class RunnableLamdbaExample {
    public static void main(String[] args) {
        Thread thread = new Thread(new ThreadDemo());
        thread.start();

        Runnable runnable = ()-> System.out.println("Running from lambda ...");
        Thread threadLamdba = new Thread(runnable);
        threadLamdba.start();

    }

}
