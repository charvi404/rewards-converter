import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    private static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new main.java.RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new main.java.RewardValue(milesValue, true);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        double cashValue = 100;
        var rewardValue = new main.java.RewardValue(cashValue);
        double expectedMiles = cashValue / MILES_TO_CASH_CONVERSION_RATE;
        assertEquals(expectedMiles, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_miles_to_cash() {
        double milesValue = 10000;
        var rewardValue = new main.java.RewardValue(milesValue, true);
        double expectedCash = milesValue * MILES_TO_CASH_CONVERSION_RATE;
        assertEquals(expectedCash, rewardValue.getCashValue());
    }
}
