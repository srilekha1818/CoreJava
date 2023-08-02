package CoreJava.ExceptionHandling;

import java.util.Scanner;

class UnderAgeException extends Exception {
    public UnderAgeException(String message) {
        super(message);
    }
}

class OverAgeException extends Exception {
    public OverAgeException(String message) {
        super(message);
    }

}

class Applicant {
    int age;

    public void input() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your age");
        age = scan.nextInt();
    }

    // void verify() throws Exception
    void verify() throws UnderAgeException, OverAgeException {
        if (age < 18) {
            UnderAgeException uae = new UnderAgeException("Ohh dude? calm down your time will come");
            System.out.println(uae.getMessage());
            throw uae;
        } else if (age > 60) {
            OverAgeException oae = new OverAgeException(
                    "Dear,your age people are not permitted for driving as per safety guidelines");
            System.out.println(oae.getMessage());
            throw oae;
        }

        else {
            System.out.println("You're eligible");
        }
    }
}

class Rto {
    public void initiate() {
        Applicant a = new Applicant();
        try {
            a.input();
            a.verify();
        } catch (UnderAgeException | OverAgeException e) {
            try {
                a.input();
                a.verify();
            } catch (UnderAgeException | OverAgeException e1) {
                System.out.println("Don't ever try again, read rules");
                System.exit(0);
            }

        }
    }
}

public class LaunchRto {

    public static void main(String[] args) {
        Rto r = new Rto();
        r.initiate();

    }

}
