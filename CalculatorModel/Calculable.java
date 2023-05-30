package CalculatorModel;

public interface Calculable {
    Calculable sum(int arg);
    Calculable subtract(int arg);
    int getResult();
}
