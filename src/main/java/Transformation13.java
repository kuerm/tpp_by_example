// variable -> mutation
public class Transformation13 {

    public String greetingBeforeTransformation(String name) {
        String greeting = "Hello ";
        String suffix = "!";
        String returnvalue = greeting + name + suffix;
        return returnvalue;
    }

    public String greetingAfterTransformation(String name) {
        String greeting = "Hello ";
        String suffix = "!";

        name = greeting + name;
        name += suffix;

        return name;
    }

}
