public class TestSort {
    public static void testSort(){
        String[] input = {"i", "have", "an", "egg"};
        String[] expected = {"an", "egg", "have", "i"};
        Sort.sort(input);
        org.junit.Assert.assertArrayEquals(expected, input);
    }

    public static void testFindSmallest(){
        String[] input = {"i", "have", "an", "egg"};
        String expected = "an";
        int sml = Sort.FindSmallest(input, 0);
        org.junit.Assert.assertEquals(input[sml], expected);
    }

    public static void testSwap() {
        String[] input = {"i", "have", "an", "egg"};
        int a = 0;
        int b = 2;
        String[] expected = {"an", "have", "i", "egg"};
        Sort.Swap(input, a, b);
        org.junit.Assert.assertArrayEquals(expected, expected);
    }
    public static void main(String[] args){
        testSort();
    }
}
