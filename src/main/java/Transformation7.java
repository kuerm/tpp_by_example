import java.util.ArrayList;
import java.util.List;

// scalar -> array
public class Transformation7 {

    protected final List<String> calledKids = new ArrayList<>();
    private final String item = "apple";
    private final String[] items = {"apple", "banana"};

    private static String call(String name) {
        return "Hello " + name;
    }

    public String greetingBeforeTransformation(String name) {
        storeCalledName(name);
        return call(name);
    }

    public String greetingAfterTransformation(String name) {
        if (!name.startsWith("M")) {
            calledKids.add(name);
        }

        return call(name);
    }

    /**
     * Before
     */
    public String fruit() {
        return item;
    }

    /**
     * After
     */
    public String[] fruits() {
        return items;
    }

    private void storeCalledName(String name) {
        calledKids.add(name);
    }
}
