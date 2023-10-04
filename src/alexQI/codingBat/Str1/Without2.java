package alexQI.codingBat.Str1;

public class Without2 {
    public static void main(String[] args) {
        /**
         *
         Given a string, if a length 2 substring appears at both its beginning and end, return a string without the
         substring at the beginning, so "HelloHe" yields "lloHe". The substring may overlap with itself, so "Hi" yields
         "". Otherwise, return the original string unchanged.


         without2("HelloHe") → "lloHe"
         without2("HelloHi") → "HelloHi"
         without2("Hi") → ""
         */
        String str = "H";
        System.out.println(without2(str));
    }

    public static String without2(String str) {
            if (str.length() >= 2 && str.substring(0, 2).equals(str.substring(str.length() - 2))) {
                return str.substring(2);
        }
        return str;
    }
}