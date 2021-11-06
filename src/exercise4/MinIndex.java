package exercise4;
import java.util.Scanner;
import java.util.Arrays;


public class MinIndex{

public static void main (String[] args){
    Scanner input= new Scanner(System.in);
     System.out.print("Enter size: ");
        int a=input.nextInt();
        double[] Array1 = new double[a];

        System.out.println("Enter numbers: ");
        for (int i = 0; i < Array1.length; i++) {
            Array1[i] = input.nextDouble();
        }
        int minIndex=0;
        for (int i = 1; i < Array1.length; i++) {
          if(Array1[i]<Array1[minIndex])
          {
            minIndex=i;
          }
        }
        System.out.println("Min index: "+ minIndex);

  }
}