
import org.junit.Test;
import static org.junit.Assert.*;

public class FizzBuzzTest {


    @Test
    public void createArrayHundredNumbers(){
        FizzBuzz fb = new FizzBuzz();

        int[] listNumbers = fb.getListNumbers();

        assertEquals(100,listNumbers.length);
    }

    @Test
    public void firstPositionReturn1(){
        FizzBuzz fb = new FizzBuzz();

        int firstPosition = fb.getPositionList();

        assertEquals(1,firstPosition);
    }

}
