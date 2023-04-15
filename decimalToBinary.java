import java.util.Scanner;

public class decimalToBinary{
    
    public static void decToBin(int n){
        String s = " ";
        int x = n;

        while(n > 0){
            s = (n % 2) + s;
            n = n / 2;
        }
        System.out.println("Binary of " + x + " is : " + s);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        decToBin(n);

        sc.close();
    }
}