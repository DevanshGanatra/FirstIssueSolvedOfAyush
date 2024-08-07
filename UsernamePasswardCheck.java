import java.util.Scanner;

public class UsernamePasswardCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String correctUsername = "User_5632";
        String correctPassward = "user.8976#32";
        System.out.print("Enter your username: ");
        String enteredUsername = sc.nextLine();
        System.out.print("Enter your passward: ");
        String enteredPassward = sc.nextLine();
        if (enteredUsername.equals(correctUsername)) {
            if (enteredPassward.equals(correctPassward)) { // for wrong password
                System.out.print("Successfully Login");
            } else {
                System.out.print("Incorrect Passward!");
            }
        } else {
            if (enteredPassward.equals(correctPassward)) { //for correct username and wrong password
                System.out.print("Incorrect Username!");
            } else {
                System.out.print("Incorrect Username and Password!"); // for both wrong
            }
        }
        sc.close(); // releasing scanner which was ocupied
    }
}
