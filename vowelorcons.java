import java.util.Scanner;
public class Vowel{
public static void main(String[] args){
Scanner read= new Scanner(System.in);
System.out.println("Enter a Alphabet:");
char c = read.nextChar();
if(c=='A'||c=='a'||c=='E'||c=='e'||c=='I'||c=='i'||c=='O'||c=='o'||c=='U'||c=='u'){
System.out.println("VOWEL");}
else
System.out.println("CONSONANT");
}}
