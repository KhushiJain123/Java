
package SYBCA;                 //make folder of sybca and save with imrd
 public class IMRD{
 public void display(){
 System.out.println("Package is created");
 }
}
import SYBCA.*;                  //outside folder but same location and save with BCA
 class BCA{
 public static void main(String args[]){
 IMRD i = new IMRD();
 i.display();
 }
 }