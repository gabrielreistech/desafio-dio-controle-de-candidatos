import Models.Candidate;
import Validations.ValidationSalaryIntention;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Candidate candidate1 = new Candidate("Ana", "Avenida dos Sonhos", 2500.0);
        Candidate candidate2 = new Candidate("Lucas", "Rua da Esperança", 3000.0);
        Candidate candidate3 = new Candidate("Mariana", "Estrada da Amizade", 3500.0);
        Candidate candidate4 = new Candidate("Carlos", "Praça da Liberdade", 2800.0);
        Candidate candidate5 = new Candidate("Fernanda", "Alameda das Flores", 3200.0);

        List<Candidate> list = List.of(candidate1, candidate2, candidate3, candidate4, candidate5);

        List<Candidate> approved = ValidationSalaryIntention.candidateEvaluation(list, 3000.0);

        System.out.println(approved);
    }
}