import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Rule4Test {
    @Test
    void constantToScalar() {
        String actual = new Rule4().getValue2("Heidi");

        assertThat(actual).isEqualTo("Hello Heidi");
    }
}