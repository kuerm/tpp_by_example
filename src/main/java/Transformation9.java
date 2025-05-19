import java.util.LinkedList;
import java.util.List;

// Statement -> tail-recursion
public class Transformation9 {

    protected final List<String> calledKids = new LinkedList<>();

    private static String call(String name) {
        return "Hello " + name;
    }

    public String greeting(String name) {
        storeCalledName(name);
        return call(name);
    }

    /**
     * Before
     */
    public int countKidsBefore(String name) {
        int result = 0;
        for (String calledKid : calledKids) {
            if (name.equalsIgnoreCase(calledKid)) {
                return result;
            }
            result++;
        }
        return result;
    }

    /**
     * After
     */
    public int countKidsBeforeAfterTransformation(String name) {
        return countKidsBeforeRecursive(name, 0);
    }

    private int countKidsBeforeRecursive(String name, int index) {
        if (index >= calledKids.size()) {
            throw new IllegalStateException("Name %s not found".formatted(name));
        }
        if (calledKids.get(index).equals(name)) {
            int currentPosition = 0;
            return currentPosition;
        }

        // tail recursive magic
        return 1 + countKidsBeforeRecursive(name, index + 1);
    }

    private void storeCalledName(String name) {
        calledKids.add(name);
    }
}
