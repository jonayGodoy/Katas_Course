
import org.junit.Test;
import static org.junit.Assert.*;

public class FizzBuzzTest {


    @Test
    public void create_Array_Hundred_Numbers(){
        FizzBuzz fb = new FizzBuzz();

        int sizeArray = fb.getLength();

        assertEquals(100,sizeArray);
    }

    @Test
    public void first_Position_Return_1(){
        FizzBuzz fb = new FizzBuzz();

        String position = fb.getPositionList(1);

        assertEquals("1",position);
    }


    @Test
    public void second_Position_Return_2(){
        FizzBuzz fb = new FizzBuzz();

        String position = fb.getPositionList(2);

        assertEquals("2",position);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void position_101_Return_ArrayIndexOutException(){
        FizzBuzz fb = new FizzBuzz();

        fb.getPositionList(101);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void position_Negative_Return_ArrayIndexOutException(){
        FizzBuzz fb = new FizzBuzz();

        fb.getPositionList(-1);
    }

    @Test
    public void position_3_return_Fizz(){
        FizzBuzz fb = new FizzBuzz();

        String position = fb.getPositionList(3);

        assertEquals("Fizz", position);
    }

    @Test
    public void position_6_return_Fizz(){
        FizzBuzz fb = new FizzBuzz();

        String position = fb.getPositionList(6);

        assertEquals("Fizz",position);
    }

    @Test
    public void position_9_return_Fizz(){
        FizzBuzz fb = new FizzBuzz();

        String position = fb.getPositionList(9);

        assertEquals("Fizz",position);
    }

    @Test
    public void position_5_return_Buzz(){
        FizzBuzz fb = new FizzBuzz();

        String position = fb.getPositionList(5);

        assertEquals("Buzz",position);
    }

    @Test
    public void position_10_return_Buzz(){
        FizzBuzz fb = new FizzBuzz();

        String position = fb.getPositionList(10);

        assertEquals("Buzz",position);
    }

    @Test
    public void position_20_return_Buzz(){
        FizzBuzz fb = new FizzBuzz();

        String position = fb.getPositionList(20);

        assertEquals("Buzz",position);
    }

    @Test
    public void position_15_return_FizzBuzz(){
        FizzBuzz fb = new FizzBuzz();

        String position = fb.getPositionList(15);

        assertEquals("FizzBuzz",position);
    }

    @Test
    public void position_30_return_FizzBuzz(){
        FizzBuzz fb = new FizzBuzz();

        String position = fb.getPositionList(30);

        assertEquals("FizzBuzz",position);
    }

    @Test
    public void position_45_return_FizzBuzz(){
        FizzBuzz fb = new FizzBuzz();

        String position = fb.getPositionList(45);

        assertEquals("FizzBuzz",position);
    }



    @Test
    public void positions_multiples_3_return_Fizz_from_1_to_33_than_not_multiples5(){
        FizzBuzz fb = new FizzBuzz();

        int numberMultiple3 = 5;

        while(numberMultiple3 % 5 == 0) {
            numberMultiple3 = (int) Math.floor(Math.random() * (1 - 33) + 33) * 3;
        }

        String position = fb.getPositionList(numberMultiple3);

        assertEquals("Fizz",position);
    }


    @Test
    public void positions_multiples_5_return_Buzz_from_1_to_20_than_not_multiples3(){
        FizzBuzz fb = new FizzBuzz();

        int numberMultiple5 = 3;

        while(numberMultiple5 % 3 == 0) {
            numberMultiple5 = (int) Math.floor(Math.random() * (1 - 20) + 20) * 5;
        }

        String position = fb.getPositionList(numberMultiple5);

        assertEquals("Buzz",position);
    }


}
