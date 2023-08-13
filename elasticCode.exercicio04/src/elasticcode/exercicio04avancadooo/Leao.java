package elasticcode.exercicio04avancadooo;

public class Leao extends AnimalTerrestreAB {

	public Leao(String nome, String tipoAnimal, int idade, String habitat, double altura, double peso, int qtdePatas) {
		super(nome, tipoAnimal, idade, habitat, altura, peso, qtdePatas);
		
	}

	@Override
    public void comer() {
        
        comidaIngerida += 25.4;
    }

    @Override
    public void moverse() {
       
        caminhoPercorrido += 8.0;
    }

    @Override
    public void dormir() {
       
        horasDormindo += 20;
    }

}
