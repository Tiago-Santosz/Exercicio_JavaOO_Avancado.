package elasticcode.exercicio04avancadooo;

public abstract class AnimalTerrestreAB extends AnimalAB {
	
	private int qtdePatas;

	public AnimalTerrestreAB(String nome, String tipoAnimal, int idade, String habitat, double altura, double peso,
			int qtdePatas) {
		super(nome, tipoAnimal, idade, habitat, altura, peso);
		this.qtdePatas = qtdePatas;
		
	}

	public int getQtdePatas() {
		return qtdePatas;
	}

	public void setQtdePatas(int qtdePatas) {
		this.qtdePatas = qtdePatas;
	}
	
	
}
