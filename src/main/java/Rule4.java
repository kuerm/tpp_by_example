// constant -> scalar
public class Rule4 {
    /*
      Before
     */
    public String getValue() {
        return "Hello World";
    }

    /*
    After
     */
    public String getValue2(String name) {
        return "Hello " + name;
    }

}
