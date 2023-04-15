import java.util.Scanner;

public class largestInAnArray {
    
    public static int largest(int []arr, int n){
        int max = arr[0];
        for(int i = 1 ; i < n ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i = 0 ; i < n ; i++){
            System.out.print("Enter element " + (i+1) + " : ");
            arr[i] = sc.nextInt();
        }

        int x = largest(arr,n);
        System.out.println("The largest in array is : " + x);

        sc.close();
    }
}
