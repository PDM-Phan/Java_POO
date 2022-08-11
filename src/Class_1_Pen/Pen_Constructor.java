package Class_1_Pen;
import java.util.Scanner;

// Class responsable to create a pen...
public class Pen_Constructor {
    //Method to create the pen...
    public static Pen build_Pen(Pen p, int type) {
        Scanner input = new Scanner(System.in);
        switch (type) {
            case 1 -> {
                // collecting the data to create the pen...
                System.out.println("What is the color of your pen?(String)");
                String color = input.nextLine();
                p.setColor(color);
                
                System.out.println("What is the model of your pen?(String)");
                String model = input.nextLine();
                p.setModel(model);
                
                // Loops to handle the error, without interfering with the loop...
                while (true) {
                    
                    System.out.println("What is your pen tip?(Double)");
                    String str_tip = input.nextLine();
                    try {
                        double tip = Double.parseDouble(str_tip);
                        if (tip <= 0) {
                            System.out.println("[ERROR]Please give only right data.\nTry again.\n");
                            continue;
                        }
                        p.setTip(tip);
                        break;
                    } catch (NumberFormatException ex) {
                        System.out.println("[ERROR]Please give only right data.\nTry again.\n");
                    }
                }
                
                while (true) {

                    System.out.println("How much ink is left in your pen?(Int)");
                    String str_ink = input.nextLine();
                    try {
                        int ink = Integer.parseInt(str_ink);
                        if (ink < 0 || ink > 100) {
                            System.out.println("Thats impossible.\nTry again.\n");
                            continue;
                        }
                        p.setInk(ink);
                        break;
                    } catch (NumberFormatException ex) {
                        System.out.println("[ERROR]Please give only right data.\nTry again.\n");
                    }
                }

                while (true) {

                    System.out.println("Is your pen capped 0-Yes/1-No?(Int)");
                    String str_capped = input.nextLine();
                    try {
                        int capped = Integer.parseInt(str_capped);
                        if (capped >= 0 && capped <= 1) {
                            if (capped == 1){
                                p.setCapped(false);
                            } else {
                                p.setCapped(true);
                            }
                        } else {
                            System.out.println("[ERROR]Please type a valid option.\nTry again.\n");
                            continue;
                        }
                        break;
                    } catch (NumberFormatException ex) {
                        System.out.println("[ERROR]Please give only right data.\nTry again.\n");
                    }
                }
            }
            
            case 2 -> {
                System.out.println("What is the model of your pen?(String)");
                String model = input.nextLine();
                p.setModel(model);
                
                while (true) {
                    
                    System.out.println("What is your pen tip?(Double)");
                    String str_tip = input.nextLine();
                    try {
                        double tip = Double.parseDouble(str_tip);
                        if (tip <= 0) {
                            System.out.println("[ERROR]Please give only right data.\nTry again.\n");
                            continue;
                        }
                        p.setTip(tip);
                        break;
                    } catch (NumberFormatException ex) {
                        System.out.println("[ERROR]Please give only right data.\nTry again.\n");
                    }
                }
                
                while (true) {

                System.out.println("How much ink is left in your pen?(Int)");
                String str_ink = input.nextLine();
                try {
                    int ink = Integer.parseInt(str_ink);
                    if (ink < 0 || ink > 100) {
                        System.out.println("Thats impossible.\nTry again.\n");
                        continue;
                    }
                    p.setInk(ink);
                    break;
                } catch (NumberFormatException ex) {
                    System.out.println("[ERROR]Please give only right data.\nTry again.\n");
                }
            }   
        }
    }
        return p;
    }
}