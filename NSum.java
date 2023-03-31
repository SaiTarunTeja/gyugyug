import java.util.Scanner;
class NSum
{
  public static void main(String[] args)
  {
      Test t=new Test();
      System.out.println(t.m1());
  }
}
class Test
{
   public int m1()
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter any Number");
      int n=sc.nextInt();
      int sum=0,x;
      for(x=1;x<=n;x++)
      {
         sum=sum+x;
      }
      return sum;
   }
}