package Logger;

import CalculatorModel.Calculable;

public class CalculatorLogger implements Calculable {

    private Loggable log1;
    private Loggable log2;
    private Calculable calc;

    public CalculatorLogger(Loggable log1, Loggable log2, Calculable calc) {
        super();
        this.log1 = log1;
        this.log2 = log2;
        this.calc = calc;
        log1.log("Часть комплексного числа равна: " + calc.getResultReal());

    }

    @Override
    public Calculable sumReal(int arg) {
        log1.log("Суммируем вещественную часть другого числа: " + arg);
        return calc.sumReal(arg);
    }

    @Override
    public Calculable sumImaginary(int arg) {
        log2.log("Суммируем мнимую  часть другого числа: " + arg);
        return calc.sumImaginary(arg);
    }

    @Override
    public Calculable subtractReal(int arg) {
        log1.log("Вычитаем вещественную часть другого числа: " + arg);
        return calc.subtractReal(arg);
    }

    @Override
    public Calculable subtractImaginary(int arg) {
        log2.log("Вычитаем мнимую часть другого числа: " + arg);
        return calc.subtractImaginary(arg);
    }

    @Override
    public int getResultReal() {
        int temp = calc.getResultReal();
        log1.log("Результат сложения вещественных частей: " + temp);
        return temp;
    }

    @Override
    public int getResultImaginary() {
        int temp = calc.getResultReal();
        log2.log("Результат сложения мнимых частей: " + temp);
        return temp;
    }

}
