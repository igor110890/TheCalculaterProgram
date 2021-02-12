import java.util.Scanner;

public class Console {

    static int roman1 ;
    static int roman2 ;
    static int arabic1 ;
    static int arabic2 ;
    static char operation2;

    public static void console() {

        String[] roman = {"X", "IX", "VIII", "VII", "VI", "V", "IV", "III", "II", "I"};

        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        String[] blocks = text.split(" ");
        String operation = blocks[1];
        operation2 = operation.charAt(0);
        boolean flag = false;


        for (String s : roman)
            if (s.equals(blocks[0]) || s.equals(blocks[2])) {
                flag = true;
                break;

            }

            if (flag) {
                roman1 = RomanToArabic.romanToArabic(blocks[0]);
                roman2 = RomanToArabic.romanToArabic(blocks[2]);

            } else {
                arabic1 = Arabic.arabic(blocks[0]);
                arabic2 = Arabic.arabic(blocks[2]);

            }



    }
}
