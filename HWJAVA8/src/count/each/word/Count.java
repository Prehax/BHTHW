package count.each.word;

import java.util.*;
import java.util.stream.Collectors;

public class Count {
    public static void main(String[] args) {
        String s = "Eclipse eclipse Eclipse eclipse amc clip ECLIPSE";

        List<String> strList = Arrays.asList(s.split(" "));

        Map<String, Integer> result = strList.stream().collect(Collectors.groupingBy(o->o.toLowerCase(), Collectors.summingInt(o->1)));

        for (String key :
                result.keySet()) {
            System.out.println(key + " -> " + result.get(key));
        }
    }
}
