import com.kodilla.rps.Computer;
import com.kodilla.rps.User;
import org.junit.Assert;
import org.junit.Test;

public class RpsTestSuite {

    @Test
    public void testComputerResultPoint0() {
        //Given
        Computer computer = new Computer();

        //When
        int resultComputer = computer.getPoints();

        //Then
        Assert.assertEquals(0, resultComputer);
    }

    @Test
    public void testPlayerResultPoint0() {
        //Given
        User user = new User();

        //When
        int resultPlayer = user.getPoints();

        //Then
        Assert.assertEquals(0, resultPlayer);
    }


}


