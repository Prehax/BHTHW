package HWCollection;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Test for Set
        List<Integer> l1 = Arrays.asList(1,2,3,4,5);
        List<Integer> l2 = Arrays.asList(4,5,6,7,8);
        HWSet s = new HWSet();
        Set<Integer> set = s.findTrueFriend(l1, l2);
        System.out.println(set);

        // Test for Map
        String a = "jsfioafhe832ufhfah87f";
        HWMap m = new HWMap();
        Map<Character, Integer> map = m.findDup(a);
        System.out.println(map);

        // Test for Database
        HWDatabase db = new HWDatabase();
        db.addData("Name", "Longlong");
        db.addData("Gender", "Male");
        db.showData();

        System.out.println(db.findData("fff"));
        db.removeData("Name");
        db.showData();

        db.updateData("Gender", "Female");
        db.showData();

        System.out.println(db.findData("Gender"));


    }
}
