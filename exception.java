//Assignment No 11. Write a Java program that demonstrates Exception
//(Divide by 0).
class exception{
public static void main(String []args){
int a = 5;
int b = 0;
try{
System.out.println(a/b);
}
catch(ArithmeticException e){
System.out.println("Devision by zero is not possible");
}
}
}