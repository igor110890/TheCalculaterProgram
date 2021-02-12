

public class Program {


    public static void main(String[] args) {


        System.out.println("Enter the operation");
        try {
            Console.console();

            if (Console.roman1 > Console.arabic1) {
                Calculater.calculator(Console.roman1, Console.roman2, Console.operation2);
                System.out.println("Result :");
                System.out.println(ArabicToRoman.arabicToRoman(Calculater.result));

            } else {
                Calculater.calculator(Console.arabic1, Console.arabic2, Console.operation2);
                System.out.println("Result :");
                System.out.println(Calculater.result);
            }

        } catch (ArrayIndexOutOfBoundsException e){
            System.err.println("ArrayIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e){
            System.err.println("StringIndexOutOfBoundsException");
        }  catch (IllegalArgumentException e){
            System.err.println("IllegalArgumentException");
        }


    }
}
