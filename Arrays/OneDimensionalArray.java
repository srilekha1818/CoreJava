import java.util.Scanner;

public class OneDimensionalArray{
    public static void main(String [] args){
        try (Scanner sc = new Scanner(System.in)) {
            int[] ar=new int[4];
            System.out.println("enter 1d array values: ");
            for(int i=0;i<ar.length;i++){
                ar[i]=sc.nextInt();
            }
            System.out.println("printing 1d array values: ");
            for(int i=0;i<ar.length;i++){
               System.out.println(ar[i]+" ");
            }
        }

    }
}