import org.testng.Assert;
import org.testng.annotations.Test;

public class FindMaxTest {

    @Test
    public void testFindMaxInt_HappyPath(){
        //a=3, b=5;
        Assert.assertEquals(5, new FindMax().findMaxInt(3,5));

        //a=7, b=2
        Assert.assertEquals(7, new FindMax().findMaxInt(7,2));
    }
}
