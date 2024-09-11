package ATV_OO;

public class PrincipalAnimal {

	public static void main(String[] args) {
		
		Lobo lobo = new Lobo("Wolf", "Macho", "Lobo-Cinzento");
		lobo.dormir();
		lobo.caminhar();
		lobo.correr();
		lobo.emitirSom();
		
		System.out.println("-----------------------------");
		
		Leao leao = new Leao("Lion", "Macho", "Leao Africano");
		leao.dormir();
		leao.caminhar();
		leao.correr();
		leao.emitirSom();
		
		System.out.println("-----------------------------");
		
		Tigre tigre = new Tigre("Tiger", "Femea", "Tigre Branco");
		tigre.dormir();
		tigre.caminhar();
		tigre.correr();
		tigre.emitirSom();
		
		System.out.println("-----------------------------");
		
		Cachorro cao = new Cachorro("Dog", "Femea", "Pitbull");
		cao.dormir();
		cao.caminhar();
		cao.correr();
		cao.emitirSom();
		
		System.out.println("-----------------------------");
		
		Gato gato = new Gato("Cat", "Macho", "Persa");
		gato.dormir();
		gato.caminhar();
		gato.correr();
		gato.emitirSom();
		
			
		

	}

}
