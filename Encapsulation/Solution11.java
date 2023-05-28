package Encapsulation;
class Solution2 {
    private int num;
    private String name;

   

    public Solution2(String name, int num) {
        this();//this method
        this.name = name;
        this.num = num;

    }
    public Solution2() {
        this("sri");
        num=14;
       
  
      }
    public Solution2(String name){
        this.name=name;
    }

    public int getNum() {
        return num;
    }

    public String getName() {
        return name;
    }

}

public class Solution11 {
    public static void main(String[] args) {
        Solution2 s11 = new Solution2();
        System.out.println(s11.getName());
        System.out.println(s11.getNum());
        Solution2 s21 = new Solution2("hyder", 10);
        System.out.println(s21.getName());
        System.out.println(s21.getNum());
    }
}
