package LicaoClassAula04;

import java.util.function.BiFunction;

public class Calculadora {
    public int executar(int a, int b, BiFunction<Integer, Integer, Integer> operacao) {
        int resultado = operacao.apply(a, b);
        System.out.println("Resultado: " + resultado);
        return resultado;
    }
}
