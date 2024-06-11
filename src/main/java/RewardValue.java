public class RewardValue {
    private double cashValue;
    private double milesValue;
    private static final double MILES_TO_CASH_RATE = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / MILES_TO_CASH_RATE;
    }

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * MILES_TO_CASH_RATE;
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return milesValue;
    }

    public static void main(String[] args) {
        RewardValue reward1 = new RewardValue(100.0); // cash value constructor
        RewardValue reward2 = new RewardValue(10000); // miles value constructor

        System.out.println("Reward1 (Cash): " + reward1.getCashValue() + " dollars");
        System.out.println("Reward1 (Miles): " + reward1.getMilesValue() + " miles");
        System.out.println("Reward2 (Cash): " + reward2.getCashValue() + " dollars");
        System.out.println("Reward2 (Miles): " + reward2.getMilesValue() + " miles");
    }
}
