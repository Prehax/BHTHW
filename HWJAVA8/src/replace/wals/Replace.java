package replace.wals;

import java.util.*;
import java.util.stream.Collectors;

public class Replace {
    public static void main(String[] args) {
        String s = "walabcwalexywalxzsfwalmx";

//        System.out.println(Arrays.stream(s.split("wal")).collect(Collectors.joining("sams")));
        System.out.println(String.join("sams", s.split("wal")));
    }
}
