import java.util.Scanner;

public class BirthMonth
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int birthMonth;
        String invalidInput;

        System.out.println("Please enter your birth month as a number from 1 to 12: ");
        if (in.hasNextInt()) {
            birthMonth = in.nextInt();
            if (birthMonth >= 1 && birthMonth <= 12) {
                System.out.println("You entered your birth month as " + birthMonth);
            } else {
                System.out.println("You entered an invalid birth month. You entered " + birthMonth);
            }
        } else {
            invalidInput = in.nextLine();
            System.out.println("You have made an invalid entry, you entered " + invalidInput);
        }
    }
}