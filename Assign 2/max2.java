import java.util.Scanner;
class max2
{
	public static void main(String []args)
{	
	Scanner sc=new Scanner(System.in);
int no1,no2;
System.out.println("Enter First number:");
no1=sc.nextInt();
System.out.println("Enter Second number:");
no2=sc.nextInt();
if(no1>no2)
{	System.out.println("First Number is Max");
}
else
{
	System.out.println("Second number is Max");
}
}
}
