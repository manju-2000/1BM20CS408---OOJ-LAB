import java.util.*;
class lab1 {
public static void main(String ss[]) {
double r1,r2;
Scanner s=new Scanner(System.in);
System.out.println("Enter the coefficients of the quadratic equation");
System.out.println("Enter a");
double a = s.nextDouble();
System.out.println("Enter b");
double b = s.nextDouble();
System.out.println("Enter c");
double c = s.nextDouble();
double d = (b*b)-(4*a*c);
if(d>0)
{
System.out.println("Roots are real and different");
r1 = (-b + Math.sqrt(d))/(2*a);
r2 = (-b - Math.sqrt(d))/(2*a);
System.out.println("root1 = "+r1+"\nroot2 = "+r2);
}
else if(d==0)
{
System.out.println("Roots are real and equal");
r1=r2= -b/(2*a);
System.out.println("root1 = root2 = "+r1);
}
else
{
System.out.println("No real solutions");
}
}
}
