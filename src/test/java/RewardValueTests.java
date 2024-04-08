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
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        double cashValue = 100; //example cash value
        var rewardValue = new RewardValue(cashValue);
        double expectedMiles = cashValue / 0.0035; //expected conversion based on the rate
        assertEquals(expectedMiles, rewardValue.getMilesValue(), "Cash to miles conversion did not match expected value.");
    }

    @Test
    void convert_from_miles_to_cash() {
        double milesValue = 10000; //example miles
        //assuming the RewardValue constructor can take miles and a boolean flag to differentiate
        var rewardValue = new RewardValue(milesValue, true);
        double expectedCash = milesValue * 0.0035; //expected conversion based on the rate
        assertEquals(expectedCash, rewardValue.getCashValue(), "Miles to cash conversion did not match expected value.");
    }
}
