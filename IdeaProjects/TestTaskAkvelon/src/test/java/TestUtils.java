import org.testng.Assert;
import org.testng.annotations.Test;


public class TestUtils {

    //Test ID = 1
    @Test
    public void FindCommonElements_WithValidArray_ShouldReturnAllCommon() throws Exception {
        int[] actualResult = Utils.findCommonElemments(new int[]{-5, -10, 0, -96, 55}, new int[]{95, -96, 3, 10, 55, 0, 77, 2});
        int[] expectedResult = {0, -96, 55};
        Assert.assertEquals(expectedResult, actualResult);
    }

    //Test ID = 2
    @Test
    public void FindCommonElements_WithoutCommonElements_ShouldReturnEmptyArray() throws Exception {
        int[] actualResult = Utils.findCommonElemments(new int[]{2, 45, 7, 458}, new int[]{444, 25, 5, 10});
        int[] expectedResult = new int[]{};

        Assert.assertEquals(expectedResult, actualResult);
    }

    //Test ID = 3
    @Test
    public void FindCommonElements_WithRepeatedElements_ShouldReturnArrayWithDistinctElements() throws Exception {
        int[] actualResult = Utils.findCommonElemments(new int[]{2, 2, 2, 5, 8, 9, 9}, new int[]{5, 2, 9, 9, 1, 1});
        int[] expectedResult = new int[]{2, 5, 9};

        Assert.assertEquals(expectedResult, actualResult);
    }

    //Test ID = 4
    @Test
    public void FindCommonElements_WithEmptyArray_ShouldReturnEmptyArray() throws Exception {
        int[] actualResult = Utils.findCommonElemments(new int[]{}, new int[]{});
        int[] expectedResult = new int[]{};
        Assert.assertEquals(expectedResult, actualResult);
    }

    //Test ID = 5
    @Test
    public void FindCommonElements_WithNull_ShouldReturnNull() throws Exception {
        int[] actualResult = Utils.findCommonElemments(null, null);
        int[] expectedResult = null;
        Assert.assertEquals(expectedResult, actualResult);


    }

}
