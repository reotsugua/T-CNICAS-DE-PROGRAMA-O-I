package Aula04;

import java.util.function.Function;

public class Funcitions {
    public static void main(String[] args) {
        String palavra = "teste";
        int resultado = contaCaracters(palavra);
        Function<String, Integer> corpoDoMetodo = (String str) -> str.length();
        int resultado1 = contaCaracters(palavra, corpoDoMetodo);
        System.out.println("resultado = " + resultado);
        System.out.println("resultado1 = " + resultado1);



    }


    private static int contaCaracters(String palavra, Function<String, Integer> corpoDoMetodo) {
        return corpoDoMetodo.apply(palavra);
    }

    private static int contaCaracters(String palavra) {
        return palavra.length();
    }


}
