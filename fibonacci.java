import java.util.Scanner;
public class Fibona{  
int n1=0,n2=1,n3=0;    
 public void print(int n){    
    if(n>0){    
         n3 = n1 + n2;    
         n1 = n2;    
         n2 = n3;    
         System.out.print(" "+n3);   
         print(n-1);    
     }}}
 public static void main(String args[]){    
  Scanner scan=new Scanner(System.in);
  System.out.println("Enter the n value");
  int n=scan.nextInt();
  System.out.print(n1+" "+n2);  //printing 0&1  
  print(n-2); //printing othr numbr  
 }  
}  
