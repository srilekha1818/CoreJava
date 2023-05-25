package Strings;

import java.util.Scanner;

public class CopyStrings {
    public static void main(String[] args){
    String s1="srilekha";
    String s2="";
    
    for(int i=0;i<s1.length();i++){
        s2=s2+s1.charAt(i);
    }
    System.out.println("first string is: "+s1);
    System.out.println("string copied o s2 is: "+s2);
    String s3="";
    for(int i=0;i<s1.length();i++){
        s3=s3+(char)(s1.charAt(i)-32);
    }
    System.out.println("to uppercase string copied: "+s3);
    System.out.println("Please enter a string: ");
    Scanner sc=new Scanner(System.in);
    String name=sc.nextLine();
   String nameL="";
   for(int i=0;i<name.length();i++){
    nameL=nameL+(char)(name.charAt(i)+32);
}
System.out.println("to lowerCase string copied: "+nameL);


String s11="SriLekhA";
    String s21="";
    for(int i=0;i<s11.length();i++){
        if(s11.charAt(i)>='a' && s11.charAt(i)<='z')
        s21=s21+(char)(s11.charAt(i)-32);
        else 
        s21=s21+(char)(s11.charAt(i)+32);

    }
    System.out.println(s11);
    System.out.println(s21);

}
}
