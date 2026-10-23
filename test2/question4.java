public class question4 {
    public static int[] find(String[] args) {
        String s = "leetcode";

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                return new int[]{-1};
            } else {
                return new int[]{i};
            }
        }

        return new int[]{-1};
    }

    public static void main(String[] args) {
        System.out.println(java.util.Arrays.toString(find(args)));
    }
}
