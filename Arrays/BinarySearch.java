package CoreJava.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] ar={10,20,30,40,50,60,70};
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter a number to search: ");
            int key=sc.nextInt();
            int low=0;
            int high=ar.length-1;
            while(low<=high){
                int mid=(low+high)/2;
                if(key==ar[mid]){
                    System.out.println("key "+key+"found at index "+mid);
                    break;
                }
                else if(key<ar[mid]){
                    high=mid-1;
                }
                else if(key>ar[mid]){
                    low=mid+1;
                }
                else{
                    System.out.println("key not found");

                }


            }
        }
    }
}