
import java.util.LinkedHashSet;
import java.util.Set;


public class Utils {

    public static int[] findCommonElemments(int[] array1, int[] array2) {
        Set<Integer> commonIntsHashSet = new LinkedHashSet<>();
        int[] commonInts;
        if (array1 != null && array2 != null) {
            for (int elementOfArray1 = 0; elementOfArray1 < array1.length; elementOfArray1++) {
                for (int elementOfArray2 = 0; elementOfArray2 < array2.length; elementOfArray2++) {

                    if (array1[elementOfArray1] == array2[elementOfArray2]) {
                        commonIntsHashSet.add(array1[elementOfArray1]);
                    }

                }
            }
            commonInts = commonIntsHashSet.stream().mapToInt(a -> a).toArray();
        }else {
            commonInts = null;
        }

        return commonInts;
    }
}


