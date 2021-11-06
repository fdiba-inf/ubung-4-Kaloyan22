package exercise4;
import java.util.Scanner;
import java.util.Arrays;

public class ArrayOutput{
  public static void main (String[] args){
    Scanner input=new Scanner(System.in);
    int a=input.nextInt();
    int[] numbers=new int[a];
    for(int i=0;i<a;i++){
      numbers[i]=input.nextInt();
    }
   String space1="";
   for(int i=0;i<a;i++){
      System.out.println(space1+numbers[i]);
      space1+=" ";
    }

  }
}