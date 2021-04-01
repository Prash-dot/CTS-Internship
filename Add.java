import java.util.*;
public class Add {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		int num,num1=0,dig,count=0;
		System.out.println("Enter a 4 digit number");
		num=sc.nextInt();
		while(num>0)
		{
			dig=num%10;
			if(dig==8 || dig==9)
				num1+=((dig+2)*(int)(Math.pow(10,count)))-(int)(Math.pow(10,count+1));
			else
				num1+=((dig+2)*(int)(Math.pow(10,count)));
			count++;
			num/=10;
		}
		System.out.println("New Number after adding 2  is : "+num1);
    }
}