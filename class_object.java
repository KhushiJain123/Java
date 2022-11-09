// java prgrm to demon use of class and object
import java.util.Scanner;
class demo
{
	int num1,num2,add,sub;
	Scanner s1 = new Scanner(System.in);
	void read()
	{
		System.out.println("Enter number1 :");
		num1 = s1.nextInt();

		System.out.println("Enter number2 :");
		num2 = s1.nextInt();
	}
	void add()
	{
		add = num1 + num2;
		System.out.println("Addition of "+num1+"and "+num2+"is :"+add);
	}
		void sub()
		{
			sub = num1 - num2;
			System.out.println("Subtration of "+num1+"and "+num2+"is :"+sub);
		}
	}
	public class class_object
	{
		public static void main(String []args)
		{
			demo d1 = new demo();
			d1.read();
			d1.add();
			d1.sub();
			System.out.println("............................................................");
			demo d2;
			d2 = new demo();
			d2.read();
			d2.add();
			d2.sub();
		}
	}
