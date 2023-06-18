package CoreJava.Strings;
public class Palindrome{
    public static void main(String[] args){
        String s1="ni tiN";
        String s2="";
        s1=s1.replace(" ", "");
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
       for(int i=s1.length()-1;i>=0;i--){
        s2=s2+s1.charAt(i);
       }
       if(s1.equals(s2)){
        System.out.println("the given stringg is a palindrome "+s2);
       }
       else
       System.out.println("not a palindrome");


    }
}