package TestsForChallenges;

import CodingChallengesJava.Challenges;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppTest {
    @Test
    public void isEven_true(){
        assertTrue(Challenges.isEven(0));
        assertTrue(Challenges.isEven(4));
        assertTrue(Challenges.isEven(2));
        assertTrue(Challenges.isEven(88));
        assertTrue(Challenges.isEven(734));
        assertTrue(Challenges.isEven(2));
        assertTrue(Challenges.isEven(8));
        assertTrue(Challenges.isEven(-60));
        assertTrue(Challenges.isEven(78));
        assertTrue(Challenges.isEven(34));
        assertTrue(Challenges.isEven(6));
    }


    @Test
    public void isPasswordComplex_true(){
        assertTrue(Challenges.isPasswordComplex("Happy12"));
        assertTrue(Challenges.isPasswordComplex("1SarahL ength"));
        assertTrue(Challenges.isPasswordComplex("Password12"));
        assertTrue(Challenges.isPasswordComplex("H2PaasWordd12"));
        assertTrue(Challenges.isPasswordComplex("01Sally%443s"));
        assertTrue(Challenges.isPasswordComplex("Happyffh532"));
    }
}
