public class QuickSort {
   static void swap(int[] ar,int i,int j){
    int temp=ar[i];
    ar[i]=ar[j];
    ar[j]=temp;
   }
    static int partition(int[] ar,int lowIndex,int highIndex){
        int pivot=ar[highIndex];
        int i=(lowIndex-1);
        for(int j=lowIndex;j<=highIndex-1;j++){
            if(ar[j]<pivot){
                i++;
                swap(ar,i,j);
            }
        }
        swap(ar,i+1,highIndex);
        return(i+1);
        }
        static void quickSort(int[] ar,int lowIndex,int highIndex){
            if(lowIndex<highIndex){
                int pi=partition(ar, lowIndex, highIndex);
                quickSort(ar, lowIndex,pi-1);
                quickSort(ar, pi+1, highIndex);
            }
        }
        static void printArray(int[] ar,int size){
            for(int i=0;i<size;i++)
            {
                System.out.print(ar[i]+" ");
            }
            System.out.println();

        }

    public static void main(String[]args){
    int [] ar={7,5,9,3,2,1,6};
    int n= ar.length;
    quickSort(ar,0, n-1);    
    System.out.println("Sorted Array: ");
    printArray(ar, n);
    }
}
