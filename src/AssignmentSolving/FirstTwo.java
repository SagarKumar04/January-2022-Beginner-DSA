package AssignmentSolving;

public class FirstTwo {
    static void countNumberOfDigits(int N) {

    }

    static int firstTwo(int N){
        //identify if it is a 3-digit number or a 4-digit number
        /*
        Logic 1:
        if(N >= 100 && N < 1000) {

        }
        else if(N >= 1000 && N < 10000) {

        }
        else {

        }
         */

        int numberOfDigits;
        if(N / 1000 == 0) {
            numberOfDigits = 3;
        }
        else {
            numberOfDigits = 4;
        }

        int firstTwoDigits;
        if(numberOfDigits == 3) {
            firstTwoDigits = N / 10;
        }
        else {
            firstTwoDigits = N / 100;
        }

        int firstDigit = firstTwoDigits / 10;
        int secondDigit = firstTwoDigits % 10;
        int reverse = (secondDigit * 10) + firstDigit;

        return reverse;
    }

    public static void main(String[] args) {
        int N = 3423;
        int result = firstTwo(N);

        System.out.println("Result: " + result);
    }
}
