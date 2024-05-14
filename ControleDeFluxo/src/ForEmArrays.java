public class ForEmArrays {
    public static void main (String[] args){
        String alunos [] = {"Felipe", "Jonas", "Julia", "Marcos"};

        // O lenght(tamanho), esta se referindo a quantidade de posições na array.
        for( int x=0; x < alunos.length; x++){
            System.out.println("O aluno no indice " + x + " é o(a) " + alunos [x]+".");
        }
    }
}
