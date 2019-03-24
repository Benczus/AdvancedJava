package first;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

class frequencyTable<E> {

    private Map<E, Integer> frequencyMap;

    frequencyTable(Collection<E> eCollection) {
        frequencyMap =new HashMap<>();
        for (E eObject : eCollection) {
            Integer freq = frequencyMap.get(eObject);
            frequencyMap.put(eObject, (freq == null) ? 1 : freq + 1);
        }

        System.out.println(frequencyMap.size() + " distinct words:");
        System.out.println(frequencyMap);
    }
}
