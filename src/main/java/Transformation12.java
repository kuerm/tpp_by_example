import java.util.ArrayList;
import java.util.List;

// expression to function
public class Transformation12 {
    protected final List<String> calledKids = new ArrayList<>();

    public String greetingBeforeTransformation(String name) {
        calledKids.add(name);
        return "Hello " + name;
    }

    public String greetingAfterTransformation(String name) {
        storeCalledName(name);
        return call(name);
    }

    private void storeCalledName(String name) {
        calledKids.add(name);
    }

    private String call(String name) {
        return "Hello " + name;
    }
}
