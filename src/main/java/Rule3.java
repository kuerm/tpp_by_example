// constant -> constant+
public class Rule3 {
    /*
      Before
     */
    public String getValue() {
        return "Hello ";
    }

    /*
    After
     */
    public String getValue2() {
        return "Hello " + "World";
    }

}
