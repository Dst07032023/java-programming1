package alexQI.java.day22_string_manipulation;

public class StringSubstring {
    public static void main(String[] args) {
        String word = "java is fun";
        /**
         * 1) word.substring(starIndex, endIndex
         * endIndex is not included
         */
        System.out.println(word.substring(0, 4));
        System.out.println(word.substring(0, 7));
        //print is
        System.out.println(word.substring(5, 7));
        //print fun
        System.out.println(word.substring(8, 11));
        /**
         * 2)substring(starIndex) - it will read from start until end
         * java is fun
         */
        System.out.println(word.substring(8));
        //print is fun
        System.out.println(word.substring(5));

    }
}
