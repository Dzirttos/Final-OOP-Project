import CalculatorModel.CalculableFactory;
import CalculatorModel.ICalculableFactory;
import Logger.CalcFactory;
import Logger.LogConsole;
import View.ViewCalculator;

/**
Написать проект калькулятор для комплексных чисел, с элементами логирования действий пользователя. Достаточно сделать хотя-бы два действия.
Продумать, какие паттерны можно использовать в вашем проекте
 */
public class Main {
    public static void main(String[] args) {
        System.out.print("\033[H\033[J");

        ICalculableFactory calculableFactory = new CalculableFactory();
        ICalculableFactory calcFactory = new CalcFactory(new LogConsole(), new LogConsole(), calculableFactory);
        ViewCalculator view = new ViewCalculator(calcFactory);
        view.run();
        
    }
}

