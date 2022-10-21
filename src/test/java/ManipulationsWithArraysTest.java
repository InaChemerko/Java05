import org.testng.Assert;
import org.testng.TestRunner;
import org.testng.annotations.Test;
//import project_utils.ManipulationsWithArrays;



public class ManipulationsWithArraysTest {
    /*
   позитивная проверка true
   array != null && array.length != 0 && number != Integer.MAX_VALUE
     */


    @Test
    public void testValidArrayValidNumber_HappyPath() {
        int[] array = {6, 7, 12, 13, 25};
        int number = 5;
        boolean expectedResult = true;

        boolean actualResult = new ManipulationsWithArrays().areValuesGreaterThanNumber(array, number);

        Assert.assertEquals(actualResult, expectedResult);
    }

}
