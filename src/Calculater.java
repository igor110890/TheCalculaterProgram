public class Calculater {


        static int result;

        @SuppressWarnings("ConstantConditions")
        public static void calculator(int num1, int num2, char operation) {


            try {

                if (operation == '+') {
                    result = num1 + num2;
                } else if (operation == '-') {
                    result = num1 - num2;
                } else if (operation == '/') {
                    result = num1 / num2;
                } else if (operation == '*') {
                    result = num1 * num2;
                } else  {
                    result = Integer.parseInt(null);
                }


            } catch (ArithmeticException e) {
                System.err.println("ArithmeticException");
            }

        }
}
