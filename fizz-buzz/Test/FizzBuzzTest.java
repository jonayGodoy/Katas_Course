
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

        int position = fb.getPositionList(1);

        assertEquals(1,position);
    }


    @Test
    public void secondPositionReturn2(){
        FizzBuzz fb = new FizzBuzz();

        int position = fb.getPositionList(2);

        assertEquals(2,position);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void position101ReturnArrayIndexOutException(){
        FizzBuzz fb = new FizzBuzz();

        fb.getPositionList(100);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void positionNegativeReturnArrayIndexOutException(){
        FizzBuzz fb = new FizzBuzz();

        fb.getPositionList(-1);
    }


}
