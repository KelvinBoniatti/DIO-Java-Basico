package edu.anatomiaDeClasses;
public class JavaAnatomiaClasses {

public static void main (String [] args){ 

    String primeiroNome = "Kelvin";
    String segundoNome = "Boniatti";
    String nomeCompleto = nomeCompleto(primeiroNome,segundoNome);
    /* Váriavel e método com mesmo nome, porém todo método possui parametros() assim que se diferencia*/
    System.out.println(nomeCompleto);
}

public static String nomeCompleto (String primeiroNome, String segundoNome){
    return "Resultado do método = " + primeiroNome.concat(" ").concat(segundoNome);

}
    

}
