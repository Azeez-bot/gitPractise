package cherryPick;

public class pp {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 10, 10};
        int k = 14;
        int l = 0;
        int r = 0;
        int sum = 0;
        int maxLen = 0;
        int n = arr.length;
        while (r < n) {
            sum = sum + arr[r];
            // shrink window if sum exceeds k
            while (sum > k) {
                sum = sum - arr[l];
                l = l + 1;
            }
            // update max length if condition satisfied
            if (sum <= k) {
                maxLen = Math.max(maxLen, r - l + 1);
            }
            r = r + 1;
        }

        System.out.println(maxLen);
    }
}
