package Teste;

import java.time.LocalDate;
import java.time.Period;
import java.util.Optional;

public class CalculadoraIdade {
    public static void main(String[] args) {
        LocalDate dataNascimento = LocalDate.of(1992, 3, 5);
        Optional<Integer> idade = CalculadoraIdade.descobrirIdade(dataNascimento);

        if (idade.isPresent()) {
            System.out.println("A idade da pessoa é: " + idade.get());
        } else {
            System.out.println("A data de nascimento não foi fornecida.");
        }
    }

    public static Optional<Integer> descobrirIdade(LocalDate dataNascimento) {
        if (dataNascimento == null) {
            return Optional.empty();
        }
        LocalDate dataAtual = LocalDate.now();
        return Optional.of(Period.between(dataNascimento, dataAtual).getYears());



    }

}

