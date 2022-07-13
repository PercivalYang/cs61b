package IntList;

import static org.junit.Assert.*;

import org.junit.Test;

public class IntListTest {
    @Test
    public void TestAddConstant() {
        IntList lst = IntList.of(1, 2, 3);
        int c = 1;
        IntList expected = IntList.of(2, 3, 4);
        IntListExercises.addConstant(lst, c);
        assertEquals(expected.toString(), lst.toString());
    }
}
