import java.util.Scanner;
class lastdigit5
{
	public static void main(String []args)
{	
	Scanner sc=new Scanner(System.in);
int no;
System.out.println("Enter any number:");
no=sc.nextInt();
if(no%10==5)
{
	System.out.println("Last digit is 5");
}
else
{
	System.out.println("Last digit is not 5");
}
}
}