import java.util.Scanner;
public class Leap{
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("Enter a  year:");
int year= scan.nextInt();
if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)){
System.out.println("It is a Leap year");}
else
System.out.println("It is Not a Leap year");
}}
