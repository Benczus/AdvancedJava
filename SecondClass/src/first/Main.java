package first;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> stringList= new ArrayList<>();
        stringList.add(1);
        stringList.add(1);
        stringList.add(2);
        stringList.add(3);
        frequencyTable<Integer> stringfrequencyTable= new frequencyTable<>(stringList);
    }

}
