import Model.CalculableFactory;
import Model.ICalculableFactory;
import View.ViewCalculator;

/**
Написать проект калькулятор для комплексных чисел, с элементами логирования действий пользователя. Достаточно сделать хотя-бы два действия.
Продумать, какие паттерны можно использовать в вашем проекте
 */
public class Main {
    public static void main(String[] args) {
        System.out.print("\033[H\033[J");
        
        ICalculableFactory calculableFactory = new CalculableFactory();
        ViewCalculator view = new ViewCalculator(calculableFactory);
        view.run();
    }
}

// public class ComplexNumber {

//     private double real;
//     private double imaginary;

//     public ComplexNumber(double real, double imaginary) {
//         this.real = real;
//         this.imaginary = imaginary;
//     }

//     public double getReal() {
//         return real;
//     }
//     public double getImaginary() {
//         return imaginary;
//     }


//     public ComplexNumber add(ComplexNumber other) {
//         double newReal = this.real + other.real;
//         double newImaginary = this.imaginary + other.imaginary;
//         return new ComplexNumber(newReal, newImaginary);
//     }


//     public ComplexNumber subtract(ComplexNumber other) {
//         double newReal = this.real - other.real;
//         double newImaginary = this.imaginary - other.imaginary;
//         return new ComplexNumber(newReal, newImaginary);
//     }

// }


// public class ComplexCalculator {
//     public static void main(String[] args) {
//         ComplexNumber a = new ComplexNumber(2, 3);
//         ComplexNumber b = new ComplexNumber(1, 2);
//         ComplexNumber sum = a.add(b);
//         ComplexNumber difference = a.subtract(b);
//         System.out.println("Sum: " + sum.getReal() + " + " + sum.getImaginary() + "i");
//         System.out.println("Difference: " + difference.getReal() + " + " + difference.getImaginary() + "i");
//     }

// }