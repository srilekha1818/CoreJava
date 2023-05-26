package Arrays;
public class BubbleSort{
    public static void main(String[] args){
        int [] ar={7,5,3,8,1,2,8};
        int temp;
        for(int i=0;i<ar.length;i++){
            for(int j=1;j<ar.length-i;j++){
                if(ar[j-1]>ar[j]){
                    temp=ar[j];
                    ar[j]=ar[j-1];
                    ar[j-1]=temp;

                }

            }
        }
        System.out.print("sorted array: ");
        for(int ele:ar){
            System.out.print(ele+" ");
        }

    }
}