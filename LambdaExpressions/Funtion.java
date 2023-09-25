package CoreJava.LambdaExpressions;

import java.util.function.Function;

class MyFunction implements Function<String,Integer>
{
@Override
public Integer apply(String name){
return name.length();

}
}
public class Funtion {
public static void main(String[] args){
Function<String,Integer> f = new MyFunction();
int output = f.apply("sachin");
System.out.println(output);
System.out.println("sachin".length());
}
}
