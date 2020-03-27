package pool;

public class Pato extends Aves{
	
	Pato(int idade, float tamanho, String corPena){
		super(idade, tamanho, corPena);
	}
	
	Pato () {
		
	}
	
	@Override
	public void emitirSom() {
		System.out.println("GUA-GUA-GUA...");
	}
	
	public void voar() {
		System.out.println("Pato voando...");
	}
}
