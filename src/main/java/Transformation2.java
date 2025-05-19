// nil -> constant
public class Transformation2 {
    /**
     * Before
     */
    public String greeting() {
        return null;
    }

    /**
     * After
     */
    public String greetingAfterTransformation() {
        return "Hello ";
    }

}
