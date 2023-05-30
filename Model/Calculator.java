package Model;

public final class Calculator implements Calculable {

    private int primaryArg;

    public Calculator(int primaryArg) {
        this.primaryArg = primaryArg;
    }

    @Override
    public Calculable sum(int arg) {
        primaryArg += arg;
        return this;
    }

    @Override
    public Calculable subtract(int arg) {
        primaryArg -= arg;
        return this;
    }

    @Override
    public int getResult() {
        return primaryArg;
    }
}