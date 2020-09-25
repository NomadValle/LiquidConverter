import javax.swing.*;
import java.util.Scanner;

public class conversion {
    public static void main(String[] args) {
        convert();

    }
    
    
    
    
    /*METHODS*/
    public static void convert(){
        /*Convert measurements*/
        Scanner usersUnits = new Scanner(System.in);
        Scanner usersQty = new Scanner(System.in);
        Scanner menuSelect = new Scanner(System.in);

        System.out.println("Enter the unit you're working with or type 'q' to quit.");
        String startingUnit = usersUnits.next(); //what measurement unit does the user have
        if(startingUnit.equals("q")) {
            System.exit(0);
        } //end if

            System.out.println("Enter the how many " + startingUnit + " you have.");
            double quantity = usersQty.nextDouble(); //what quantity of that unit do they have

            /*MENU*/
            System.out.println("\tMenu");
            System.out.println("1. Cups");
            System.out.println("2. Pints");
            System.out.println("3. Quarts");
            System.out.println("4. Gallons");
            System.out.println("5. Quit");

            int menuItem = menuSelect.nextInt();

            //switch statement to select a menu item
            switch (menuItem) {
                case 1:
                    toCups(startingUnit, quantity);
                    convert();
                    break;
                case 2:
                    toPints(startingUnit, quantity);
                    convert();
                    break;
                case 3:
                    toQuarts(startingUnit, quantity);
                    convert();
                    break;
                case 4:
                    toGallons(startingUnit, quantity);
                    convert();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Invalid entry.");
                    convert();
                    break;
            } //end switch

    }


    // TODO: 9/16/20  toCups()
    public static void toCups(String startingUnit, double quantity){
        switch (startingUnit.toLowerCase()){
            case "pints":
                double pintsToCups = quantity*1.971569;
                System.out.println(quantity+" pints equals "+ pintsToCups+" cups!");
                break;
            case "quarts":
                double pintsToQuarts = quantity*3.943138;
            System.out.println(quantity+" quarts equals "+ pintsToQuarts+" cups!");
            break;
            case "gallons":
                double pintsToGallons = quantity*0.06340149;
                System.out.println(quantity+" gallons equals "+ pintsToGallons + " cups!");
                break;
            case "cups":
                System.out.println("You already have the amount of cups.");
                break;
            default:
                System.out.println("Invalid entry.");
                break;
        }
    }
    
    public static void toPints(String startingUnit, double quantity){
        switch (startingUnit.toLowerCase()){
            case "pints":
                System.out.println("You already have the amount of pints.");
                break;
            case "quarts":
                double quartsToPints = quantity * 2;
                System.out.println(quantity+" quarts equals " + quartsToPints + " pints!");
                break;
            case "gallons":
                double gallonsToPints = quantity * 7.999975;
                System.out.println(quantity+" gallons equals " + gallonsToPints + " pints!");
                break;
            case "cups":
                double cupsToPints = quantity * 0.5072103;
                System.out.println(quantity+" cups equals " + cupsToPints + " pints!");
                break;
            default:
                System.out.println("Invalid entry.");
                break;
        }
    }

    public static void toQuarts(String startingUnit, double quantity){
        switch (startingUnit.toLowerCase()){
            case "pints":
                double pintsToQuarts = quantity * 0.5;
                System.out.println(quantity+" pints equals " + pintsToQuarts + " quarts!");
                break;
            case "quarts":
                System.out.println("You already have the amount of quarts.");
                break;
            case "gallons":
                double gallonsToQuarts = quantity * 3.999987;
                System.out.println(quantity+" gallons equals " + gallonsToQuarts + " quarts!");
                break;
            case "cups":
                double cupsToQuarts = quantity * 0.2536052;
                System.out.println(quantity+" cups equals " + cupsToQuarts + " quarts!");
                break;
            default:
                System.out.println("Invalid entry.");
                break;
        }
    }

    public static void toGallons(String startingUnit, double quantity){
        switch (startingUnit.toLowerCase()){
            case "pints":
                double pintsToGallons = quantity * 0.1250004;
                System.out.println(quantity+" pints equals " + pintsToGallons + " gallons!");
                break;
            case "quarts":
                double quartsToGallons = quantity * 0.2500008;
                System.out.println(quantity+" quarts equals " + quartsToGallons + " gallons!");
                break;
            case "gallons":
                System.out.println("You already have the amount of gallons.");
                break;
            case "cups":
                double cupsToGallons = quantity * 0.06340149;
                System.out.println(quantity+" cups equals " + cupsToGallons + " gallons!");
                break;
            default:
                System.out.println("Invalid entry.");
                break;
        }
    }

}
