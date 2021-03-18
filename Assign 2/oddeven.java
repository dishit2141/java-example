import java.util.Scanner;
class oddeven
{
	public static void main(String []args)
{	
	Scanner sc=new Scanner(System.in);
int no;
System.out.println("Enter number to check odd or even");
no=sc.nextInt();
if(no%2==0)
{
	System.out.print("Number is Even");
}
else
{

	System.out.print("Number is Odd");
}
}
}