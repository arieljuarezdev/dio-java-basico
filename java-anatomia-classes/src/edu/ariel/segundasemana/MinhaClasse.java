package edu.ariel.segundasemana;
public class MinhaClasse {
    public static void main (String [] args){
        
        String nome1 = "Ariel";
        String nome2 = "Juarez";

        String result = nomeCompleto(nome1, nome2);

        System.out.print(result);

    }

    public static String nomeCompleto(String nome, String sobrenome){
        return nome.concat(" ").concat(sobrenome);
    }
}
