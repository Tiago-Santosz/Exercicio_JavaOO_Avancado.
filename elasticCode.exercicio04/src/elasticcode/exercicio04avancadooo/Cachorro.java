package elasticcode.exercicio04avancadooo;

public class Cachorro extends AnimalTerrestreAB {

	public Cachorro(String nome, String tipoAnimal, int idade, String habitat, double altura, double peso,
			int qtdePatas) {
		super(nome, tipoAnimal, idade, habitat, altura, peso, qtdePatas);
		
	}

	@Override
    public void comer() {
        
        comidaIngerida += 0.6;
        System.out.println("O cachorro comeu: " + comidaIngerida   + "g de racao");
    }

    @Override
    public void moverse() {
       
        caminhoPercorrido += 5.0;
        System.out.println("O correu: " +   caminhoPercorrido + "km");
    }

    @Override
    public void dormir() {
        
        horasDormindo += 14;
        System.out.println("O cachorro dormiu por: " +  horasDormindo  + "h");
        
    }

}
