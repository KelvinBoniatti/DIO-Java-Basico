import java.util.concurrent.ThreadLocalRandom;

public class SelecaoCandidato {
    public static void main(String[] args){
        candidatosSelecao();
    }

    static void candidatosSelecao () {
            String [] candidatos = {"Felipe","Marcia","Julia","Paulo","Augusto","Monica","Fabricio","Mirela","Daniela","Jorge"};
            int candidatosSelecionados = 0;
            int candidatoAtual = 0;
            double salarioBase = 2000.0;
            while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
                String candidato = candidatos[candidatoAtual];
                double salarioPretendido = valorPretendido();
                
                System.out.println( "O candidato " + candidato + " pediu um salário de " + salarioPretendido );

                if (salarioPretendido <= salarioBase) {
                    System.out.println("O candidato " + candidato + " foi selecionado(a).");
                    candidatosSelecionados++;                   
                }
                candidatoAtual++;

            }
            System.out.println("Foram selecionados "+ candidatosSelecionados + " candidatos.");
    }

    public static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }

    static void analisarCandidato (double salarioPretendido){
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato");
        }
        else if (salarioBase == salarioPretendido) 
           System.out.println("Ligar para o candidato com proposta");

        else {System.out.println("Aguardadndo resultado dos demais candidatos.");}
        }

        
 }



