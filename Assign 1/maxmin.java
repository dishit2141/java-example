import java.util.Scanner;
class maxmin
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
int a,b;
System.out.println("Enter First value:");
a=sc.nextInt();
System.out.println("Enter Second value:");
b=sc.nextInt();
int c=Math.max(a,b);
int d=Math.min(a,b);
System.out.println("Max="+c);
System.out.println("Min="+d);
}
}
