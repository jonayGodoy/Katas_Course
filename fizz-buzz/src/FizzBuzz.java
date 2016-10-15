
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
            listNumbers[position] = "Fizz";
        }else {
            listNumbers[position] = String.valueOf(position+1);
        }

        return listNumbers[position];
    }
}
