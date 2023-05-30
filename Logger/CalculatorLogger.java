package Logger;

import CalculatorModel.Calculable;

public class CalculatorLogger implements Calculable {

    private Loggable log;
    private Calculable calc;

    public CalculatorLogger(Loggable log, Calculable calc) {
        super();
        this.log = log;
        this.calc = calc;
        log.log("Первый аргумент равен: " + calc.getResult());
    }

    @Override
    public Calculable sum(int arg) {
        log.log("Суммируем: " + arg);
        return calc.sum(arg);
    }

    @Override
    public Calculable subtract(int arg) {
        log.log("Вычитаем: " + arg);
        return calc.subtract(arg);
    }

    @Override
    public int getResult() {
        int temp = calc.getResult();
        log.log("Результат: " + temp);
        return temp;
    }

}
