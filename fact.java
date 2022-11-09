import java.util.Scanner;
class demo
{
	int num,fact=1;
	Scanner s1 = new Scanner(System.in);
	void read()
	{
		System.out.println("Enter number :");
		num = s1.nextInt();
	}
	void display()
	{
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial is :-"+fact);
	}
}
public class fact
{
	public static void main(String []args)
	{
		demo d1=new demo();
		d1.read();
		d1.display();
	}
}