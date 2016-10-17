
public class FizzBuzz {

    private String[] listNumbers;

    public FizzBuzz() {
        listNumbers = new String[100];
        generatePositions();
    }

    public int getLength() {
        return listNumbers.length;
    }

    private void generatePositions(){
        for(int i =0; i < listNumbers.length;i++){
            listNumbers[i]= generatePosition(i+1);
        }
    }

    private String generatePosition(int position){
        if(isFizzBuzz(position)){
            return "FizzBuzz";
        }
        if (isFizz(position)) {
                 return "Fizz";
            }
        if (isBuzz(position)) {
                return "Buzz";
        }

        return String.valueOf(position);
    }


    public String getPositionList(int position){
        return listNumbers[position-1];
    }

    private boolean isBuzz(int position) {
        return (position % 5 == 0) || (String.valueOf(position).contains("5")) ;
    }

    private boolean isFizz(int position) {
        return (position % 3 == 0) || (String.valueOf(position).contains("3"));
    }

    private boolean isFizzBuzz(int position) {
        return (isFizz(position) && isBuzz(position));
    }
}
