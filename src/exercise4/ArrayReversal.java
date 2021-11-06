package exercise4;
import java.util.Scanner;
import java.util.Arrays;


public class ArrayReversal{

public static void main (String[] args){
  
    Scanner input=new Scanner(System.in);
    int a = input.nextInt();
    char[] Array1 =  new char[a];
    for(int i=0;i<a;i++){
      Array1[i] = input.next().charAt(0);
    }
    System.out.print("Reversed symbols: [");
    for(int i=Array1.length-1; i>=0; i--)
        {
        System.out.print(Array1[i]);
        if(i!=0)
        {
           System.out.print(", ");
        }
        }

        System.out.println("]");

  }
}