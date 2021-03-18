import java.util.Scanner;
class salary
{
	public static void main(String []args)
	{	
		Scanner sc=new Scanner(System.in);
		double sal,tax,nsal;
		System.out.println("Enter Salary:");
		sal=sc.nextDouble();
		if(sal>=1 && sal<=5000)
		{
			tax=0;
			nsal=sal;
			System.out.println("Salary \t\t Tax \t\t Netsalary\t\t Designation");
			System.out.println(sal+"\t\t"+tax+"\t\t"+nsal+"\t\t"+"Peon");
		}
		else if(sal>=5001 && sal<=10000)
		{
			tax=sal*3/100;
			nsal=sal-tax;
			System.out.println("Salary \t\t Tax \t\t Netsalary\t\t Designation");
			System.out.println(sal+"\t\t"+tax+"\t\t"+nsal+"\t\t"+"Clerk");
		}
		else if(sal>=10001 && sal<=25000)
		{
			tax=sal*5/100;
			nsal=sal-tax;
			System.out.println("Salary \t\t Tax \t\t Netsalary\t\t Designation");				System.out.println(sal+"\t\t"+tax+"\t\t"+nsal+"\t\t"+"Asst Manager");
		}
		else if(sal>=25001 && sal<=50000)
		{
			tax=sal*7/100;
			nsal=sal-tax;
			System.out.println("Salary \t\t Tax \t\t Netsalary\t\t Designation");
			System.out.println(sal+"\t\t"+tax+"\t\t"+nsal+"\t\t"+"Manager");
		}
		else if(sal>=50001)
		{
			tax=sal*10/100;
			nsal=sal-tax;
			System.out.println("Salary \t\t Tax \t\t Netsalary\t\t Designation");
			System.out.println(sal+"\t\t"+tax+"\\t"+nsal+"\t\t"+"MD");
		
		}
	}
}