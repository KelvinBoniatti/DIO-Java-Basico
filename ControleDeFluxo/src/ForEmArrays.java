public class ForEmArrays {
    public static void main (String[] args){
        String alunos [] = {"Felipe", "Jonas", "Julia", "Marcos"};
        
        // for each: a cada aluno, a posição aluno dentro da array ira se atualizar automaticamente.
        for( String estudande : alunos){
            System.out.println(estudande);
        }
    }
}
