package Aula04;

public class ProgramacaoFuncional {
    public static void main(String[] args) {
        System.out.println(soma(5,6));
        System.out.println(subtracao(5,6));
        
        Operacao corpoDoMetodo = ((a, b) -> a+b);
        Operacao sub = (a, b) -> {
            return a-b;
        };
        System.out.println(calcula(5,6,corpoDoMetodo));
        System.out.println(calcula(5,6,sub));
    }
    public static int soma (int a, int b) {
        return a + b;
    }
    public static int subtracao (int a, int b) {
        return a - b;
    }

    public static int calcula (int a, int b, Operacao operacao) {
        return operacao.executa(a , b);
    }


}
