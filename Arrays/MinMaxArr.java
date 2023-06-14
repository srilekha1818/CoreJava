package CoreJava.Arrays;
public class MinMaxArr {
    public static void main(String[] args) 
    {
        int[] ar={10,20,30,40};
        int max=ar[0];
        int min=ar[0];

        for(int i=0;i<ar.length;i++){
           if(ar[i]>max){
            max=ar[i];
           }
       
    }
    System.out.println("maxium element of array is: "+max);
    for(int i=0;i<ar.length;i++){
        if(ar[i]<min){
         min=ar[i];
        }
    
 }
 System.out.println("minimum element of array is: "+min);


}


}
