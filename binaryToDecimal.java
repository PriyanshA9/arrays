import java.util.Scanner;

public class binaryToDecimal {
    
    public static void binToDec(String s){
        int m = 0;
        int k = 1;

        for(int i = s.length() - 1 ; i >=0 ; i--){
            m += (s.charAt(i) - '0') * k;
            k = k * 2;
        }
        System.out.println("Decimal of " + s + " is : " + m);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Binary Value : ");
        String s = sc.next();

        binToDec(s);

        sc.close();
    }
}
