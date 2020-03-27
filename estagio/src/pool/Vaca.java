package pool;

public class Vaca extends Mamiferos{
	public Vaca(int idade, float tamanho, String corPelo){
		super(idade, tamanho, corPelo);
	}
	
	public Vaca () {
		
	}
	
	@Override
	public void emitirSom() {
		System.out.println("MUH-MUH-MUH");
	}
}
