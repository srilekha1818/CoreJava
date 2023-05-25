package Strings;

public class ReverseString {
   public static void main(String[] args){
    String s1="srilekha";
    String s2="";//ahkelirs
   for(int i=s1.length()-1;i>=0;i--){
    s2=s2+s1.charAt(i);

   }
   System.out.println(s1);
   System.out.println(s2);

   String str1="srilekha kavuri";
   String str3="";//iruvak ahkelirs 
   String[] sar=str1.split(" ");
   for(String ele:sar){
  for(int i=ele.length()-1;i>=0;i--){
   str3=str3+ele.charAt(i);
  }

  str3=str3+" ";
}
  System.out.println(str1);
  System.out.println(str3);



  String s4="srilekha kavuri";
  String s5="";//kavuri srilekha
  String[] ar1=s4.split(" ");
 for(int i=ar1.length-1;i>=0;i--){
  s5=s5+ar1[i]+" ";

 }
 System.out.println(s4);
 System.out.println(s5);
   } 
}
