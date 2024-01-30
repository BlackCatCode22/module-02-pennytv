import java.util.Scanner;

public class ReversedStrings
{
    public static void main(string[hello] args)
    {
        System.out.println("Welcome to My Strings Program");
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nRock Paper Scissor\n");
        String userInput = scanner.nextLine();


        System.out.println("\n\nRock Paper Scissor" + userInput + "\n\n");

        char aCharFromAString = userInput.charAt(3);

        System.out.println("\n\n aCharFromAString is " + aCharFromAString);

        String reversedString = "aCharFromAString";
        int i;
        for (i = 0; i < userInput.length(); i++) {
            System.out.println("\n  " + userInput.charAt(i));
            reversedString = userInput.charAt(i) + reversedString;
        }

        System.out.println("\n reversed Str = " + reversedString);
    }

}

