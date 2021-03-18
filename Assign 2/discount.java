import java.util.Scanner;
class discount
{
	public static void main(String []args)
	{	
		Scanner sc=new Scanner(System.in);
		double bill,nbill;
		System.out.println("Enter Bill Amount:");
		bill=sc.nextDouble();
		if(bill>=1 && bill<=5000)
		{
			nbill=bill;
			System.out.println("Bill \t\t NetBill");
			System.out.println(bill+"\t\t"+nbill);
		}
		if(bill>=5001 && bill<=15000)
		{
			nbill=bill-bill*3/100;
			System.out.println("Bill \t\t NetBill");
			System.out.println(bill+"\t\t"+nbill);
		
		}
		if(bill>=15001 && bill<=30000)
		{
			nbill=bill-bill*5/100;
			System.out.println("Bill \t\t NetBill");
			System.out.println(bill+"\t\t"+nbill);
		
		}
		if(bill>=30001)
		{
			nbill=bill-bill*10/100;
			System.out.println("Bill \t\t NetBill");
			System.out.println(bill+"\t\t"+nbill);
		
		}
	}
}