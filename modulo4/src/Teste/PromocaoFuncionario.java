package Teste;

import java.time.LocalDate;
import java.time.Period;
import java.util.Optional;

public class PromocaoFuncionario {
    public static Optional<String> verificaPromocao(Optional<Funcionario> funcionario) {
        return funcionario.filter(f -> Period.between(f.getDataAdmissao(), LocalDate.now()).getYears() > 2)
                .map(Funcionario::getNome);
    }

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario(1, "João Silva", "Masculino", LocalDate.of(1990, 5, 1),
                "São Paulo", "Gerente", LocalDate.of(2015, 5, 1), 5000.0);
        Optional<String> resultado = verificaPromocao(Optional.of(funcionario));
        if (resultado.isPresent()) {
            System.out.println("O funcionário " + resultado.get() + " tem direito a promoção.");
        } else {
            System.out.println("O funcionário não tem direito a promoção.");
        }
    }
}
