package LeetCodeStrings;

public class Ex_1945 {
        public int getLucky(String s, int k) {
            // Step 1: Convert each character to its alphabetical position
            StringBuilder numStr = new StringBuilder();
            for (char c : s.toCharArray()) {
                int val = c - 'a' + 1; // 'a' = 1, 'b' = 2, ..., 'z' = 26
                numStr.append(val);
            }

            // Step 2: Sum digits k times
            while (k-- > 0) {
                int sum = 0;
                for (char digit : numStr.toString().toCharArray()) {
                    sum += digit - '0';
                }
                numStr = new StringBuilder(String.valueOf(sum));
            }

            return Integer.parseInt(numStr.toString());
        }


    public static void main(String[] args) {
        Ex_1945 sol = new Ex_1945();
        String s = "leetcode";
        int k = 2;
        int result = sol.getLucky(s, k);
        System.out.println(result); // Output: 6
    }
}
