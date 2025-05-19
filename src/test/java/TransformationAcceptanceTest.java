import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class TransformationAcceptanceTest {
    @Test
    void t1_fromNothingToNull() {
        String actual = new Transformation1().greeting();

        assertThat(actual).isNull();
    }

    @Test
    void t2_nullToConstant() {
        String actual = new Transformation2().greetingAfterTransformation();

        assertThat(actual).isEqualTo("Hello ");
    }

    @Test
    void t3_constantToConstantPlus() {
        String actual = new Transformation3().greetingAfterTransformation();

        assertThat(actual).isEqualTo("Hello World");
    }

    @Test
    void t4_constantToScalar() {
        String actual = new Transformation4().greetingAfterTransformation("Heidi");

        assertThat(actual).isEqualTo("Hello Heidi");
    }

    @Test
    void t5_statementToStatements() {
        var testee = new TestableTransformation5();
        String unusedAlreadyCheckedInRule4 = testee.greetingAfterTransformation2("Heidi");

        List<String> actual = testee.invokedNames();

        assertThat(actual).containsExactly("Heidi");
    }

    @Test
    void t6_unconditionalToConditional() {
        var testee = new TestableTransformation6();
        String unusedAlreadyCheckedInRule4 = testee.greetingAfterTransformation("Heidi");
        String unused2AlreadyCheckedInRule4 = testee.greetingAfterTransformation("Marcello");

        List<String> actual = testee.invokedNames();

        assertThat(actual).containsExactly("Heidi");
    }

    @Test
    void t7_scalarToArray() {
        var testee = new Transformation7();

        String[] actual = testee.fruits();

        assertThat(actual).containsExactlyInAnyOrder("apple", "banana");
    }

    @Test
    void t8_arrayToContainer() {
        var testee = new Transformation8();

        boolean actual = testee.has("Banana");

        assertThat(actual).isTrue();
    }

    @Test
    void t9_statementToTailRecursion() {
        var testee = new Transformation9();
        testee.greeting("Heidi");
        testee.greeting("Hugo");
        testee.greeting("Peter");
        testee.greeting("Claudia");

        int actual = testee.countKidsBeforeAfterTransformation("Peter");

        assertThat(actual).isEqualTo(2);
    }

    @Test
    void t10_ifToLoop() {
        var testee = new Transformation10();

        String actual = testee.chooseAfterTransformation("Banana");

        assertThat(actual).isEqualTo("You're welcome. Here is your Banana. Total quantity 3");
    }

    @Test
    void t10_ifToLoopWhenFailing() {
        var testee = new Transformation10();

        testee.chooseAfterTransformation("Banana");
        testee.chooseAfterTransformation("Banana");
        testee.chooseAfterTransformation("Banana");
        String actual = testee.chooseAfterTransformation("Banana");

        assertThat(actual).isEqualTo("Sorry mate, no more Banana for you");
    }

    @Test
    void t11_statementToRecursion() {
        var testee = new Transformation11();
        testee.greeting("Heidi");
        testee.greeting("Hugo");
        testee.greeting("Peter");
        testee.greeting("Claudia");

        int actual = testee.countKidsBeforeAfterTransformation("Claudia");

        assertThat(actual).isEqualTo(3);
    }

    @Test
    void t12_expressionToFunction() {
        Transformation12 testee = new Transformation12();

        String actual = testee.greetingAfterTransformation("Max");

        assertThat(actual).isEqualTo("Hello Max");
    }

    @Test
    void t13_variableToMutation() {
        Transformation13 testee = new Transformation13();

        String actual = testee.greetingAfterTransformation("Ursula");

        assertThat(actual).isEqualTo("Hello Ursula!");
    }

    @Test
    void t14_addCaseSwitch() {
        Transformation14 testee = new Transformation14();

        String actual = testee.fruitColorAfterTransformation("Orange");

        assertThat(actual).isEqualTo("orange");
    }

    private class TestableTransformation6 extends Transformation6 {

        public List<String> invokedNames() {
            return calledKids;
        }
    }

    private class TestableTransformation5 extends Transformation5 {

        public List<String> invokedNames() {
            return calledKids;
        }
    }

}
