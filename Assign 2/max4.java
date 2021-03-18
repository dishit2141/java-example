import java.util.Scanner;
class max4
{
	public static void main(String []args)
{	
	Scanner sc=new Scanner(System.in);
int a,b,c;
int d;
int result;
System.out.println("Enter First number:");
a=sc.nextInt();
System.out.println("Enter Second number:");
b=sc.nextInt();
System.out.println("Enter Third number:");
c=sc.nextInt();
System.out.println("Enter Fourth number:");
d=sc.nextInt();
if (a > b) {
    if (a > c && a > d) {
        result = a;
    } else {
        if (c > d) {
            result = c;
        } else {
            result = d;
        }
    }
} else {
    if (b > c && b > d) {
        result = b;
    } else {
        if (c > d) {
            result = c;
        } else {
            result = d;
        }
    }
}

System.out.println(result+ "is max among all");
}
}