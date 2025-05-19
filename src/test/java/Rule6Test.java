import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class Rule6Test {
    @Test
    void unconditionalToConditional() {
        var testee = new TestableRule6();
        String unusedAlreadyCheckedInRule4 = testee.getValue2("Heidi");
        String unused2AlreadyCheckedInRule4 = testee.getValue2("Marcello");

        List<String> actual = testee.invokedNames();

        assertThat(actual).containsExactly("Heidi");
    }

    private class TestableRule6 extends Rule6 {

        public List<String> invokedNames() {
            return calledKids;
        }
    }
}