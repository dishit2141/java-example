import java.util.Scanner;
class max3
{
	public static void main(String []args)
{	
	Scanner sc=new Scanner(System.in);
int no1,no2,no3;
System.out.println("Enter First number:");
no1=sc.nextInt();
System.out.println("Enter Second number:");
no2=sc.nextInt();
System.out.println("Enter Third number:");
no3=sc.nextInt();

 if(no1 >= no2) {
            if(no1 >= no3)
                System.out.println(no1 + " is the largest number.");
            else
                System.out.println(no3 + " is the largest number.");
        } else {
            if(no2 >= no3)
                System.out.println(no2 + " is the largest number.");
            else
                System.out.println(no3 + " is the largest number.");
        }
}
}
