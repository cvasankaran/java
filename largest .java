import java.util.scanner;
class larger number
{
   public static void main(string[] args)
   {
       int a,b,c,larger,temp;
       scanner sc= new scanner(System.in);
       System.out.println("enter the first number");
       a= sc.nextInt();
       System.out.println("enter the second number");
       b= sc.nextInt();
       System.out.println("enter the third number");
       c= sc.nextInt();
       temp=a>b?a:b;
       larger=c>temp?c:temp;
       System.out.println("the largest number is"+larger);
   }
}