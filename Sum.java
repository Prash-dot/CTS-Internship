import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 3 digitt number");
        
        int n = sc.nextInt();
        int m =n;
                int r=0;
                int sum=0;
                while(n>0)
                {
                   r=n%10;
                   sum=sum+r;
                   n=n/10;
                }
                System.out.println("Sum of 3 digit number "+m+" is:"+sum);
    }
}