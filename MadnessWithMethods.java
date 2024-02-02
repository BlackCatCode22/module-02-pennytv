import java.util.Scanner;
public class MadnessWithMethods
{public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    var num1 = getAnIntFromTheUser(scanner);
    int num2 = getAnIntFromTheUser(scanner);

    int sum = sumTwoInt(num1, num2);
    int comparison = Integer.parseInt(CompareTwoInt(num1, num2));

    System.out.println(num1 + " is " + comparison + " than " + num2);
}
// Method to sum two integers
    private static int sumTwoInt(int num1, int num2)
    {return num1 + num2;
    }
    //Method to get an integer from the user
    private static int getAnIntFromTheUser(Scanner scanner)
    {System.out.print("Please enter an integer: ");
        return scanner.nextInt();
    }
    //Method to compare two integers
    private static String CompareTwoInt(int num1, int num2)
    {if (num1 > num2) {
        return "greater than";
    }else if (num1 < num2) {
        return "less than";
    }else {
        return "equal to";
    }
    }
}

