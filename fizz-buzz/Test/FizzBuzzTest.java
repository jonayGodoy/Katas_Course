
import org.junit.Test;
import static org.junit.Assert.*;

public class FizzBuzzTest {


    @Test
    public void createArrayHundredNumbers(){
        FizzBuzz fb = new FizzBuzz();

        int[] listNumbers = fb.getListNumbers();

        assertEquals(100,listNumbers.length);
    }



}
