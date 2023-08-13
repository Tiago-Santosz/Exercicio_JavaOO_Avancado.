package elasticcode.exercicio04avancadooo;

public class Gato extends AnimalTerrestreAB {

	public Gato(String nome, String tipoAnimal, int idade, String habitat, double altura, double peso, int qtdePatas) {
		super(nome, tipoAnimal, idade, habitat, altura, peso, qtdePatas);

	}

	@Override
	public void comer() {

		comidaIngerida += 0.2;
		System.out.println("O gato comeu: " + comidaIngerida + "g de racao");

	}

	@Override
	public void moverse() {

		caminhoPercorrido += 0.3;
		System.out.println("O gato passeou  por: " + caminhoPercorrido + "metros");

	}

	@Override
	public void dormir() {

		horasDormindo += 13;
		System.out.println("O gato dormiu  por: " + horasDormindo + "h");
	}

}
