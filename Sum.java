import java.util.*;
class Sum
{
   public static void main(String[] args)
   {
      System.out.println(Sum.m1());
   }
   public static int m1()
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter Any Two Numbers");
      int a=sc.nextInt();
      int b=sc.nextInt();
      int c=a+b;
      return c;
   }
}