package IntList;

import static org.junit.Assert.*;

import org.junit.Test;

import javax.swing.text.StyledEditorKit;

public class SquarePrimesTest {

    /**
     * Here is a test for isPrime method. Try running it.
     * It passes, but the starter code implementation of isPrime
     * is broken. Write your own JUnit Test to try to uncover the bug!
     */
    @Test
    public void testSquarePrimesSimple() {
        IntList lst = IntList.of(14, 15, 16, 17, 18);
        IntList lst2 = IntList.of(2, 3, 5, 6, 7, 9);
        boolean changed = IntListExercises.squarePrimes(lst);
        boolean changed2 = IntListExercises.squarePrimes(lst2);
        assertEquals("14 -> 15 -> 16 -> 289 -> 18", lst.toString());
        assertEquals("4 -> 9 -> 25 -> 6 -> 49 -> 9", lst2.toString());
        assertTrue(changed);
        assertTrue(changed2);
    }
}
