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
    void should_return_empty_string_when_given_empty_string() {
        assertEquals("", mommifier.covert(""));
    }

    @Test
    void should_return_itself_given_not_vowels() {
        assertEquals("b", mommifier.covert("b"));
    }

    @Test
    void should_return_mommy_given_one_vowel() {
        assertEquals("mommy", mommifier.covert("a"));
    }

    @Test
    void should_return_itself_given_the_number_of_vowels_less_than_30percent() {
        assertEquals("abbbbbb", mommifier.covert("abbbbbb"));
    }

    @Test
    void should_return_covert_singele_not_continuous_vowel_to_mommy_given_the_number_of_vowels_more_than_30percent() {
        assertEquals("mommybcdmommy", mommifier.covert("abcde"));
    }

    @Test
    void should_return_covert_continuous_vowels_to_mommy_given_the_number_of_vowels_more_than_30percent() {
        assertEquals("mommybcdmommy", mommifier.covert("aoebcdiu"));
    }
}
