package elasticcode.exercicio04avancadooo;

public class Pombo extends AnimalVoadorAB {

	protected int qtdeAssas;
	protected double envergaduraAssa;
	

	public Pombo(String nome, String tipoAnimal, int idade, String habitat, double altura, double peso, int qtdePatas,
			int qtdeAssas, double envergaduraAssa) {
		super(nome, tipoAnimal, idade, habitat, altura, peso, qtdePatas);
		this.qtdeAssas = qtdeAssas;
		this.envergaduraAssa = envergaduraAssa;
	}

	public int getQtdeAssas() {
		return qtdeAssas;
	}

	public void setQtdeAssas(int qtdeAssas) {
		this.qtdeAssas = qtdeAssas;
	}

	public double getEnvergaduraAssa() {
		return envergaduraAssa;
	}

	public void setEnvergaduraAssa(double envergaduraAssa) {
		this.envergaduraAssa = envergaduraAssa;
	}

	@Override
    public void comer() {
        
        comidaIngerida += 0.60;
        System.out.println("O pombo comeu: " + comidaIngerida   + "g de migalhas");
      
    }

    @Override
    public void moverse() {
       
        caminhoPercorrido += 5.0;
        System.out.println("O pombo sobrevoou: " +  caminhoPercorrido + "km");
        
    }

    @Override
    public void dormir() {
        
        horasDormindo += 10;
        System.out.println("Pombo dormiu por: " + horasDormindo+" horas");
    }
	
     @Override
	public void voar() {
    	 System.out.println(nome + " esta voando!");
	 }
}
