package alexQI.codingBat.Str1;

public class Left2 {
    public static void main(String[] args) {
        /**
         *
         Given a string, return a "rotated left 2" version where the first 2
         chars are moved to the end. The string length will be at least 2.
         left2("Hello") → "lloHe"
         left2("java") → "vaja"
         left2("Hi") → "Hi"
         */
        String str = "java";
        System.out.println(str.substring(2)+str.substring(0,2));

    }
}
