import java.util.ArrayList;
import java.util.List;

// statement -> statements
public class Transformation5 {
    protected final List<String> calledKids = new ArrayList<>();

    private static String call(String name) {
        return "Hello " + name;
    }

    /**
     * Before
     */
    public String greeting(String name) {
        return "Hello " + name;
    }

    /**
     * After 1
     */
    public String greetingAfterTransformation(String name) {
        calledKids.add(name);
        return "Hello " + name;
    }

    /**
     * After 2 - add some refactoring
     */
    public String greetingAfterTransformation2(String name) {
        storeCalledName(name);
        return call(name);
    }

    private void storeCalledName(String name) {
        calledKids.add(name);
    }
}
