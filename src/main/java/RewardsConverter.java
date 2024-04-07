import java.util.Scanner;
class RewardValue{
    private double cash;
    private double miles;

    public RewardValue(double miles){
        this.miles =miles;
        this.cash =miles*0.0035;
    }
    public RewardValue(double cash){
        this.cash =cash;
        this.miles =cash*0.0035;
    }
    public getMilesValue(){
        return this.miles;
    }
    public getCashValue(){
        return this.cash;
    }
};
public class RewardsConverter {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Welcome to the Credit Card Rewards Converter!");
        System.out.println("Please enter a cash value to convert to airline miles: ");
        var input_value = scanner.nextLine();
        double cashValue;
        try {
            cashValue = Double.parseDouble(input_value);
        } catch (NumberFormatException exception) {
            System.out.println("Could not parse input value as a double, exiting");
            return;
        }
        System.out.println("converting $" + input_value + " to miles");
        var rewardsValue = new RewardValue(cashValue);
        System.out.println("$" + input_value + " is worth " + rewardsValue.getMilesValue() + " miles");
    }
}