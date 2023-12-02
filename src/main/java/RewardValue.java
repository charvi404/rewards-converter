public class RewardValue {
    private double cashValue;
    private int miles;
    public final double MILES_TO_CASH_RATE = 0.0035;

    @Override
    public String toString() {
        return "RewardValue{" +
                "cashValue=" + cashValue +
                ", miles=" + miles +
                '}';
    }

    public RewardValue(int miles) {
        this.miles = miles;
        this.cashValue = miles * MILES_TO_CASH_RATE;

    }
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.miles = (int) (cashValue / MILES_TO_CASH_RATE);
    }

    public double getCashValue() {
        return cashValue;
    }

    public void setCashValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public double getMilesValue() {
        return miles;
    }

    public void setMilesValue(int miles) {
        this.miles = miles;
    }
}
