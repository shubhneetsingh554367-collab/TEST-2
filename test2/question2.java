// find The BEST pair of Students
import java.util.*;

public class question2 {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};

        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(i);
                    System.out.println(j);
                    return;
                }
            }
        }

        System.out.println("No pair found");
    }
}
