package elasticcode.exercicio04avancadooo;

public abstract class AnimalAB {
	protected double comidaIngerida;
	protected double caminhoPercorrido;
	protected double horasDormindo;
	
	protected String nome;
	protected String tipoAnimal;
	protected int idade;
	protected String habitat;
	protected double altura;
	protected double peso;

	public AnimalAB() {

	}

	public AnimalAB(String nome, String tipoAnimal, int idade, String habitat, double altura, double peso) {
		super();
		this.nome = nome;
		this.tipoAnimal = tipoAnimal;
		this.idade = idade;
		this.habitat = habitat;
		this.altura = altura;
		this.peso = peso;
	}

	

	
	abstract void comer();

	abstract void moverse();

	abstract void dormir();

}
