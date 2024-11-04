import java.util.ArrayList;

public class WordChecker {

    private ArrayList<String> wordList;wordList=new ArrayList<String>();

    /**
     * Returns true if each element of wordList (except the first) contains the
     * previous
     * element as a substring and returns false otherwise, as described in part (a)
     * Precondition: wordList contains at least two elements.
     * Postcondition: wordList is unchanged.
     */

    public boolean isWordChain() {
        for (int i = 1; i < wordList.size(); i++) {
            String after = wordList.get(i);
            String before = wordList.get(i - 1);
        }
        if(after.indexof(before) < 0) return false;
        else return true; 

    }

    public ArrayList<String> createList(String target) {
        /* to be implemented in part (b) */ }
}