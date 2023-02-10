package LicaoClassAula04;

import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> somar = (x, y) -> x + y;
        BiFunction<Integer, Integer, Integer> subtrair = (x, y) -> x - y;
        BiFunction<Integer, Integer, Integer> multiplicar = (x, y) -> x * y;
        BiFunction<Integer, Integer, Integer> dividir = (x, y) -> x / y;

        Calculadora calculadora = new Calculadora();

        calculadora.executar(5, 3, somar);
        calculadora.executar(5, 3, subtrair);
        calculadora.executar(5, 3, multiplicar);
        calculadora.executar(5, 3, dividir);
    }
}
