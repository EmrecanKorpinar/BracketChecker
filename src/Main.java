import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a String: ");
            String input = klavye.nextLine();
            if (input.isEmpty()) {
                break;
            }
            BracketChecker kontrol = new BracketChecker(input);
            boolean isBalanced = kontrol.check();
            if (isBalanced) {
                System.out.println("The brackets are balanced..");
            } else {
                System.out.println("The brackets are bot balanced.");
            }
        }
    }}




