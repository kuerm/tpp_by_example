import java.util.ArrayList;
import java.util.List;

// statement -> statements
public class Transformation5 {
    protected final List<String> calledKids = new ArrayList<>();

    private static String call(String name) {
        return "Hello " + name;
    }

    public String greetingBeforeTransformation(String name) {
        return "Hello " + name;
    }

    public String greetingAfterTransformation1(String name) {
        calledKids.add(name);
        return "Hello " + name;
    }

    /**
     * After 2 - with some refactoring
     */
    public String greetingAfterTransformation2(String name) {
        storeCalledName(name);
        return call(name);
    }

    private void storeCalledName(String name) {
        calledKids.add(name);
    }
}
