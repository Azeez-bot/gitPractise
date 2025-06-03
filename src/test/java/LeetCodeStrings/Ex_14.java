package LeetCodeStrings;

import java.util.Arrays;

public class Ex_14 {
    public String longestCommonPrefix(String[] v) {
        StringBuilder ans = new StringBuilder();
        Arrays.sort(v);
        String first = v[0];
        String last = v[v.length - 1];
        for (int i = 0; i < Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i) != last.charAt(i)) {
                return ans.toString();
            }
            ans.append(last.charAt(i));
        }
        return ans.toString();
    }

    public static String longestCommonSuffix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        // Step 1: Reverse all strings
        String[] reversed = new String[strs.length];
        for (int i = 0; i < strs.length; i++) {
            reversed[i] = new StringBuilder(strs[i]).reverse().toString();
        }

        // Step 2: Find longest common prefix of reversed strings
        String shortest = reversed[0];
        for (int i = 1; i < reversed.length; i++) {
            shortest = commonPrefix(shortest, reversed[i]);
            if (shortest.isEmpty()) break;
        }

        // Step 3: Reverse the result to get the suffix
        return new StringBuilder(shortest).reverse().toString();
    }

    private static String commonPrefix(String a, String b) {
        int minLen = Math.min(a.length(), b.length());
        int i = 0;
        while (i < minLen && a.charAt(i) == b.charAt(i)) {
            i++;
        }
        return a.substring(0, i);
    }


    public static void main(String[] args) {
        Ex_14 e=new Ex_14();
        String[] strs ={"flower","flow","flight"};
        String[] sk={"Instruction","Suggestion","Construction"};
        System.out.println(e.longestCommonSuffix(sk));
        System.out.println(e.longestCommonPrefix(strs));
    }
}

