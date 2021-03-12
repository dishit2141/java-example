import java.util.Scanner;
class yeartodaymonth
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
int y,m,d;
System.out.println("Enter Year:");
y=sc.nextInt();
d=y*365;
m=d/30;
System.out.println("Days:"+d);
System.out.println("Month:"+m);
}
}