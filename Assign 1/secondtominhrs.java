import java.util.Scanner;
class secondtominhrs
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
double sec,min,hrs;
System.out.println("Enter Seconds to Convert into Hours and Min:");
sec=sc.nextDouble();
min=sec/60;
hrs=min/60;
System.out.println("Minutes:"+min);
System.out.println("Hours:"+hrs);
	
}
}