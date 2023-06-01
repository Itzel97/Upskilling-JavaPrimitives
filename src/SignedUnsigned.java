
/*
 * 5. Write a Java program to compare two signed and unsigned numbers.
Hint: Use wrapper class
https://docs.oracle.com/javase/8/docs/api/java/lang/Integer.html
 * */
public class SignedUnsigned
{
    public static void CompareSigned (int num1, int num2){

        System.out.println();

        if ( Integer.compareUnsigned(num1,num2) == -1){
            System.out.println("El  numero " + num1 + " es menor al numero " + num2 + " (ignorando el simbolo)");
        } else if (Integer.compareUnsigned(num1,num2) == 1) {
            System.out.println("El  numero " + num1 + " es mayor al numero " + num2 + " (ignorando el simbolo)");

        }else{
            System.out.println("El  numero " + num1 + " es igual al numero " + num2 );

        }


    }

}
