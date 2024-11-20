import java.util.ArrayList;
public class Main {
public static void main(String[] args)
    {
        WordChecker w = new WordChecker();
        ArrayList<String> words = new ArrayList<String>();
        words.add("an");
        words.add("band");
        words.add("band");
        words.add("abandon");
        WordChecker x = new WordChecker(words);
        System.out.println(x.isWordChain());
        ArrayList<String> vocables = new ArrayList<String>();
        vocables.add("to");
        vocables.add("too");
        vocables.add("stool");
        vocables.add("tools");
        WordChecker y = new WordChecker(vocables);
        System.out.println(y.isWordChain());
        ArrayList<String> terms = new ArrayList<String>();
        terms.add("catch");
        terms.add("catchacat");
        terms.add("cat");
        terms.add("at");
        WordChecker z = new WordChecker(terms);
        System.out.println(z.createList("cat"));
        System.out.println(z.createList("catch"));
        System.out.println(z.createList("dog"));
    }
}
