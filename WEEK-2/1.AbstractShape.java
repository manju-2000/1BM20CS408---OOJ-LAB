import java.util.*;
abstract class Shape
{
int a,b;
abstract void printArea();
}

class Rectangle extends Shape
{
void printArea()
{
Scanner ss=new Scanner(System.in);
System.out.println("Enter length and breadth of the rectangle");
a=ss.nextInt();
b=ss.nextInt();
double area;
area=(double)a*b;
System.out.println("The area of Rectangle is "+area);
}
}
class Triangle extends Shape
{
void printArea()
{
Scanner ss=new Scanner(System.in);
System.out.println("Enter base length and height of the triangle");
a=ss.nextInt();
b=ss.nextInt();
double area;
area=(double)0.5*a*b;
System.out.println("The area of Triangle is "+area);
}
}
class Circle extends Shape
{
void printArea()
{
Scanner ss=new Scanner(System.in);
System.out.println("Enter radius of the circle");
a=ss.nextInt();
double area;
area=(double)3.14*a*a;
System.out.println("The area of Circle is "+area);
}
}

class Main
{
public static void main(String args[])
{
int ch;
Scanner ss=new Scanner(System.in);
Rectangle r=new Rectangle();
Triangle t=new Triangle();
Circle c=new Circle();
while(true){
System.out.println("Enter the choice of shape whose area has to be calculated");
System.out.println("1.Rectangle\n2.Triangle\n3.Circle\n4.Exit");
ch=ss.nextInt();
switch(ch)
{
case 1:
r.printArea();
break;
case 2:
t.printArea();
break;
case 3:
c.printArea();
break;
case 4:
System.exit(0);
break;
default:
System.out.println("Invalid choice!");
}
}
}
}
