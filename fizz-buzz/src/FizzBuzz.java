
public class FizzBuzz {

    private String[] listNumbers;

    public FizzBuzz() {
        listNumbers = new String[100];
    }

    public int getLength() {
        return listNumbers.length;
    }


    public String getPositionList(int position) {

        if(position % 3 == 0){
            listNumbers[position-1] = "Fizz";
        }else {
            if ((position % 5 == 0)) {
                listNumbers[position - 1] = "Buzz";
            } else {
                listNumbers[position - 1] = String.valueOf(position);
            }
        }
        return listNumbers[position-1];
    }
}
