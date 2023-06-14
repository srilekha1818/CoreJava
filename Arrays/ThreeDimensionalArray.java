package CoreJava.Arrays;
import java.util.Scanner;

public class ThreeDimensionalArray {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int[][][] ar=new int[2][3][3];
            System.out.println("enter 3d array values: ");
            for(int i=0;i<ar.length;i++){
                for(int j=0;j<ar[i].length;j++){
                    for(int k=0;k < ar[i][j].length;k++){
                    System.out.println("enter value of ith row "+i+" of jth column is" +j+ "and k column "+k);
                ar[i][j][k]=sc.nextInt();
            }
        }
        }
            System.out.println("printing 3d array values: ");
            for(int i=0;i<ar.length;i++){
                for(int j=0;j<ar[i].length;j++){
                    for(int k=0;k<ar[i][j].length;k++){
               System.out.print(ar[i][j][k]+" ");
                    }
                    System.out.println();
                }
                
            }
        }
        
    }
}
