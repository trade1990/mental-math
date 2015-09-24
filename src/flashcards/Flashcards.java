/*
 * Methods used to generate numbers.
 * @author Gabriel Lee
 */
package flashcards;

public class Flashcards {

    public Flashcards() {

    }

    public static String generateNumber(int digits) {
        String result = "";
        for (int i = 0; i < digits; i++) {
            String digit = String.valueOf((int) Math.floor((Math.random() * 9)));
            result += digit;
        }
        if ("0".equals(result.substring(0, 1))) {
            String newDigit = String.valueOf((int) Math.floor((Math.random() * 8) + 1));
            result = newDigit + result.substring(1);
        }
        return result;
    }

    public static String commify(String str) {
        boolean hasNegative = false;
        if (str.charAt(0) == '-'){
            str = str.substring(1);
            hasNegative = true;
        }
        int length = str.length();
        if (length < 4) {
            return str;
        }
        int commas = length / 3;
        int start = length % 3;
        String commifiedString = "";
        for (int i = 0; i < length; i++) {
            if ((i == start) || (i % 3 == start)) {
                if (i != 0) {
                    commifiedString = commifiedString + "," + str.charAt(i);
                } else {
                    commifiedString = commifiedString + str.charAt(i);
                }
            } 
            else {
             commifiedString = commifiedString + str.charAt(i);
            }
        }
        if (hasNegative) {
            return "-" + commifiedString;
        }
        return commifiedString;
    }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Flashcards f = new Flashcards();
//        System.out.println(String.valueOf((int)Math.floor((Math.random() * 9))));
//           System.out.println(commify("123456789"));
//           System.out.println(commify("-123456789"));
    }

}
