import java.util.Scanner;
public class UsernamePasswardCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String correctUsername = "abc_123";
        String correctPassward = "abc.z5152";
        System.out.print("Enter your username: ");
        String enteredUsername = sc.nextLine();
        System.out.print("Enter your passward: ");
        String enteredPassward = sc.nextLine();
        if(enteredUsername.equals(correctUsername)){
            if(enteredPassward.equals(correctPassward)){
                System.out.print("Successfully Login");
            }
            else{
                System.out.print("Incorrect Passward!");
            }
        }
        else{
            System.out.print("Incorrect Username or Passward!");
        }
    }
}
