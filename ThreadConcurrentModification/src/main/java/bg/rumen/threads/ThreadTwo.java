package bg.rumen.threads;

import bg.rumen.Resource;

public class ThreadTwo extends Thread {


    @Override
    public void run() {
        Resource resource = Resource.getInstance();


        for (int i = 0; i < 10; i++) {

            resource.addResources("Why");
            resource.addResources("am");
            resource.addResources("I");
            resource.addResources("Doing");
            resource.addResources("This");

            resource.addResources("Pretty");
            resource.addResources("Cool");
            resource.addResources("Text");
            resource.addResources("Message");
            resource.addResources("Here");
        }


        for (String currentString : resource.getStrings()) {
            System.out.println(currentString);
        }
    }
}