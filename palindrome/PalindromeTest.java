import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class PalindromeTest {
    @Test
    public void randomCharsTest(){
        Random r=new Random();
        String str="";
        String reverse="";
        int value;
        for(int i=0;i<10;++i){
            value=r.nextInt(255);
            str+=(char)value;
            reverse=(char)value+reverse;
        }
        assertTrue(Palindrome.palindrome("")>0);
    }
    @Test
    public void workTest(){
        assertTrue(Palindrome.palindrome("non")==1);
    }
    @Test
    public void multipleWordsTest(){
        assertTrue(Palindrome.palindrome("non oui non Non")==3);
    }
}
