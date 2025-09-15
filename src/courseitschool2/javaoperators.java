package courseitschool2;

public class javaoperators {

    public static void main (String []  args){

        int x = 10;
        int y = 10;
        int result1 = x++ * 5;
        int result2 = ++y * 5;
        System.out.println(result1); // 50
        System.out.println(result2); // 55
        int value = 20;
        value *= 3; // 60
        System.out.println(value); //60
        value %= 50; //
        System.out.println(value); // 10
        int a = 10;
        a += 5; // Compound addition. Equivalent to: a = a + 5;
        System.out.println(a); // 15
        int e = 10;
        int f = 20;
        System.out.println(e == f);  // false
        System.out.println(e != f);  //true
        System.out.println(e > f);   // false
        System.out.println(e < f);   // true
        System.out.println(e >= f);  // false
        System.out.println(e <= f);  // true
        double c = 15.5;
        int d = 15;
        System.out.println(c > d);  // true
        System.out.println(c <= d); // false ( ia egalul prima data)
        short m = 10;
        int n = m + 5; // int n takes the value of m which is 10 and adds 5 to it
        long g = 100L;
        int h = (int) n; // int is 15 (charc)=int in interiorul codului
        System.out.println("My short value is " + m);//10
        System.out.println("My long value is " + g);//100
        System.out.println("My int value is " + n);//15
        byte q = 10;
        int o = q;  // because byte turns into int automaticaly when it is assigned a value
        double v = 5.5;
        float p = (float) v;  // cast is (float) and it is 5,5
        System.out.println("My byte value is " + q);//10
        System.out.println("My int value is " + o);
        System.out.println("My float value is " + p);
        System.out.println("My double value is " + v);
        int age;       // Declaration
        age = 25;      // Initialization
        System.out.println("I am " + age + " years old."); // I am 25 years old
        int outerVar = 100;
        if (outerVar > 50) {
            int innerVar = 200;
            System.out.println(innerVar + outerVar); // 300
        }
    }}


