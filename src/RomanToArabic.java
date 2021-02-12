
public class RomanToArabic {

    static int arabic;

    public static int romanToArabic(String x) {

        int arab = 0;

            switch (x) {
                case "I":
                    arab = 1;
                    break;
                case "II":
                    arab = 2;
                    break;
                case "III":
                    arab = 3;
                    break;
                case "IV":
                    arab = 4;
                    break;
                case "V":
                    arab = 5;
                    break;
                case "VI":
                    arab = 6;
                    break;
                case "VII":
                    arab = 7;
                    break;
                case "VIII":
                    arab = 8;
                    break;
                case "IX":
                    arab = 9;
                    break;
                case "X":
                    arab = 10;
                    break;
            }

            if (arab >= 1 && arab <= 10) {
            return arab;
        } else {
            System.err.println("Not the right number");
        }

            return arabic = Integer.parseInt(null);

    }
}
