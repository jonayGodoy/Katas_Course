
public class FizzBuzz {

    private String[] listNumbers;

    public FizzBuzz() {
        listNumbers = new String[100];
    }

    public String[] getListNumbers() {
        return listNumbers;
    }


    public String getPositionList(int position) {

        if((position % 3 == 0)){
            listNumbers[position-1] = "Fizz";
        }else {
            listNumbers[position-1] = String.valueOf(position);
        }

        return listNumbers[position-1];
    }
}
