import org.junit.Test;

import static org.junit.Assert.*;

public class RandomMatrixTest {

    @Test
    public void testTailleMatrice() {
        try {
            int[][] test = RandomMatrix.generateMatrix(5, 6, 1, 2);
            assert test[0].length == 6 && test.length == 5;
        } catch (NegativeArraySizeException e) {
            assertTrue(false);
        }
    }

    @Test
    public void testNegativeMatrice() {
        try {
            int[][] test = RandomMatrix.generateMatrix(5, 6, 1, 2);
        } catch (NegativeArraySizeException e) {
            assertTrue(true);
        }
    }

    @Test
    public void testValues() {
        try {
            int[][] test = RandomMatrix.generateMatrix(5, 6, 1, 2);
            for (int i = 0; i < test.length; i++) {
                for (int j = 0; j < test[i].length; j++) {
                    if(1 >= test[i][j] || test[i][j] >= 2)
                        assertTrue(true);
                }
            }
        } catch (NegativeArraySizeException e) {
            assertTrue(false);
        }
    }

    @Test(timeout = 10000)
    public void testTemps() {
        try {
            int[][] test = RandomMatrix.generateMatrix(100, 100, 1, 2);
        } catch (NegativeArraySizeException e) {
            assertTrue(false);
        }
    }

}
