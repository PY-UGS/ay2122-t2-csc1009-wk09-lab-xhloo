import java.util.Random;

public class RandomCharacter {
    // creating a random object
    Random random = new Random();

    // Q1
    // upper case
    public char getRandomUpperCaseLetter() {
        // generate random number between 65-90 and convert to char
        char upperLetter = (char) ('A' + random.nextInt(26));
        return upperLetter;
    }

    // lower case
    public char getRandomLowerCaseLetter() {
        // generate random number between 97-122 and convert to char
        char lowerLetter = (char) ('a' + random.nextInt(26));
        return lowerLetter;
    }
 
    // digit character
    public int getRandomDigitCharacter() {
        // generate random number between 0-9
        return (int)(random.nextInt(10));
    }

    // random characters
    public char getRandomCharacter() {
        // listing the String of all characters
        String alphaNumericString = "abcdefghijklmnopqrstuvxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        // generate random number that represents index of the string
        int randomNum = random.nextInt(alphaNumericString.length());
        // return character based on the randomNum generated
        return alphaNumericString.charAt(randomNum);
    }

    // random prime 
    public int getRandomPrimeNumbers() {
        while(true) {
            // generate a number from range 2 to 9
            int num = (int)(random.nextInt(7) + 2);
            // return the value if it is prime
            if(checkPrime(num) == true) {
                return num;
            }
        }
    }

    // Q2
    // to check whether the number is a prime
    public boolean checkPrime(int num) {
        boolean isPrime = true;
        int i = 2;
        // if i is less than or equal to num/2, go into while loop 
        while(i <= num/2) {
            // if remainder is 0, it is not prime
            if (num % i == 0) {
                isPrime = false;
                break;
            }
            i++; // increment
        }
        // else, it is prime
        return isPrime;
    }
}