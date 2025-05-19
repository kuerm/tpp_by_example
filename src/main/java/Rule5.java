import java.util.ArrayList;
import java.util.List;

// statement -> statements
public class Rule5 {
    protected final List<String> calledKids = new ArrayList<>();

    private static String call(String name) {
        return "Hello " + name;
    }

    /*
      Before
     */
    public String getValue(String name) {
        return "Hello " + name;
    }

    /*
    After 1
     */
    public String getValue2(String name) {
        calledKids.add(name);
        return "Hello " + name;
    }

    /*
        After 2 - add some refactoring
     */
    public String getValue3(String name) {
        storeCalledName(name);
        return call(name);
    }

    private void storeCalledName(String name) {
        calledKids.add(name);
    }
}
