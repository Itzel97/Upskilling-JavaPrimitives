public class IntegerSum {

    public static void Sum(int num) {
        int resultado;
        for(resultado = 0; num > 0 && num <= 1000; num /= 10) {
            resultado += num % 10;
        }

        System.out.println("The sum of the digits is : " + resultado);
    }
}
