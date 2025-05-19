// variable -> mutation
public class Transformation13 {

    /**
     * Before
     */
    public String greeting(String name) {
        String greeting = "Hello ";
        String suffix = "!";
        String returnvalue = greeting + name + suffix;
        return returnvalue;
    }

    /**
     * After
     */
    public String greetingAfterTransformation(String name) {
        String greeting = "Hello ";
        String suffix = "!";

        name = greeting + name;
        name += suffix;

        return name;
    }

}
