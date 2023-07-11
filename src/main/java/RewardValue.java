public class RewardValue {
    private final double cashValue;
    private final double milesValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / 0.0035;
    }

    public RewardValue(double milesValue, boolean convertToCash) {
        if (convertToCash) {
            this.cashValue = milesValue * 0.0035;
            this.milesValue = milesValue;
        }
        else {
            this.cashValue = 0;
            this.milesValue = milesValue;
        }
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return milesValue;
    }
}