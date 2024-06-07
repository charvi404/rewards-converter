import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        double milesValue = 10000;
        var rewardValue = new RewardValue(milesValue, true);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        double cashValue = 100.0;
        double expectedMiles = cashValue / 0.0035;

        RewardValue rewardValue = new RewardValue(cashValue);

        assertEquals(expectedMiles, rewardValue.getMilesValue(), 0.0001);
    }

    @Test
    void convert_from_miles_to_cash() {
        double milesValue = 10000.0;
        double expectedCash = milesValue * 0.0035;

        RewardValue rewardValue = new RewardValue(milesValue, true);

        assertEquals(expectedCash, rewardValue.getCashValue(), 0.0001);
    }
}
