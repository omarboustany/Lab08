import java.util.Scanner;

public class Reggie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String menuText = "O) Open\nS) Save\nV) View\nQ) Quit";

        String ssn = DevTest.getRegExString(in, "Input SSN: ", "^\\d{3}-\\d{2}-\\d{4}$");
        String mnumber = DevTest.getRegExString(in, "Enter m-number: ", "^(M|m)\\d{5}$");
        System.out.println(menuText + "\n");
        String menuChoice = DevTest.getRegExString(in, "Enter menu choice: ", "^[OoSsVvQq]$");

        System.out.println("SSN: " + ssn);
        System.out.println("M-number: " + mnumber);
        System.out.println("Menu choice: " + menuChoice);
    }
}