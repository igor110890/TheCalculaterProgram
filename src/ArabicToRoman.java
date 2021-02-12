public class ArabicToRoman {



    public static String arabicToRoman(int x){

        StringBuilder s = new StringBuilder();
        if (x > -999 || x < 999)

            while (x >= 100) {
                s.append("C");
                x -= 100;
            }
        while (x >= 90) {
            s.append("XC");
            x -= 90;
        }
        while (x >= 50) {
            s.append("L");
            x -= 50;
        }
        while (x >= 40) {
            s.append("XL");
            x -= 40;
        }
        while (x >= 10) {
            s.append("X");
            x -= 10;
        }
        while (x >= 9) {
            s.append("IX");
            x -= 9;
        }
        while (x >= 5) {
            s.append("V");
            x -= 5;
        }
        while (x >= 4) {
            s.append("IV");
            x -= 4;
        }
        while (x >= 1) {
            s.append("I");
            x -= 1;
        }
        return s.toString();
    }

}
