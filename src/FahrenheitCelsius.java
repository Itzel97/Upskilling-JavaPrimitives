public class FahrenheitCelsius {

    public static void Convertir(float fahrenheit) {
        float resultado = (fahrenheit - 32.0F) * 5.0F / 9.0F;
        System.out.println("Convert Fahrenheit " + fahrenheit + " F to Celsius: " + resultado);
    }
}
