import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int[] ar={10,20,30,40,50,60};
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter a number to search: ");
            int key=sc.nextInt();
            boolean flag=false;
        
        for(int i=0;i<ar.length;i++){
            if(ar[i]==key){
                System.out.println("key "+ key+" found at index "+i);
                 flag=true;
                break;

            }
        }
        if(flag==false){
            System.out.println("key not found");
        }

    }






        
    }
    
}
