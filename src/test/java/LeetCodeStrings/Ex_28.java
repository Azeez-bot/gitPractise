package LeetCodeStrings;

public class Ex_28 {
    public int strStr(String haystack, String needle) {
            int hLen = haystack.length();
            int nLen = needle.length();

            if (nLen == 0) return 0; // empty needle

            for (int i = 0; i <= hLen - nLen; i++) {
                if (haystack.substring(i, i + nLen).equals(needle)) {
                    return i;
                }
            }

            return -1;
        }

        public static void main(String[] args) {
        Ex_28 e=new Ex_28();
        e.strStr("Madam","dam");
    }
}
