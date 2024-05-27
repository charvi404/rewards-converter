public class RewardValue {
    private double cash_value;
    private int miles_value;
    private static final double miles_to_cash_rate = 0.0035;
    private static final double cash_to_miles_rate = 1/0.0035;

    public double getCashValue() {
        return cash_value;
    }

    public double getMilesValue() {
        return miles_value;
    }

    public RewardValue(double cash_value) {
        this.cash_value = cash_value;
        this.miles_value = (int) (cash_value * cash_to_miles_rate);
    }

    public RewardValue(int miles_value) {
        this.miles_value = miles_value;
        this.cash_value = miles_value * miles_to_cash_rate;
    }
}
