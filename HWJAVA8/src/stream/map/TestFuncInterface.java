package stream.map;

import java.util.*;

public class TestFuncInterface {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        System.out.println(list);
        MyStream.myMap(list, o->o*3);
        System.out.println(list);
    }
}
