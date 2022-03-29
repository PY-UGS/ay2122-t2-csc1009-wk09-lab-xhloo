import static org.junit.Assert.*;
import org.junit.Test;

public class TestRandomCharacter {
    RandomCharacter randomC = new RandomCharacter();

    private final static int AMOUNT = 15;

    // Q1
    // Test if it returns a lowercase letter; pass
    @Test
    public void testLowerCase() {
        for(int i = 0; i < AMOUNT; i++){
            assertTrue(Character.isLowerCase(randomC.getRandomLowerCaseLetter()));
        }
    }

    // Test if it returns a uppercase letter; pass
    @Test
    public void testUpperCase() {
        for(int i = 0; i < AMOUNT; i++){
            assertTrue(Character.isUpperCase(randomC.getRandomUpperCaseLetter()));
        }
    }

    // Test if it returns a digit between 0-9; pass
    @Test
    public void testDigit() {
        for(int i = 0; i < AMOUNT; i++){
            char num = (char) randomC.getRandomDigitCharacter();
            assertTrue(num <=9 && num >=0);
        }
    }

    // Test if it returns a random character; pass
    @Test
    public void testRandomCharacter() {
        for(int i = 0; i < AMOUNT; i++){
            assertTrue(Character.isLetterOrDigit(randomC.getRandomCharacter()));
        }
    }

    // Q2
    // Test if random generated number is a prime number; pass
    @Test
    public void testPrime(){
        for(int i = 0; i < AMOUNT; i++) {
            int num = randomC.getRandomPrimeNumbers();
            assertTrue(randomC.checkPrime(num));
        }
    }
}
