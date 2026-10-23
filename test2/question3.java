// find the second highest Score;
import java.util.Scanner;

public class question3{

    public static int getSecondLargest(int[] arr) {
        int highest = -1;
        int secondhighest = -1;
        int n = arr.length;
        for(int i = 0; i<n; i++){
            if(arr[i]>highest){
                secondhighest =highest;
                highest = arr[i];
            }
            else if(arr[i]<highest&& arr[i]>secondhighest){
                secondhighest=arr[i];
            }
        }
        return highest;
    }
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int answer = getSecondLargest(arr);

        System.out.println("Second largest: " + answer);

    }
}


