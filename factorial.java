import java.util.Scanner;
public class Factorial {
public static void main(String[] args){
 Scanner scan = new Scanner(System.in);
 System.out.println("Enter the number whose factorial is to be found: ");
 int n = scan.nextInt();
 int reslt = fact(n);
       System.out.println("The factorial of " + n + " is " + reslt);
   }
  public static int fact(int n) {
       int reslt = 1;
       for (int i=1;i<=n;i++) {
           reslt = reslt * i;}
       return reslt;
   }}
