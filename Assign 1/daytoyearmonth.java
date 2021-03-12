import java.util.Scanner;
class daytoyearmonth
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
double m,d;
int y;
System.out.println("Enter Days:");
d=sc.nextInt();
y=d/365;
m=y*12;
System.out.println("Year:"+y);
System.out.println("Month:"+m);
}
}