import java.util.Arrays;

public class ArrayClass {
    public static void main(String[] args){
        int[] ar=new int[5];
        Arrays.fill(ar, 5);

        for(int ele:ar){
            System.out.print(ele +" ");
        }
        System.out.println();
        Arrays.fill(ar, 2, 5,55);
        for(int ele:ar){
            System.out.print(ele +" ");
        }
        System.out.println();
        int res=Arrays.binarySearch(ar,57);
        System.out.println(res);
              } 
              }  

    

