import java.util.*;
class Student {
	private String usn;
	private String name;
    private	int credits[];
	private int marks[];
	private int n;

	void accept()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter student details");
		System.out.println("USN:");
		usn=s.next();
		System.out.println("Name:");
		name=s.next();
		System.out.println("Enter the number of subjects:");
		n=s.nextInt();
		credits=new int[n];
		marks=new int[n];
		System.out.println("Enter credits and marks attained by the student in each subject");
		for(int i=0;i<n;i++)
		{
			credits[i]=s.nextInt();
			marks[i]=s.nextInt();
		}
	}
	void display()
	{
		System.out.println("Student details:");
		System.out.println("USN:"+usn);
		System.out.println("Name:"+name);
		System.out.println("Marks in each subject:");
		for(int i=0;i<n;i++)
		{
			System.out.println("Subject "+(i+1)+":"+marks[i]);
		}
	}
	double calculate()
	{
		int tcp=0,tc=0;
		for(int i=0;i<n;i++)
		{
			tc=tc+credits[i];
			if(marks[i]>=50)
			{
			tcp=tcp+(((marks[i]/10)+1)*credits[i]);
			}
			else if(marks[i]>=40 && marks[i]<50)
			{
				tcp=tcp+(4*credits[i]);
			}
		}
		return (double)tcp/tc;
	}
}
	class StudentMain
	{
		
	public static void main(String ss[]) {
		Student s1=new Student();
		s1.accept();
		s1.display();
		System.out.println("SGPA: "+s1.calculate());
	}
	}
	
