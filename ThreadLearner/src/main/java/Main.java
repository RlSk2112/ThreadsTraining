public class Main {
    public static void main(String[] args) throws InterruptedException {
        ThreadOne threadOne = new ThreadOne();
        threadOne.start();

        int index = 0;
        while (index < 10) {

            System.out.printf("Index %d from thread: %s%n" , index, Thread.currentThread().getName());

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            index++;
        }
    }
}
