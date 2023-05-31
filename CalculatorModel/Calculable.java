package CalculatorModel;

public interface Calculable {
    Calculable sumReal(int arg);
    Calculable subtractReal(int arg);
    int getResultReal();
    Calculable sumImaginary(int arg);
    Calculable subtractImaginary(int arg);
    int getResultImaginary();

}
