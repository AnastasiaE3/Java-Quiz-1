
public class StringUtilities {
    private int i;


    /**
     * @param input value to be returned
     * @return `input`
     */
    public String returnInput(String input) {

        return input;
    }

    /**
     * @param baseValue value to be added to
     * @param valueToBeAdded value to add
     * @return the concatenation of `baseValue` and `valueToBeAdded`
     */
    public String concatenate(String baseValue, String valueToBeAdded) {
        String result = baseValue + valueToBeAdded;
        return result;
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {
        String result = " ";
            for (int i = valueToBeReversed.length() - 1; i >= 0; i--);
            result += valueToBeReversed.charAt(i);
        return result;
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        int middle = (int)word.length() / 2;
        return word.charAt(middle) ;
    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
        String result = " ";
        for (int i = 0; i < value.length(); i++);
            if (value.charAt(i) != charToRemove);
            result += value.charAt(i);
        return result;
    }

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
        String[] words = sentence.split(" ");
       // return words (words.length -1);
        return null;
    }
        }