import java.util.Scanner;
class demo
{
    int a,b,c;
    void read(int x,int y)
    {
		a = x;
		b = y;
	}
	void read(int z)
	{
		c = z;
	}
	void display()
	{
		System.out.println(a+b+c);
	}
}
class methodOverloading
{
	public static void main(String args[])
	{
		demo d1 = new demo();
		d1.read(5);
		d1.read(10,5);
		d1.display();
	}
}