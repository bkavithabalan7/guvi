import java.util.Scanner;
public class PrimeCheck{
public static void main(String args[]){
	int temp;
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter a number for check:");
int num=scan.nextInt();
for(int i=2;i<=num/2;++i){
           if((temp=num%i)==0){
	   System.out.println("The Given string"+num +"is NOT A PRIME");}
	   System.out.println("The Given String "+ num +"is PRIME");
}}}
	
