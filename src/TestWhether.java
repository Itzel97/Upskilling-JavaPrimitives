
/*
* 4. Write a Java program to test whether a given double/float value is a finite floating-point value or not.
Hint: Use wrapper class
https://docs.oracle.com/javase/8/docs/api/java/lang/Double.html
https://docs.oracle.com/javase/8/docs/api/java/lang/Float.html
* */
public class TestWhether {

    public static void testDoubleInfinite(double num){
        Double db = num;

        if(db.isInfinite()){
            System.out.println("El numero double es infinito");
        }else{
            System.out.println("El numero  double NO infinito");
        }

    }

    public static void testFloatInfinite(float num){
        Float fl = num;

        if(fl.isInfinite())
            System.out.println("El numero es infinito");
        else
            System.out.println("El numero float NO es infinito");

    }

}
