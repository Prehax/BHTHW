package HWCollection;
import java.util.*;
public class HWMap {
    public Map<Character, Integer> findDup(String s) {
        Map<Character, Integer> result = new HashMap<>();
        char tempChar;
        for (int i = 0; i < s.length(); i++) {
            tempChar = s.charAt(i);
            if(!result.containsKey(tempChar)) {
                result.put(tempChar, 1);
            } else {
                result.put(tempChar, result.get(tempChar)+1);
            }
        }

        Map<Character, Integer> finalResult = new HashMap<>();
        for(char key: result.keySet()) {
            if(result.get(key) != 1) {
                finalResult.put(key, result.get(key));
            }
        }

        return finalResult;
    }
}
