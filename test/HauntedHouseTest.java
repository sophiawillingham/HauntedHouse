
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HauntedHouseTest {

    HauntedHouse house;

    @BeforeEach
    public void setUp() {
        house = new HauntedHouse();
    }

    @Test
    public void testGhostPresence() {
        assertTrue(house.isGhostPresent());
    }

    @Test
    public void testScareGhost() {
        house.scareAwayGhost();
        assertFalse(house.isGhostPresent());
    }

    @Test
    public void testRefillCandyBowl() {
        house.refillCandyBowl(5);
        assertEquals(15, house.getCandyCount());
    }

    @Test
    public void testSpookySound() {
        assertEquals("Boo!", house.spookySound());
    }

    @Test
    public void testNegativeCandy() {
        house.refillCandyBowl(-5);
        assertEquals(10, house.getCandyCount());
    }

    @Test
    public void testTrickOrTreat() {
        house.trickOrTreat(3);
        assertEquals(7, house.getCandyCount());
    }

    @Test
    public void testTooManyPeople() {
        house.trickOrTreat(15);
        assertEquals(0, house.getCandyCount());
    }


    @Test
    public void testRunningLow() {
        house.trickOrTreat(10);
        house.runningLow();
        assertEquals(10, house.getCandyCount());
    }

    @Test
    public void testHaunting() {
        house.scareAwayGhost();
        house.haunting();
        assertTrue(house.isGhostPresent());
    }

}


