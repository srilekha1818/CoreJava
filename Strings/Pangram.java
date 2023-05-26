package Strings;
public class Pangram{
    public static void main(String[] args){
        boolean s2=false;
        String s1="the quick brown fox jumps over a lazy dog";//a-z
        s1=s1.toUpperCase();
        s1=s1.replace(" ","");
        char[] ch1=s1.toCharArray();
        int[] ar=new int[26];
for(int i=0;i<ch1.length;i++){
    int index=ch1[i]-65;
    ar[index]++;
}
    for(int i=0;i<ar.length;i++){
        if(ar[i]==0){
            System.out.println("It's not a pangram");
            s2=true;
            break;
        }
    }
    
         if(s2==false ){
            System.out.println("It's a pangram"); 
        
    }
}

}
    

     