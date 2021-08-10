import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MommifierTest {

    /*
     * 1.
     * Given:
     * empty string
     * When:
     * convert
     * Then:
     * itself
     */
    Mommifier mommifier = new Mommifier();
    @Test
    void should_create_method() {
        new Mommifier();
    }

    @Test
    void should_return_empty_string_when_given_empty_string() {
        assertEquals("", mommifier.covert(""));
    }


}
