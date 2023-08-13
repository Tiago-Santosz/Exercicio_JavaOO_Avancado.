package elasticcode.exercicio04avancadooo;

public abstract class AnimalVoadorAB extends AnimalAB{
	protected int qtdePatas;
	
	public AnimalVoadorAB(String nome, String tipoAnimal, int idade, String habitat, double altura, double peso,
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




	public void voar() {
	 
 }
}
