
import org.junit.Test;
import static org.junit.Assert.*;

public class FizzBuzzTest {


    @Test
    public void create_Array_Hundred_Numbers(){
        FizzBuzz fb = new FizzBuzz();

        int[] listNumbers = fb.getListNumbers();

        assertEquals(100,listNumbers.length);
    }

    @Test
    public void first_Position_Return1(){
        FizzBuzz fb = new FizzBuzz();

        int position = fb.getPositionList(1);

        assertEquals(1,position);
    }


    @Test
    public void second_Position_Return2(){
        FizzBuzz fb = new FizzBuzz();

        int position = fb.getPositionList(2);

        assertEquals(2,position);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void position_101_ReturnArrayIndexOutException(){
        FizzBuzz fb = new FizzBuzz();

        fb.getPositionList(100);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void position_Negative_ReturnArrayIndexOutException(){
        FizzBuzz fb = new FizzBuzz();

        fb.getPositionList(-1);
    }






}
