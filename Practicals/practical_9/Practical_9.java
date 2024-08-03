package practical_9;

/* 
Practical No. :- 9 
Q.9] Design a user defined abstract data type 'Complex' in Java. Write a program to perform arithmetic operations 
of two complex numbers. A complex number has a real part and an imaginary part. 
a) Given the values of real part and imaginary part of a complex number, the magnitude of the complex number can 
be calculated as square root of the sum of squares of real part and the imaginary part. 
 b) The argument of the complex number can be calculated as tan inverse of ratio of imaginary part(numerator) and 
real part(denominator ) 
c) The complex number can be added to another complex number and the answer of the addition is a complex 
number. When one adds two complex numbers, the real parts of each of the complex numbers is added which 
becomes a real part of the answer and imaginary part of each complex number is added together which becomes 
imaginary part of the answer. Both these results are real and imaginary parts for a complex number which is the 
answer of the addition complex conjugate of the complex number can be calculated by negating the imaginary part 
of the complex number 
d) The complex number can be subtracted from another complex number and the answer of the subtraction is a 
complex number. 
e) When one subtracts a complex number from the other, the real part one complex number is subtracted from the 
other and the result becomes a real part of the answer and imaginary part of one complex number is number is 
subtracted from the other and the result of subtraction becomes imaginary part of the answer. Both these results 
are real and imaginary parts for a complex number which is the answer of the subtraction.
*/

abstract class Complex {
    int real, imaginary;

    void set(int tempReal, int tempImaginary) {
        real = tempReal;
        imaginary = tempImaginary;
    }

    abstract void printComplexNumber();
}

class Calc extends Complex {
    Calc() {
    }

    Calc(int tempReal, int tempImaginary) {
        super.set(tempReal, tempImaginary);
    }

    Calc addComp(Calc C1, Calc C2) {
        Calc temp = new Calc();
        temp.real = C1.real + C2.real;
        temp.imaginary = C1.imaginary + C2.imaginary;
        return temp;
    }

    Calc subtractComp(Calc C1, Calc C2) {
        Calc temp = new Calc();
        temp.real = C1.real - C2.real;
        temp.imaginary = C1.imaginary - C2.imaginary;
        return temp;
    }

    void printComplexNumber() {
        System.out.println("Complex number: " + real + " + " + imaginary + "i");
    }
}

public class Practical_9 {
    public static void main(String[] args) {
        Calc C1 = new Calc(6, 4);
        C1.printComplexNumber();
        Calc C2 = new Calc(2, 5);
        C2.printComplexNumber();
        Calc C3 = new Calc();
        C3 = C3.addComp(C1, C2);
        System.out.print("Sum of ");
        C3.printComplexNumber();
        C3 = C3.subtractComp(C1, C2);
        System.out.print("Difference of ");
        C3.printComplexNumber();
    }
}