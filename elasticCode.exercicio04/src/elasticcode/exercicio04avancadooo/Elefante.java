package elasticcode.exercicio04avancadooo;

public class Elefante extends AnimalTerrestreAB {

	public Elefante(String nome, String tipoAnimal, int idade, String habitat, double altura, double peso,
			int qtdePatas) {
		super(nome, tipoAnimal, idade, habitat, altura, peso, qtdePatas);

	}

	@Override
	public void comer() {

		comidaIngerida += 16.5;
		System.out.println("O elefante comeu por: " + comidaIngerida + "kg");
	}

	@Override
	public void moverse() {

		caminhoPercorrido += 40.4;
		System.out.println("O elefante percorreu com a manada: " + caminhoPercorrido + "km");
	}

	@Override
	public void dormir() {

		horasDormindo += 2;
		System.out.println("O elefante descansou por: " + horasDormindo + "h");

	}

}
