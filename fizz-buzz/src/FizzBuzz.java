
public class FizzBuzz {

    private int[] listNumbers;

    public FizzBuzz() {
        listNumbers = new int[100];
    }

    public int[] getListNumbers() {
        return listNumbers;
    }


    public int getPositionList(int position) {
        listNumbers[position] = position;
        return listNumbers[position];
    }
}
