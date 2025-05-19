import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Rule2Test {

    @Test
    void nullToConstant() {
        String actual = new Rule2().getValue2();

        assertThat(actual).isEqualTo("Hello ");
    }
}