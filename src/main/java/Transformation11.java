import java.util.LinkedList;
import java.util.List;

// Statement -> recursion (non-tail recursion)
public class Transformation11 {

    protected final List<String> calledKids = new LinkedList<>();

    private static String call(String name) {
        return "Hello " + name;
    }

    public String greeting(String name) {
        storeCalledName(name);
        return call(name);
    }

    public int countKidsBeforeTransformation(String name) {
        int result = 0;
        for (String calledKid : calledKids) {
            if (name.equalsIgnoreCase(calledKid)) {
                return result;
            }
            result++;
        }
        return result;
    }

    public int countKidsBeforeAfterTransformation(String name) {
        return countKidsBeforeTailRecursive(name, 0, 0);
    }

    private int countKidsBeforeTailRecursive(String name, int index, int count) {
        if (index >= calledKids.size()) {
            throw new IllegalStateException("Name %s not found".formatted(name));
        }

        if (calledKids.get(index).equals(name)) {
            return count;
        }

        // non-Tail recursion: last action is the call itself
        return countKidsBeforeTailRecursive(name, index + 1, count + 1);
    }

    private void storeCalledName(String name) {
        calledKids.add(name);
    }
}
