package CoreJava.Arrays;
import java.util.Scanner;

public class TwoDimensionalArray {
   public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        int[][] ar=new int[4][3];
        System.out.println("enter 2d array values: ");
        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar[i].length;j++){
                System.out.println("enter value of ith row "+i+"of jth column is" +j);
            ar[i][j]=sc.nextInt();
        }
    }
        System.out.println("printing 2d array values: ");
        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar[i].length;j++){
           System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }
    }
    
   } 
}
