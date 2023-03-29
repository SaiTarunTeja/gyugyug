import java.util.*;
public class Tarun 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
        System.out.println("Enter Any Number");
        int n=sc.nextInt();
        if(n>0)
        {
        	System.out.println(n+" is Positive Number");
        }
        else if(n<0)
        {
        	System.out.println(n+" is Negative Number");
        }
        else if(n==0)
        {
        	System.out.println("You Entered Zero");
        }
        else
        {
           System.out.println("Enter a valid input");
        }
	}

}