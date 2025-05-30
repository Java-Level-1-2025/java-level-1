/**
 * <h1>Hello World</h1>
 * <p>
 *     This is a main method for <b>day 1</b>
 * </p>
 */
void main() {
    System.out.println("Hello World!");

    // whole number -> default type int
    // floating point -> default type double
    // boolean -> no default, because it's only true or false

    //  strong typing/ strongly type

    var age = 28; // statement, declaration and assigning of value
    double sum; // statement, declaration
    sum = 0; // assigning of value

    long employeeId = 2512L;

    System.out.println(age); // 28
    System.out.println(sum); // no, compilation error

    byte score = (byte) 129; // implicit casting, -128 to 127
    System.out.println(score);

    boolean isEmployed = false;

    float averageRange = 67.89745F;

    char value = '1'; // UTF-8
    System.out.println(value);

    int counter = 11;
    int x = 22 + ++counter; // counter = 12
    //  x = 22 + 12;
    System.out.println(x);
    System.out.println(counter);

    // encryption/decryption
    int a = 10;
    int c = a << 2;  // 0000 1010
                     // 0010 1000
                     // ---------
                     //
    int b = 5;
    b = b + 5; // 5 + 5
    b += 5; // shorthand
    System.out.println(b);

    System.out.println(c);

    long salary = 987_223_183_928L;


}
