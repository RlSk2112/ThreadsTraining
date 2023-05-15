package bg.rumen;

import bg.rumen.threads.ThreadOne;
import bg.rumen.threads.ThreadTwo;


public class Main {
    public static void main(String[] args) {

        try {
            start();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        Resource resource = Resource.getInstance();
        System.out.println(resource.getSize());

    }



    public static void start() throws InterruptedException {

        ThreadOne threadOne = new ThreadOne();
        ThreadTwo threadTwo = new ThreadTwo();
        threadOne.start();
        threadTwo.start();

        threadOne.join();
        threadTwo.join();
        System.out.println("End");
    }

}