import java.util.Scanner;
public class Largof3num{
public static void main(String args[]){
int x, y, z;
System.out.println("Enter three integers: ");
 Scanner in = new Scanner(System.in);
x = in.nextInt();
y = in.nextInt();
z = in.nextInt();
 if(x>y && x>z)
     System.out.println(x +" is the largest number.");
 else if(y>x && y>z)
    System.out.println(y +" is the largest number.");
 else if (z>x && z>y)
   System.out.println(z +" is the largest number.");
 else   
   System.out.println("Entered numbers are not distinct.");
   }}
