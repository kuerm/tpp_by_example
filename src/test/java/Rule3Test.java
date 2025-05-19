import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Rule3Test {
    @Test
    void constantToConstantPlus() {
        String actual = new Rule3().getValue2();

        assertThat(actual).isEqualTo("Hello World");
    }
}