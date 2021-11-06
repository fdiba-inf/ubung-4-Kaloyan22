package exercise4;
import java.util.Scanner;
import java.util.Arrays;


public class MaxElement{

public static void main (String[] args){
  
    Scanner input=new Scanner(System.in);
    int a = input.nextInt();
    float[] Array1 =  new float[a];
    for(int k=0;k<a;k++){
      Array1[k] = input.nextFloat();
    }
   double maxNumber=Array1[0];
      for (int index = 1; index < a; index++) {
          if(Array1[index]>maxNumber)
          {
            maxNumber=Array1[index];
          }
        
    }
    System.out.println("Max number: " + maxNumber);

  }
}