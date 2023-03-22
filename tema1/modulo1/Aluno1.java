//Importações

import java.util.Random;

    //Classe
    public class Aluno {
    
    //Atributos
    private String nome;
    private int idade;
    private double codigo_identificador;
    private Random aleatorio;
	
    //Métodos
    public void Aluno ( String nome , int idade ) {
         aleatorio = new Random ();
         this.nome = nome;
         this.idade = idade;
         this.codigo_identificador = aleatorio.nextDouble ();
    }
    public void definirNome ( String nome ) {
         this.nome = nome;
    }  
    public void definirIdade ( int idade ) {
         this.idade = idade;
    }
}

Aluno novoAluno = new Aluno('Carlos Alberto', 16);