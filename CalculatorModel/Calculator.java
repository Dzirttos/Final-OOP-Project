package CalculatorModel;

public final class Calculator implements Calculable {

    private int primaryArg;

    public Calculator(int primaryArg) {
        this.primaryArg = primaryArg;
    }

    @Override
    public Calculable subtractImaginary(int arg) {
        primaryArg -= arg;
        return this;
    }

    @Override
    public Calculable subtractReal(int arg) {
        primaryArg -= arg;
        return this;
    }

    @Override
    public Calculable sumImaginary(int arg) {
        primaryArg += arg;
        return this;
    }

    @Override
    public Calculable sumReal(int arg) {
        primaryArg += arg;
        return this;
    }

    @Override
    public int getResultReal() {
        return primaryArg;
    }

    @Override
    public int getResultImaginary() {
        return primaryArg;
    }
}