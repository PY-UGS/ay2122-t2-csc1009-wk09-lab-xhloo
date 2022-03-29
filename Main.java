public class Main {
    public static void main (String[] args) {
        char lowercLetter, uppercLetter, randomChar;
        int digit, primeNum;

        // Q1
        // setting the length to be 15
        final int LENGTH = 15;

        RandomCharacter random = new RandomCharacter();

        // generate 15 random lower case and print 
        System.out.println("Random Lower Case Letter: ");
        for (int i = 0; i < LENGTH; i++){
            lowercLetter = random.getRandomLowerCaseLetter();
            System.out.println(lowercLetter + " ");
        }

        // generate 15 random upper case and print 
        System.out.println("\nRandom Upper Case Letter: ");
        for (int i = 0; i < LENGTH; i++){
            uppercLetter = random.getRandomUpperCaseLetter();
            System.out.println(uppercLetter + " ");
        }

        // generate 15 random digit numbers and print 
        System.out.println("\nRandom Digit Number (0-9): ");
        for (int i = 0; i < LENGTH; i++){
            digit = random.getRandomDigitCharacter();
            System.out.println(digit + " ");
        }
        
        // generate 15 random characters and print 
        System.out.println("\nRandom Characters: ");
        for (int i = 0; i < LENGTH; i++){
            randomChar = random.getRandomCharacter();
            System.out.println(randomChar + " ");
        }

        // Q2
        // generate 15 random prime and print 
        System.out.println("\nRandom Prime Number: ");
        for (int i = 0; i < LENGTH; i++){
            primeNum = random.getRandomPrimeNumbers();
            System.out.println(primeNum + " ");
        }
    }
}