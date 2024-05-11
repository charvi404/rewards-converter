public class RewardValue {
    private double cashValue;
    private int milesValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = (int) (cashValue / 0.0035);
    }

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * 0.0035;
    }

    public double getCashValue() {
        return this.cashValue;
    }

    public int getMilesValue() {
        return this.milesValue;
    }

}

// This class must satisfy the following requirements:
// RewardValue must have two constructors: one that accepts a cash value and one
// that accepts a value in miles.
// RewardValue must have a getCashValue() method, which returns the cash value
// of the RewardValue.
// RewardValue must have a getMilesValue() method, which returns how many miles
// the RewardValue is worth.
// RewardValue must convert from miles to cash at a rate of 0.0035.