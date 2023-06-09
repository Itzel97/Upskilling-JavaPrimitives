# Upskilling-JavaPrimitives

## Data Type Primitives

| Data Type| Size	| Description |
| --- | --- | --- |
| boolean | 1 bit | Store true or false. |
| byte | 1 byte | Store int numbers in a rage of -128 to +127. |
| short | 2 bytes | Store int numbers in a rage of -32,768 to +32,767. |
| int | 4 bytes | Store int numbers in a rage of -2,147,483,648 to 2,147,483,647. |
| long | 8 bytes | Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807. |
| float | 4 bytes | Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits. |
| double | 8 bytes | Stores fractional numbers. Sufficient for storing 15 decimal digits. |
| char | 2 bytes | Stores a single character/letter or ASCII values. |

## Warpper class

Warpper classees privde a way to use primitive data types as objetcs.

| Data Type| Warpper class |
| --- | --- | 
| boolean | Boolean | 
| byte | Byte |
| short | Short | 
| int | Int | 
| long | Long | 
| float | Float | 
| double | Double | 
| char | Char | 

### Creating Wrapper Objects


To create a wrapper object, use the wrapper class instead of the primitive type. To get the value, you can just print the object:
```
public class Main {
  public static void main(String[] args) {
    Integer myInt = 5;
    Double myDouble = 5.99;
    Character myChar = 'A';
    System.out.println(myInt);
    System.out.println(myDouble);
    System.out.println(myChar);
  }
}

```

### Autoboxing

Automatic conversion of primitive data to Objects.

#### Example:
```
 public static void main (String args[]){
    int + a = 100;
    Integer i = a; // Autoboxing will occur internally
 }
```



### Unboxing

Converts the Object into a Wrapper class to is primitive.

#### Example:
```
 public static void main (String args[]){
    Integer a = new Integer(15); // wrapper
    int I = a; // UNboxing wil occur internally.
 }
```


## Questions

What are Wrapper classes in Java?
> Is a way to use primitive Data as an Object.

Why use the wrapper class in Java?
> This is an option that allows to use the methods that a class has, is more easy for manipulate data.
