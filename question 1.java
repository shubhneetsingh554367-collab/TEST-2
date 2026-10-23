// find the actual missing number of the array;
public class question1 {
    public static void main(String[] args) {
        int[] arr = {3, 0, 1};
        int n = arr.length;

        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int i=0;i<n; i++) {
            actualSum += i;
        }

        int missing = expectedSum - actualSum;

        System.out.println(missing);
    }
}
