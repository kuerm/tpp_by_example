import java.util.ArrayList;
import java.util.List;

// unconditional -> conditional
public class Transformation6 {
    protected final List<String> calledKids = new ArrayList<>();

    private static String call(String name) {
        return "Hello " + name;
    }

    /**
     * Before
     */
    public String greeting(String name) {
        storeCalledName(name);
        return call(name);
    }

    private void storeCalledName(String name) {
        calledKids.add(name);
    }

    /**
     * After
     */
    public String greetingAfterTransformation(String name) {
        if (!name.startsWith("M")) {
            calledKids.add(name);
        }

        return call(name);
    }
}
