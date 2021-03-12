import java.util.Scanner;
class minutetosechrs
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
double hrs,min,sec;
System.out.println("Enter Minutes:");
min=sc.nextDouble();
sec=min*60;
hrs=min/60;
System.out.println("Seconds:"+sec);
System.out.println("Hours:"+hrs);

	
}
}