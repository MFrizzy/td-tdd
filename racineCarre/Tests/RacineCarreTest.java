import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class RacineCarreTest {
    @Test
    public void testNegative() {
        try {
            RacineCarre.tableauRacine(-1, -1);
            assertTrue("Noooooooon, les nombres négatifs Tanguy !", false);
        } catch (Error e) {
            assertTrue("Cool, t'as géré les nombres négatifs c:", true);
        }

    }

    @Test
    public void testInferieur() {
        try {
            RacineCarre.tableauRacine(-1, -1);
            assertTrue(":'(", false);
        } catch (Error e) {
            assertTrue("C'est bien :)", true);
        }
    }

    @Test
    public void testSingleValue() {
        try {
            assertEquals(RacineCarre.tableauRacine(4, 4).length, 1);
        } catch (Exception e) {

        }
    }

    @Test
    public void testValue() {
        try {
            assertEquals(RacineCarre.tableauRacine(4, 5)[0], 2);
        } catch (Exception e) {

        }
    }
}
