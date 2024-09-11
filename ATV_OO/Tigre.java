package ATV_OO;

public class Tigre extends Animal {
	
	public Tigre (String nome, String sexo, String raca) {
		super (nome, sexo, raca);
	}
	
	
	@Override
	public void dormir() {
		System.out.println("O animal está dormindo");
	}
	
	@Override
	public void caminhar() {
		System.out.println("O animal está caminhando");
	}
	
	@Override
	public void correr() {
		System.out.println("O animal está correndo");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("O animal está rugindo");
	}
	

}

