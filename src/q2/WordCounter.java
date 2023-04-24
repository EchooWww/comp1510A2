package q2;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;


/**
 * WordCounter: to get the number and frequencies of distinct words in a doc.
 * 
 * @author Echo Wang - Set 1C
 * @version 1.0
 */
public class WordCounter {
    
    /**
     * The list of Word objects.
     */
    private ArrayList<Word> wordList;
    
    /**
     * The constructor of WordCounter.
     */
    public WordCounter() {
        wordList = new ArrayList<Word>();
    }
    
    /**
     * Scans the document of a book and return number of distinct words.
     * 
     * @param filename the filename of the document
     * @return int the number of unique words
     * @throws IOException to handle the errors in reading the file
     */
    public int parseBook(String filename) throws IOException {
        Scanner fileScan = new Scanner(new File(filename));
        while (fileScan.hasNext()) {
            //make all the words in lowercase and remove punctuations /numbers
            String word = fileScan.next().toLowerCase().replaceAll("\\W", "").
                    replaceAll("\\d", "");
            boolean found = false;
            //check each Word object in wordList whether there's a match. 
            //once found, increment frequency and break
            for (Word w : wordList) {
                if (w.getWord().equals(word)) {
                    w.incrementF();
                    found = true;
                    break;
                }
            }
            //if no match found, create a new Word object and add to wordList
            if (!found && !word.equals("")) {
                Word newWord = new Word(word);
                wordList.add(newWord);
            }
        }
        fileScan.close();
        //return the length of wordList, i.e., the number of unique words
        return wordList.size();
    }
    
    /**
     * Sort the wordList with frequency, from high to low.
     * 
     * @return the sorted list
     */
    public ArrayList<Word> sortWordList() {
        wordList.sort(null);
        return wordList;
    }
    
    /**
     * Prints the n most frequent words in order.
     * 
     * @param n the number of words required.
     */
    public void printTopWords(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("" + sortWordList().get(i).getWord()
                    + "\t " + sortWordList().get(i).getF());
        }
    }
    
    /**
     * Drives the program. 
     * Creates a WordCounter object to count words and frequencies.
     * 
     * @param args unused
     * @throws IOException to handle the errors in reading the file
     */
    public static void main(String[] args) throws IOException {
        WordCounter wc1 = new WordCounter();
        System.out.println("There are " + wc1.parseBook("bible.txt") 
            + " distinct words in King James Bible. "
            + "Top 10 most frequent words are:");
        final int n = 10;
        System.out.println("Word\tFrequency"); 
        wc1.printTopWords(n);
        System.out.println("Question two was called and ran sucessfully.");
    }
}
