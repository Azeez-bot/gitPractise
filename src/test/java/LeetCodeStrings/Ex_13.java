package LeetCodeStrings;

import java.util.HashMap;
import java.util.Map;

public class Ex_13 {
    public int romanToInt(String s) {
        Map<Character, Integer> mp = new HashMap<Character, Integer>();
        mp.put('I', 1);
        mp.put('V', 5);
        mp.put('X', 10);
        mp.put('L', 50);
        mp.put('C', 100);
        mp.put('D', 500);
        mp.put('M', 1000);
        int result = mp.get(s.charAt(s.length() - 1));
        for (int i = s.length() - 2; i >=0; i--) {
            if (mp.get(s.charAt(i)) < mp.get(s.charAt(i + 1))) {
                result -= mp.get(s.charAt(i));
            }
            else
            {
                result += mp.get(s.charAt(i));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Ex_13 ex=new Ex_13();
        ex.romanToInt("MCMXCIV");
    }
}
