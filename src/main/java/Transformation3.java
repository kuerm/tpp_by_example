// constant -> constant+
public class Transformation3 {
    /**
     * Before
     */
    public String greeting() {
        return "Hello ";
    }

    /**
     * After
     */
    public String greetingAfterTransformation() {
        return "Hello " + "World";
    }

}
