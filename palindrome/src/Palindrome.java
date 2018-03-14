import java.lang.management.PlatformLoggingMXBean;

public class Palindrome {

    /**
     * La phrase doit être un string avec des mots séparés par des espaces
     *
     * @param phrase
     * @return
     */
    public static int palindrome(String phrase) {
        if (phrase == null) return -1;
        String[] mots = phrase.split(" ");
        int result = 0;
        for (int i = 0; i < mots.length; i++) {
            if (Palindrome.isPalindrome(mots[i])) result ++;
        }
        return result;
    }

    public static boolean isPalindrome(String mot) {
        if (mot == null) return false;
        String reverse = new String();
        for (int i = mot.length(); i > 0; i--) {
            reverse += mot.charAt(i - 1);
        }
        return mot.equals(reverse);
    }

    public static void main(String[] args) {
        System.out.println(Palindrome.isPalindrome("kayak"));
        System.out.println(Palindrome.isPalindrome("bonjour"));
        System.out.println(Palindrome.palindrome("bonjour et oé kayak kayak lol"));
    }
}
