package abstract_objt;

public class Principal {

	public static void main(String[] args) {
		Carro ferrari = new Carro("000000", "F1", "Vermelho", 2023);
		ferrari.ligar();
		ferrari.acelerar();
		ferrari.frear();
		ferrari.virar();
		
		System.out.println("-----------------------------");
		
		Carro BMW = new Carro("000001", "i8", "Branco", 2019);
		BMW.ligar();
		BMW.acelerar();
		BMW.frear();
		BMW.virar();
		
		System.out.println("-----------------------------");
		
		Onibus Marcopolo = new Onibus("111111", "XB1", "Prata", 2020);
		Marcopolo.ligar();
		Marcopolo.acelerar();
		Marcopolo.frear();
		Marcopolo.virar();
		
		System.out.println("-----------------------------");
		
		Moto Fazer = new Moto("222222","FAZER 150", "Preto", 2021);
		Fazer.ligar();
		Fazer.acelerar();
		Fazer.frear();
		Fazer.virar();
		

	}

}
