package Class_1_Pen;
import java.util.Scanner;

public class Curso_em_VideoJAVA_POO {

    public static void main(String[] args) {
        // variable used to future actions...
        int option;
        Scanner input = new Scanner(System.in);
        // loop to make sure the option is valid...
        while (true) {
            
            System.out.println("""
                               Which pen would you like to pick?
                               1 - Customizable pen;
                               2 - Semi-Customizable pen;
                               3 - Default pen;
                               """);

            String str_option = input.nextLine();
            try {
                option = Integer.parseInt(str_option);
                if (option >= 1 && option <= 3) {
                    break;
                } else {
                    System.out.println("[ERROR]Theres no option for this.\nTry again.\n");
                }
            } catch (NumberFormatException ex) {
                System.out.println("[ERROR]Please type a valid number.\n");
            }
        }
        
        System.out.format("Your option was... %d.\n", option);
        // Default pen in case the user do not want to create or add new things...
        Pen p1 = new Pen();
        // Building the pen...
        switch (option) {
            // Class which will build the pen...
            case 1 -> {
                // Pen fully made by the user...
                Pen_Constructor.build_Pen(p1, option);
            }
            
            case 2 -> {
                // Pen almost fully made by the user...
                Pen_Constructor.build_Pen(p1, option);
            }
        }
        // Showing the created pen...
        p1.status();
    }
}