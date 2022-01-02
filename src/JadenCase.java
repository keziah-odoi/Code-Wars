public class JadenCase {

    public String toJadenCase(String phrase) {
        if (phrase == null || phrase == "")
            return null;
        String[] words = phrase.split(" ");
        StringBuilder phraseBuilder = new StringBuilder();
        for (String word : words) {
            String firstLetter = word.substring(0, 1).toUpperCase();
            String lastLetter = word.substring(1);
            phraseBuilder.append(firstLetter + lastLetter + " ");
        }
        phrase = phraseBuilder.toString().trim();

        return phrase;
    }

}
