public class RewardValue {
    private double cashValue;
    private double milesValue;
    private static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;

    // Constructor that accepts a cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / MILES_TO_CASH_CONVERSION_RATE;
    }

    // Constructor that accepts a miles value
    public RewardValue(double milesValue, boolean isMiles) {
        if (isMiles) {
            this.milesValue = milesValue;
            this.cashValue = milesValue * MILES_TO_CASH_CONVERSION_RATE;
        } else {
            throw new IllegalArgumentException("Boolean parameter must indicate miles.");
        }
    }

    // Method to get the cash value
    public double getCashValue() {
        return cashValue;
    }

    // Method to get the miles value
    public double getMilesValue() {
        return milesValue;
    }

    public static void main(String[] args) {
        // Example usage:
        RewardValue rewardFromCash = new RewardValue(100);
        System.out.println("Cash Value: " + rewardFromCash.getCashValue());
        System.out.println("Miles Value: " + rewardFromCash.getMilesValue());

        RewardValue rewardFromMiles = new RewardValue(50000, true);
        System.out.println("Cash Value: " + rewardFromMiles.getCashValue());
        System.out.println("Miles Value: " + rewardFromMiles.getMilesValue());
    }
}
