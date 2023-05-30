package CalculatorModel;

import Logger.Loggable;

public class CalcFactory implements ICalculableFactory {


    private Loggable log;
    private ICalculableFactory calculableFactory;

    public CalcFactory(Loggable log, ICalculableFactory calculableFactory) {
        super();
        this.log = log;
        this.calculableFactory = calculableFactory;
    }

    @Override
    public Calculable create(int primaryArg) {
        return new CalculatorLogger(log, calculableFactory.create(primaryArg));
    }
    
}
