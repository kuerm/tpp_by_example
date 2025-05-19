import java.util.ArrayList;
import java.util.List;

// Array -> Container
public class Transformation8 {

    protected final List<String> calledKids = new ArrayList<>();
    private final String[] fruitsAsArray = {"apple", "banana"};
    private final List<String> fruits = List.of("apple", "banana");

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
    public String[] fruitsAsArray() {
        return fruitsAsArray;
    }

    /**
     * After
     */
    public boolean has(String fruitName) {
        return fruits().stream().anyMatch(fruitName::equalsIgnoreCase);
    }

    private List<String> fruits() {
        return fruits;
    }

    private void storeCalledName(String name) {
        calledKids.add(name);
    }
}
