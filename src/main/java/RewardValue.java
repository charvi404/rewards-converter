public class RewardValue {

    private final double cashValue;
    private static final double  MILES_CONVERSION_RATE = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
        this.cashValue = convertToCash(milesValue);
    }

    private static double convertToCash(int milesValue) {
        return milesValue*MILES_CONVERSION_RATE;
    }

    private static int convertToMiles(double cashValue) {
        return (int) (cashValue / MILES_CONVERSION_RATE);
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return convertToMiles(this.cashValue);
    }
}
