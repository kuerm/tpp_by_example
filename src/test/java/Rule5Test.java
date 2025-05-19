import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class Rule5Test {
    @Test
    void statementToStatements() {
        var testee = new TestableRule5();
        String unusedAlreadyCheckedInRule4 = testee.getValue3("Heidi");

        List<String> actual = testee.invokedNames();

        assertThat(actual).containsExactly("Heidi");
    }

    private class TestableRule5 extends Rule5 {

        public List<String> invokedNames() {
            return calledKids;
        }
    }
}