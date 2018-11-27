import com.kodilla.rps.Results;
import com.kodilla.rps.User;
import org.junit.Assert;
import org.junit.Test;

public class RpsTestSuite {

    @Test
    public void testComputerResultPoint0() {
        //Given
        User user = new User();
        Results results = new Results(user);

        //When
        int resultComputer = results.getPointComputer();

        //Then
        Assert.assertEquals(0, resultComputer);
    }

    @Test
    public void testPlayerResultPoint0() {
        //Given
        User user = new User();
        Results results = new Results(user);

        //When
        int resultPlayer = results.getPointUser();

        //Then
        Assert.assertEquals(0, resultPlayer);
    }


}


