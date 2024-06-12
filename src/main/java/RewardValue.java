public class RewardValue {
    private double cashValue;
    private int milesValue;
    protected final static double CONVERSION_RATE = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashToMiles();
    }

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesToCash();
    }

    public double getCashValue() {
        return this.cashValue;
    }

    public int getMilesValue() {
        return this.milesValue;
    }

    protected double milesToCash() {
        return this.milesValue * CONVERSION_RATE;
    }

    protected int cashToMiles() {
        return (int) (this.cashValue / CONVERSION_RATE);
    }
}