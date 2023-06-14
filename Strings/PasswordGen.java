package CoreJava.Strings;
import java.util.Random;

public class PasswordGen {

	public static void main(String[] args) {
		String characters="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*()";
		String randomPassword=" ";
		int length=8;
		Random rand=new Random();
		char[] text=new char[length];
		for(int i=0; i<length; i++) {
			text[i]=characters.charAt(rand.nextInt(characters.length()));
		}
		for(int i=0; i<text.length; i++) {
			randomPassword=randomPassword+text[i];
		}
		
		System.out.println("The Generated Random password: "+randomPassword);
	}

}