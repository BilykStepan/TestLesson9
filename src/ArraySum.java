public class ArraySum {
    public static void sumOfElements(int[] in_Array) {
        int sum = 0;
        for (int i = 0; i < in_Array.length; i++) {
            sum = sum + in_Array[i];
        }
        System.out.println(sum);
    }
    public static int sumOfElementsRecursive(int[] in_Array, int position, int sum) {
        if (position < 1) {
            return sum = sum + in_Array[0];
        } else {
            return sum = in_Array[position] + sumOfElementsRecursive(in_Array,(position - 1),sum);
        }

    }
}
