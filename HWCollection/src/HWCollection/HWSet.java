package HWCollection;

import java.util.*;

public class HWSet {
    public Set<Integer> findTrueFriend(List<Integer> a, List<Integer> b) {
        Set<Integer> result = new HashSet<>();
        for (int num: a) {
            if (b.contains(num)) { result.add(num); }
        }
        return result;
    }

}
