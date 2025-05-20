import java.util.List;

// Array -> Container
public class Transformation8 {

    private final String[] fruitsAsArray = {"apple", "banana"};
    private final List<String> fruits = List.of("apple", "banana");


    public String[] fruitsAsArrayBeforeTransformation() {
        return fruitsAsArray;
    }

    public boolean hasFruit(String fruitName) {
        return fruitsAfterTransformation().stream().anyMatch(fruitName::equalsIgnoreCase);
    }

    private List<String> fruitsAfterTransformation() {
        return fruits;
    }

}
