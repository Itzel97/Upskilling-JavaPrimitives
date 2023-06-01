public class Main {
    public static void main(String[] args) {
        float Fahrenheit = 212.0F;
        System.out.println("******************--First Challenge--******************");
        FahrenheitCelsius.Convertir(Fahrenheit);
        System.out.println("******************--Second Challenge--******************");
        IntegerSum.Sum(234);
        System.out.println("******************--Third Challenge--******************");
        MinutesDaysYears.ToDaysAndYears(3456789);
        System.out.println("******************--Fourth Challenge--******************");
        TestWhether.testDoubleInfinite(Double.POSITIVE_INFINITY);
        TestWhether.testDoubleInfinite(Double.NEGATIVE_INFINITY);
        TestWhether.testDoubleInfinite(Math.PI);
        System.out.println("Float-----------");
        TestWhether.testFloatInfinite(Float.POSITIVE_INFINITY);
        TestWhether.testFloatInfinite(Float.NEGATIVE_INFINITY);
        TestWhether.testFloatInfinite(20.12314F);
        System.out.println("******************--Five Challenge--******************");
        SignedUnsigned.CompareSigned(-4,3);
        SignedUnsigned.CompareSigned(2,1);
        SignedUnsigned.CompareSigned(1,-7);
        SignedUnsigned.CompareSigned(1,1);
    }
}