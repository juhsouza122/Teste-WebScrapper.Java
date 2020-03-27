package pool;

public class Galinha extends Aves {
	
	public Galinha(int idade, float tamanho, String corPena){
		super(idade, tamanho, corPena);
	}
	
	public Galinha() {
		
	}
	
	@Override
	public void emitirSom() {
		System.out.println("CO-CO-CO");
	}
}
