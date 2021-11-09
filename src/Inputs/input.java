package Inputs;

import java.util.Scanner;

public class input {
    public int intInput() {
        Scanner input;
        int choice;

        while(true) {
            try {
                System.out.println("Please enter one of the above options...");
                input = new Scanner(System.in);
                choice = input.nextInt();
                break;
            }catch (Exception ex){
                System.out.println("Please enter a valid selection");
            }
        }
        return choice;
    }
}
