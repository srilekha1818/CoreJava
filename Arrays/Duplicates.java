public class Duplicates {
    public static void main(String[] args){
        int [] ar={7,5,5,3,8,1,8,2,5,8};
        System.out.print("duplicate elements in the array are: ");
        for(int i=0;i<ar.length-1;i++){
            for(int j=i+1;j<ar.length;j++){
                if(ar[i]==ar[j] ){  
                    System.out.print(ar[j]+" ");   
                }

            }
            
        }


    }
}
