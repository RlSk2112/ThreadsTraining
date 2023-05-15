package bg.rumen;

import java.util.ArrayList;
import java.util.List;

public class Resource {
    private List<String> strings;
    private static Resource instance;

    private Resource() {
        this.strings = new ArrayList<>();
    }


    public static synchronized Resource getInstance() {
        if (instance == null) {
           instance = new Resource();
        }
        return instance;
    }

    public Integer getSize() {
        return instance.getStrings().size();
    }



    public List<String> getStrings() {
        return this.strings;
    }

    public void addResources(String string) {
        this.strings.add(string);
    }

}
