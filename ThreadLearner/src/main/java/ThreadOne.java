public class ThreadOne extends Thread {
    @Override
    public void run() {
        int index = 0;
        while (index < 10) {

            System.out.printf("Index %d from thread: %s%n" , index, this.getName());

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            index++;
        }

    }
}
