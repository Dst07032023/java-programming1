package alexQI.codingBat.Str1;

public class FirstHalf {
    public static void main(String[] args) {
        /**
         *
         Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
         firstHalf("WooHoo") → "Woo"
         firstHalf("HelloThere") → "Hello"
         firstHalf("abcdef") → "abc"
         */
        String str = "WooHoo";
        int fHalf = str.length()/2;
        System.out.println(str.substring(0,fHalf));

    }
}
