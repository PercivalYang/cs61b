import javax.swing.text.StyleContext;

public class Sort {
    /**
     * Sorts strings destructively.
     */
    public static void sort(String[] x) {
        sort(x, 0);
    }

    private static void sort(String[] x, int start){
        if (start == x.length){
            return;
        }
        int smallestIndex = FindSmallest(x, start);
        Swap(x, smallestIndex, start);
        sort(x, start+1);
    }

    public static int FindSmallest(String[] input, int start) {
        int smallIndex = start;
        for (int i = start; i < input.length; i += 1) {
            int cmp = input[smallIndex].compareTo(input[i]);
            if (cmp > 0) {
                smallIndex = i;
            }
        }
        return smallIndex;
    }

    public static void Swap(String[] input, int a, int b) {
        String tmp = input[a];
        input[a] = input[b];
        input[b] = tmp;
    }
}