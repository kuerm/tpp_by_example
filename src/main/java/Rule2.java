// nil -> constant
public class Rule2 {
    /*
      Before
     */
    public String getValue() {
        return null;
    }

    /*
    After
     */
    public String getValue2() {
        return "Hello ";
    }

}
