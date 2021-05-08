package stream.map;

import java.util.*;

public class MyStream {

    static private Calculate c;

    static void myMap(List<Integer> list, Calculate c) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, c.compute(list.get(i)));
        }
    }
}

@FunctionalInterface
interface Calculate{
    int compute(int a);
}
