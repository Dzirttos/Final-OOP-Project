package View;

import java.util.Scanner;

import CalculatorModel.Calculable;
import CalculatorModel.ICalculableFactory;

public class ViewCalculator {

    private ICalculableFactory calculableFactory;

    public ViewCalculator(ICalculableFactory calculableFactory) {
        this.calculableFactory = calculableFactory;
    }

    public void run() {
        while (true) {
            int realArg = promptInt("Введите вещественную часть первого числа: ");
            Calculable calculator1 = calculableFactory.create(realArg);
            int imaginaryArg = promptInt("Введите мнимую часть первого числа: ");
            Calculable calculator2 = calculableFactory.create(imaginaryArg);
            while (true) {
                String cmd = prompt("Введите команду (+, -, =) : ");
                if (cmd.equals("-")) {
                    int nextRealArg = promptInt("Введите вещественную часть второго числа:  ");
                    int nextImaginaryArg = promptInt("Введите мнимую часть второго числа:  ");
                    calculator1.subtract(nextRealArg);
                    calculator2.subtract(nextImaginaryArg);
                    continue;
                }
                if (cmd.equals("+")) {
                    int nextRealArg = promptInt("Введите вещественную часть второго числа:  ");
                    int nextImaginaryArg = promptInt("Введите мнимую часть второго числа:  ");
                    calculator1.sum(nextRealArg);
                    calculator2.sum(nextImaginaryArg);
                    continue;
                }
                if (cmd.equals("=")) {
                    int realResult = calculator1.getResult();
                    int imaginaryResult = calculator2.getResult();
                    System.out.println("Результат:" + realResult + " + i"+imaginaryResult);
                    break;
                }
            }
            String cmd = prompt("Еще посчитать (Y/N)?").toUpperCase();
            if (cmd.equals("Y")) {
                continue;
            }
            break;
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private int promptInt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Integer.parseInt(in.nextLine());
    }
}