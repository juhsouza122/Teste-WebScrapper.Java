package pool;
/**
 * @author Julia
 * Essa classe herda da classe pai contém as caracteristicas das aves
 */
public abstract class Aves extends Animais {
	String corPena;
	
	//Construtor
	Aves(int idade, float tamanho, String corPena){
		super(idade, tamanho);
		this.setCorPena(corPena);
	}
	//Constrtor vazio
	 Aves() {
		 
	 }
	
	public void botarOvo() {
		System.out.println("Botando ovo...");
	}
	
	//Get and Set
	public String getCorPena() {
		return corPena;
	}
	public void setCorPena(String corPena) {
		this.corPena = corPena;
	}
	
	
}
