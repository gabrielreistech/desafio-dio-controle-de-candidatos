package Validations;

import Models.Candidate;

import java.util.ArrayList;
import java.util.List;

public class ValidationSalaryIntention {

    public static List<Candidate> candidateEvaluation(List<Candidate> list, Double salaryBase){
        List<Candidate> listApproved = new ArrayList<>();
        for(Candidate newList : list){
            Candidate approved = salaryIntentionApproved(newList, salaryBase);
            if(approved != null){
                listApproved.add(approved);
            }
        }
       return printList(listApproved);
    }

    private static List<Candidate> printList(List<Candidate> list){
        System.out.println("\nTotal de aprovados: " + list.size());
        System.out.println("\nLista dos aprovados: " );
        return list;
    }

    private static Candidate salaryIntentionApproved(Candidate candidate, Double salaryBase){
        if(salaryBase >= candidate.getSalaryIntention()){
            System.out.println("Ligar para o candidato " + candidate.getName());
            return candidate;
        }
        else if(salaryBase < candidate.getSalaryIntention()){
            System.out.println("Ligar para o candidato "+ candidate.getName() + " com contra proposta");
            return null;
        } else {
            System.out.println("Aguardando resultado dos demais candidatos");
            return null;
        }
    }
}
