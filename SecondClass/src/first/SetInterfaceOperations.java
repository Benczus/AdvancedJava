package first;

import com.sun.xml.internal.fastinfoset.util.StringArray;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class SetInterfaceOperations {

    /*
    Mi történik ha valamilyen sorrendben szeretném kiiratni?
     */

    public Set<String> printDistinctWordsForEach(String[] stringArray){
        Set<String> s = new HashSet<>();
        for (String a : stringArray)
            s.add(a);
        //can be replaced with Collection.addALL()
        System.out.println(s.size() + " distinct words: " + s);
        return s;
    }

    public Set<String> printDistinctWordsAggregate(String[] stringArray){
        Set<String> distinctWords = Arrays.stream(stringArray)
                .filter(e -> e.equals("a"))
                .collect(Collectors.toSet());
        System.out.println(distinctWords.size()+
                " distinct words: " +
                distinctWords);
        return distinctWords;
    }

    public Set<String> printDistintAndDuplicateWords(String[] stringArray){
        Set<String> uniques = new HashSet<>();
        Set<String> dups    = new HashSet<String>();

        for (String a : stringArray)
            if (!uniques.add(a))
                dups.add(a);

        // Destructive set-difference
        uniques.removeAll(dups);

        System.out.println("Unique words:    " + uniques);
        System.out.println("Duplicate words: " + dups);
        return uniques;
    }


}
