import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter yes or no: ");

        String choice = scan.nextLine();
        while (choice.equalsIgnoreCase("yes")) {//chained methods
            System.out.println("You have entered yes!");
            System.out.println("Do you want to continue? Yes or no? ");//checks the conditional to avoid the infinite loop
            choice = scan.nextLine();
        }
    }
}
