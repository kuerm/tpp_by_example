// constant -> scalar
public class Transformation4 {
    /**
     * Before
     */
    public String greeting() {
        return "Hello World";
    }

    /**
     * After
     */
    public String greetingAfterTransformation(String name) {
        return "Hello " + name;
    }

}
