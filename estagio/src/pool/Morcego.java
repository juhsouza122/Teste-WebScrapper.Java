package pool;

public class Morcego extends Mamiferos{
	
	public Morcego() {
	}
	
	public Morcego(int idade, float tamanho, String corPelo){
		super(idade,  tamanho, corPelo);
	}
	
	@Override
	public void emitirSom() {
		System.out.println("TRI-TRI-TRI");
	}
	
	public void voar() {
		System.out.println("Morcego voando...");
	}
}
