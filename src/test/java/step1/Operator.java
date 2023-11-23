package step1;

import java.util.function.BiFunction;

public enum Operator {

    PLUS("+", (a, b) -> a + b),
    SUBTRACT("-", (a, b) -> a - b),
    MULTIPLE("*", (a, b) -> a * b),
    DIVIDE("/", (a, b) -> a / b)
    ;

    private String symbol;

    private BiFunction<Integer, Integer, Integer> operate;

    Operator(final String symbol, final BiFunction<Integer, Integer, Integer> operate) {
        this.symbol = symbol;
        this.operate = operate;
    }

    public Integer calculate(Integer a, Integer b) {
        return operate.apply(a, b);
    }

}
