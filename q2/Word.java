package q2;

/**
 * Word: represents a word with its frequency being counted.
 * 
 * @author Echo Wang - Set 1C
 * @version 1.0
 *
 */
public class Word implements Comparable <Word> {
    /**
     * The word in the book.
     */
    private final String word;
    
    /**
     * The frequency of the word.
     */
    private int f;
    
    /**
     * The constructor of the Word class.
     * 
     * @param word the content of the Word object
     */
    public Word(String word) {
        this.word = word;
        f = 1;
    }
    
    /**
     * Accessor for the content of a Word object.
     * 
     * @return the string of content
     */
    public String getWord() {
        return word;
    }
    
    /**
     * Accesor for the frequency of a word.
     * 
     * @return the frequency;
     */
    public int getF() {
        return f;
    }
    
    /**
     * Mutator for f to increment it by 1.
     * 
     * @return incremented f
     */
    public int incrementF() {
        return f++;
    }
    
    /**
     * Returns the word and its frequency.
     * 
     * @return the string and the frequence
     */
    public String toString() {
        String str = word + " " + f;
        return str;
    }
    
    /**
     * To compare 2 words' frequencies.
     * 
     * @param otherWord another word
     * @return a negative number "this" object has a higher frequency, 
     *         0 when the frequencies are equal, 
     *         a positive no. when "otherWord" object has a higher frequency
     */
    public int compareTo(Word otherWord) {
        if (this.f != otherWord.f) {
            return otherWord.f - this.f;  
        } else {
            return 0;
        }
    }
}
