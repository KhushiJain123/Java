class outer{
class inner{
public void show(){
System.out.println("Nested class method");
}
}
}
public class Inner_1{
public static void main(String []args){
outer.inner obj = new outer(). new inner();
obj.show();
}
}
