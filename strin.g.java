import java.util.Scanner;
class string
{
    public static void main()
    {
		String first = "Hello";
		String second = "World";
		String third = "World";

		System.out.println("first string is :"+first);
		System.out.println("second string is :"+second);
		char ch = first.charAt(0);
		System.out.println("Character at:-"+ch);
		String upperStr = first.toUpperCase();
		System.out.println("To Upper Case is :-"+upperStr);

		String lowerStr = second.toLowerCase();
		System.out.println("To Lower Case is :-"+lowerStr);

		String join = first.concat(second);
		System.out.println("Join string :-"+join);

		int length = first.length();
		System.out.println("Length of string is :-"+length);

		boolean result1 = first.equals(second);
		System.out.println("String first and second are equal :-"+result1);
		 boolean result2 = second.equals(third);
		 System.out.println("String second and third are equal :="+result2);
	 }
 }

