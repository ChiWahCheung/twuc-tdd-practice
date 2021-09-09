import java.util.Arrays;
import java.util.List;

public class Mommifier {
    public String covert(String s) {
        if (s.length() == 0) {
            return s;
        }
        List<String> vowels = Arrays.asList("a", "o", "e", "i", "u");
        StringBuilder result = new StringBuilder();
        double vowelQuantity = getVowelQuantity(s, vowels, result);
        double vowelsProportion = vowelQuantity / s.length();
        return selectLegalResult(s, result, vowelsProportion);
    }

    private String selectLegalResult(String s, StringBuilder result, double vowelsProportion) {
        if (vowelsProportion >= 0.3) {
            return result.toString();
        }
        return s;
    }

    private double getVowelQuantity(String s, List<String> vowels, StringBuilder result) {
        double vowelQuantity = 0;
        boolean isContinuousVowel = false;
        for (int i = 0; i < s.length(); i++) {
            String letterInS = Character.toString(s.charAt(i));
            if (vowels.contains(letterInS)) {
                if (!isContinuousVowel) {
                    result.append("mommy");
                    isContinuousVowel = true;
                }
                vowelQuantity++;
            } else {
                isContinuousVowel = false;
                result.append(letterInS);
            }
        }
        return vowelQuantity;
    }
}
