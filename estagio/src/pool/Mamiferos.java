package pool;
/**
 * @author Julia
 * Essa classe herda da classe pai contém as caracteristicas das mamiferos
 */
public abstract class Mamiferos extends Animais{
	String corPelo;
	//Construtor
	public Mamiferos( int idade, float tamanho, String corPelo){
		super(idade, tamanho);
		this.setCorPelo(corPelo);
	}
	//Constrtor vazio
	public Mamiferos(){

	}

	public void amamentar() {
		System.out.println("Amamentando...");
	}

	//Get and Set
	public String getCorPelo() {
		return corPelo;
	}

	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}
	
	
}
