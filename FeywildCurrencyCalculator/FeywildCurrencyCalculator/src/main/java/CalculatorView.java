import java.util.Scanner;

public class CalculatorView {
    private boolean exit = false;
    private String recentInput = "";
    Scanner scanner = new Scanner(System.in);

    public void runMainMenu(){
        while (!exit){
            displayMainMenuOptions();
            getUserInput();
            runCommands();
        }
        System.out.println("Goodbye");
    }

    private void runCurrencyConversionMenu(){
        while (!exit){
            displayCurrencyConversionMenuOptions();
            getUserInput();
            runCommands();
        }
        exit = false;
    }

    private void runGoldToFeywildCurrencyMenu(){
        while (!exit){
            displayGoldToFeywildCurrency();
            getUserInput();
            runCommands();
        }
        exit = false;
    }

    private void runFeyNumberMathMenu(){
        while (!exit){
            displayFeyNumberMathMenuOptions();
            getUserInput();
            runCommands();
        }
        exit = false;
    }

    private void displayMainMenuOptions(){
        System.out.println("Select an option");
        System.out.println("1 - Currency Conversion");
        System.out.println("2 - Fey Currency Math");
        System.out.println("0 - Exit");
    }

    private void displayCurrencyConversionMenuOptions(){
        System.out.println("Select an option");
        System.out.println("1A - Gold to Feywild Currency");
        System.out.println("1B - Feywild Currency to Gold");
        System.out.println("0 - Exit");
    }

    private void displayGoldToFeywildCurrency(){
        System.out.println("Select an option");
        System.out.println("1AA - True Value Gold to Feywild Currency Conversion");
        System.out.println("1BA - Exchanged Gold to Feywild Currency Conversion");
        System.out.println("0 - Exit");
    }

    private void displayFeyNumberMathMenuOptions(){
        System.out.println("Select an option");
        System.out.println("2A - Addition");
        System.out.println("2B - Subtraction");
        System.out.println("2C - Multiplication");
        System.out.println("2D - Division");
        System.out.println("0 - Exit");
    }

    private void getUserInput(){
        recentInput = scanner.nextLine();
        if(recentInput.isBlank()){
            recentInput = scanner.nextLine();
        }
    }

    private void runCommands(){
        switch (recentInput){
            case "0":
                exit = true;
                break;
            case "1":
                runCurrencyConversionMenu();
                break;
            case "1A":
                runGoldToFeywildCurrencyMenu();
                break;
            case "1AA":
                System.out.println("True Value Gold to Feywild Currency Conversion");
                int gold = getUserNumber();
                System.out.println(FeywildConversionCalculator.trueGoldToFeyCurrency(gold));
                break;
            case "1AB":
                break;
            case "1B":
                break;
            case "2":
                runFeyNumberMathMenu();
                break;
            case "2A":
                break;
            case "2B":
                break;
            case "2C":
                break;
            case "2D":
                break;
            default:
                System.out.println("Command not recognized, try again");
                getUserInput();
                runCommands();
        }
    }

    public int getUserNumber(){
        System.out.println("Insert Number");
        return scanner.nextInt();
    }

//    public double getUserFeyBalance(){
//        System.out.println("Insert Fey Amount - (111 for 1 dream shard 1 pixie dust 1 milk teeth)");
//        return scanner.nextDouble();
//    }

    public FeyCurrencyBalance getUserFeyBalance(){
        System.out.print("Input Dream Shard Amount: ");
        int dreamShards = scanner.nextInt();
        System.out.print("Input Pixie Dust Amount: ");
        int pixieDust = scanner.nextInt();
        System.out.print("Input Milk Teeth Amount: ");
        double milkTeeth = scanner.nextDouble();

        return new FeyCurrencyBalance(dreamShards,pixieDust,milkTeeth);
    }

    public void displayFeyCurrencyBalance(FeyCurrencyBalance feyCurrencyBalance){
        System.out.println("Dream Shards: " + feyCurrencyBalance.getDreamShards());
        System.out.println("Pixie Dust: " + feyCurrencyBalance.getPixieDust());
        System.out.println("Milk Teeth: " + feyCurrencyBalance.getMilkTeeth());
        System.out.println();
    }

}