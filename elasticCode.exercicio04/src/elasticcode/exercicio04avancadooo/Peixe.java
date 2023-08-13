package elasticcode.exercicio04avancadooo;

public class Peixe extends AnimalMarinhoAB {

	public Peixe(String nome, String tipoAnimal, int idade, String habitat, double altura, double peso) {
		super(nome, tipoAnimal, idade, habitat, altura, peso);

	}

	@Override
	public void comer() {

		comidaIngerida += 0.5;
		System.out.println("O peixe comeu: " + comidaIngerida);
	}

	@Override
	public void moverse() {

		caminhoPercorrido += 8.5;
		System.out.println("O peixe percorreu: " + caminhoPercorrido + " metros");
	}

	@Override
	public void dormir() {

		horasDormindo += 0.20;
		System.out.println("O peixo dormiu por :" + horasDormindo + " minutos");
	}

	@Override
	public void nadar() {

		System.out.println(nome + " esta nadando!");
	}

}
