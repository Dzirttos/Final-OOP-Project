package Logger;

import CalculatorModel.Calculable;
import CalculatorModel.ICalculableFactory;

public class CalcFactory implements ICalculableFactory {

    private Loggable log1;
    private Loggable log2;
    private ICalculableFactory calculableFactory;

    public CalcFactory(Loggable log1, Loggable log2, ICalculableFactory calculableFactory) {
        super();
        this.log1 = log1;
        this.log2 = log2;
        this.calculableFactory = calculableFactory;
    }


    @Override
    public Calculable create(int primaryArg) {
        return new CalculatorLogger(log1, log2, calculableFactory.create(primaryArg));
    }

}
