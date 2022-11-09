// fibonacci series
import java.util.Scanner;
class demo
{
	int t1,t2,num,nextno;
	Scanner s1 = new Scanner(System.in);
	void read()
	{
		System.out.println("Enter number :");
		num = s1.nextInt();
	}
    void show()
    {
		t1 = 0;
		t2 = 1;
		System.out.println("Fibonacci Series is :-");
		System.out.println(t1);
		System.out.println(t2);

		for(int i=1;i<=num;i++)
		{
			nextno = t1 + t2;
			System.out.println(nextno);
			t1 =t2;
			t2 = nextno;
		}
	}
}
public class fibo
{
	public static void main(String []args)
	{
		demo d1 = new demo();
		d1.read();
		d1.show();
	}
}