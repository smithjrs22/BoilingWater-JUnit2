import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;
@DisplayName("Testing if Water Boils")
class BoilingWaterTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }
    @DisplayName("Check Method to see if Water boils")
    @org.junit.jupiter.api.Test
    void mainSeeIfWaterBoils() {
        int num =210;
        assertEquals("Water is not boiling", BoilingWater.isWaterBoiling(num));
        assertEquals("Water is boiling!", BoilingWater.isWaterBoiling(214));
        assertEquals("Water is not yet boiling", BoilingWater.isWaterBoiling(212));
    }
}