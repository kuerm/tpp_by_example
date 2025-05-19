import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Rule1Test {
    @Test
    void fromNothingToNull() {
        String actual = new Rule1().getValue();

        assertThat(actual).isNull();
    }
}