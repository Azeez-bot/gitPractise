package LeetCodeStrings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Ex_1941 {
    public static boolean hasEqualFrequency(String s) {
        HashMap<Character, Integer> freqMap = new HashMap<>();
        // Count frequency of each character
        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }
        // Get the frequency of the first character to compare with others
        int frequency = -1;
        for (int count : freqMap.values()) {
            if (frequency == -1) {
                frequency = count;
            } else if (count != frequency) {
                return false;
            }
        }
        return true;
    }

    public static boolean areOccuranceEqual(String s){
        Map<Character,Integer> mp=new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(mp.containsKey(ch)){
                mp.put(ch,mp.get(ch)+1);
            }
            else {
                mp.put(ch,1);
            }
        }
        Set<Integer> set=new HashSet<Integer>(mp.values());
        if(set.size()==1){
            return true;
        }
        return false;
    }
    // Example usage
    public static void main(String[] args) {
        System.out.println(hasEqualFrequency("abacbc"));  // true
        System.out.println(hasEqualFrequency("aabbcc"));  // true
        System.out.println(hasEqualFrequency("aabbccc")); // false

        System.out.println(areOccuranceEqual("abacbc"));  // true
        System.out.println(areOccuranceEqual("aabbcc"));  // true
        System.out.println(areOccuranceEqual("aabbccc")); // false

    }

}
