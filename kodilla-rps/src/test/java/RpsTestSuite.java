import com.kodilla.rps.Computer;
import com.kodilla.rps.User;
import com.kodilla.rps.WinChecker;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class RpsTestSuite {

    @BeforeClass
    public static void startTests() {
        System.out.println("Tests starting ... ");
    }

    @AfterClass
    public static void finishedTests() {
        System.out.println("Tests finished");
    }

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
    public void testComputerResultPoint1() {
        //Given
        Computer computer = new Computer();
        computer.addPointToComputer();
        //When
        int resultComputer = computer.getPoints();
        //Then
        Assert.assertEquals(1, resultComputer);
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

    @Test
    public void testPlayerResultPoint1() {
        //Given
        User user = new User();
        user.addPointToUser();
        //When
        int resultPlayer = user.getPoints();
        //Then
        Assert.assertEquals(1, resultPlayer);
    }

    @Test
    public void testUserResultPoint1() {
        //Given
        Computer computer = new Computer();
        computer.addPointToComputer();
        //When
        int resultComputer = computer.getPoints();
        //Then
        Assert.assertEquals(1, resultComputer);
    }

    @Test
    public void testPlayerMoveRockAndComputerMoveRock() {
        //Given
        WinChecker winChecker = new WinChecker();
        String moveUser = "1";
        String moveComputer = "1";
        //When
        int resultWhoWin = winChecker.checkWhoIsWin(moveUser, moveComputer);
        //Then
        Assert.assertEquals(0, resultWhoWin);
    }

    @Test
    public void testPlayerMoveRockAndComputerMovePaper() {
        //Given
        WinChecker winChecker = new WinChecker();
        String moveUser = "1";
        String moveComputer = "2";
        //When
        int resultWhoWin = winChecker.checkWhoIsWin(moveUser, moveComputer);
        //Then
        Assert.assertEquals(2, resultWhoWin);
    }

    @Test
    public void testPlayerMoveRockAndComputerMoveScissors() {
        //Given
        WinChecker winChecker = new WinChecker();
        String moveUser = "1";
        String moveComputer = "3";
        //When
        int resultWhoWin = winChecker.checkWhoIsWin(moveUser, moveComputer);
        //Then
        Assert.assertEquals(1, resultWhoWin);
    }

    @Test
    public void testPlayerMoveRockAndComputerMoveLizard() {
        //Given
        WinChecker winChecker = new WinChecker();
        String moveUser = "1";
        String moveComputer = "4";
        //When
        int resultWhoWin = winChecker.checkWhoIsWin(moveUser, moveComputer);
        //Then
        Assert.assertEquals(1, resultWhoWin);
    }

    @Test
    public void testPlayerMoveRockAndComputerMoveSpock() {
        //Given
        WinChecker winChecker = new WinChecker();
        String moveUser = "1";
        String moveComputer = "5";
        //When
        int resultWhoWin = winChecker.checkWhoIsWin(moveUser, moveComputer);
        //Then
        Assert.assertEquals(2, resultWhoWin);
    }

    @Test
    public void testPlayerMovePaperAndComputerMoveRock() {
        //Given
        WinChecker winChecker = new WinChecker();
        String moveUser = "2";
        String moveComputer = "1";
        //When
        int resultWhoWin = winChecker.checkWhoIsWin(moveUser, moveComputer);
        //Then
        Assert.assertEquals(1, resultWhoWin);
    }

    @Test
    public void testPlayerMovePaperAndComputerMovePaper() {
        //Given
        WinChecker winChecker = new WinChecker();
        String moveUser = "2";
        String moveComputer = "2";
        //When
        int resultWhoWin = winChecker.checkWhoIsWin(moveUser, moveComputer);
        //Then
        Assert.assertEquals(0, resultWhoWin);
    }

    @Test
    public void testPlayerMovePaperAndComputerMoveScissors() {
        //Given
        WinChecker winChecker = new WinChecker();
        String moveUser = "2";
        String moveComputer = "3";
        //When
        int resultWhoWin = winChecker.checkWhoIsWin(moveUser, moveComputer);
        //Then
        Assert.assertEquals(2, resultWhoWin);
    }

    @Test
    public void testPlayerMovePaperAndComputerMoveLizard() {
        //Given
        WinChecker winChecker = new WinChecker();
        String moveUser = "2";
        String moveComputer = "4";
        //When
        int resultWhoWin = winChecker.checkWhoIsWin(moveUser, moveComputer);
        //Then
        Assert.assertEquals(2, resultWhoWin);
    }

    @Test
    public void testPlayerMovePaperAndComputerMoveSpock() {
        //Given
        WinChecker winChecker = new WinChecker();
        String moveUser = "2";
        String moveComputer = "5";
        //When
        int resultWhoWin = winChecker.checkWhoIsWin(moveUser, moveComputer);
        //Then
        Assert.assertEquals(1, resultWhoWin);
    }

    @Test
    public void testPlayerMoveScissorsAndComputerMoveRock() {
        //Given
        WinChecker winChecker = new WinChecker();
        String moveUser = "3";
        String moveComputer = "1";
        //When
        int resultWhoWin = winChecker.checkWhoIsWin(moveUser, moveComputer);
        //Then
        Assert.assertEquals(2, resultWhoWin);
    }

    @Test
    public void testPlayerMoveScissorsAndComputerMovePaper() {
        //Given
        WinChecker winChecker = new WinChecker();
        String moveUser = "3";
        String moveComputer = "2";
        //When
        int resultWhoWin = winChecker.checkWhoIsWin(moveUser, moveComputer);
        //Then
        Assert.assertEquals(1, resultWhoWin);
    }

    @Test
    public void testPlayerMoveScissorsAndComputerMoveScissors() {
        //Given
        WinChecker winChecker = new WinChecker();
        String moveUser = "3";
        String moveComputer = "3";
        //When
        int resultWhoWin = winChecker.checkWhoIsWin(moveUser, moveComputer);
        //Then
        Assert.assertEquals(0, resultWhoWin);
    }

    @Test
    public void testPlayerMoveScissorsAndComputerMoveLizard() {
        //Given
        WinChecker winChecker = new WinChecker();
        String moveUser = "3";
        String moveComputer = "4";
        //When
        int resultWhoWin = winChecker.checkWhoIsWin(moveUser, moveComputer);
        //Then
        Assert.assertEquals(1, resultWhoWin);
    }

    @Test
    public void testPlayerMoveScissorsAndComputerMoveSpock() {
        //Given
        WinChecker winChecker = new WinChecker();
        String moveUser = "3";
        String moveComputer = "5";
        //When
        int resultWhoWin = winChecker.checkWhoIsWin(moveUser, moveComputer);
        //Then
        Assert.assertEquals(2, resultWhoWin);
    }

    @Test
    public void testPlayerMoveLizardAndComputerMoveRock() {
        //Given
        WinChecker winChecker = new WinChecker();
        String moveUser = "4";
        String moveComputer = "1";
        //When
        int resultWhoWin = winChecker.checkWhoIsWin(moveUser, moveComputer);
        //Then
        Assert.assertEquals(2, resultWhoWin);
    }

    @Test
    public void testPlayerMoveLizardAndComputerMovePaper() {
        //Given
        WinChecker winChecker = new WinChecker();
        String moveUser = "4";
        String moveComputer = "2";
        //When
        int resultWhoWin = winChecker.checkWhoIsWin(moveUser, moveComputer);
        //Then
        Assert.assertEquals(1, resultWhoWin);
    }

    @Test
    public void testPlayerMoveLizardAndComputerMoveScissors() {
        //Given
        WinChecker winChecker = new WinChecker();
        String moveUser = "4";
        String moveComputer = "3";
        //When
        int resultWhoWin = winChecker.checkWhoIsWin(moveUser, moveComputer);
        //Then
        Assert.assertEquals(2, resultWhoWin);
    }

    @Test
    public void testPlayerMoveLizardAndComputerMoveLizard() {
        //Given
        WinChecker winChecker = new WinChecker();
        String moveUser = "4";
        String moveComputer = "4";
        //When
        int resultWhoWin = winChecker.checkWhoIsWin(moveUser, moveComputer);
        //Then
        Assert.assertEquals(0, resultWhoWin);
    }

    @Test
    public void testPlayerMoveLizardAndComputerMoveSpock() {
        //Given
        WinChecker winChecker = new WinChecker();
        String moveUser = "4";
        String moveComputer = "5";
        //When
        int resultWhoWin = winChecker.checkWhoIsWin(moveUser, moveComputer);
        //Then
        Assert.assertEquals(1, resultWhoWin);
    }

    @Test
    public void testPlayerMoveSpockAndComputerMoveRock() {
        //Given
        WinChecker winChecker = new WinChecker();
        String moveUser = "5";
        String moveComputer = "1";
        //When
        int resultWhoWin = winChecker.checkWhoIsWin(moveUser, moveComputer);
        //Then
        Assert.assertEquals(1, resultWhoWin);
    }

    @Test
    public void testPlayerMoveSpockAndComputerMovePaper() {
        //Given
        WinChecker winChecker = new WinChecker();
        String moveUser = "5";
        String moveComputer = "2";
        //When
        int resultWhoWin = winChecker.checkWhoIsWin(moveUser, moveComputer);
        //Then
        Assert.assertEquals(2, resultWhoWin);
    }

    @Test
    public void testPlayerMoveSpockAndComputerMoveScissors() {
        //Given
        WinChecker winChecker = new WinChecker();
        String moveUser = "5";
        String moveComputer = "3";
        //When
        int resultWhoWin = winChecker.checkWhoIsWin(moveUser, moveComputer);
        //Then
        Assert.assertEquals(1, resultWhoWin);
    }

    @Test
    public void testPlayerMoveSpockAndComputerMoveLizard() {
        //Given
        WinChecker winChecker = new WinChecker();
        String moveUser = "5";
        String moveComputer = "4";
        //When
        int resultWhoWin = winChecker.checkWhoIsWin(moveUser, moveComputer);
        //Then
        Assert.assertEquals(2, resultWhoWin);
    }

    @Test
    public void testPlayerMoveSpockAndComputerMoveSpock() {
        //Given
        WinChecker winChecker = new WinChecker();
        String moveUser = "5";
        String moveComputer = "5";
        //When
        int resultWhoWin = winChecker.checkWhoIsWin(moveUser, moveComputer);
        //Then
        Assert.assertEquals(0, resultWhoWin);
    }


}


