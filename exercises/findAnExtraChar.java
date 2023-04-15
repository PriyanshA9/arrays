import java.util.Scanner;

public class findAnExtraChar {
    
    public static char findextrachar(String s1, String s2){
        int res = 0;

        int n = s1.length();

        for(int i = 0; i < n; i++)
        {
            res = res ^ s1.charAt(i) ^ s2.charAt(i);
        }           

        res = res ^ s2.charAt(n);

        return (char)res;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string : ");
        String s = sc.next();
        
        System.out.print("Enter the string : ");
        String m = sc.next();

        char d = findextrachar(s,m);
        System.out.println("The extra character is : " + d);

        sc.close();
    }    
}
