public class question6 {
    public static void main(String[]args){
        int[] prices = {7, 1, 5, 3, 6, 4};
        int n = prices.length;
        int current = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                current = prices[j] - prices[i];
                if (max < current) {
                    max = current;
                }
            }
        }
        System.out.println(max);
    }
}
