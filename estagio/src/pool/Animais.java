package pool;
/**
 * @author Julia
 *
 *Essa classe é a classe pai que contém os atributos de todos os animais
 * 
*
*/

public abstract class Animais implements Acao{
	//Atributos animais 
	private int idade;
	private float tamanho;
	

	
	//Get and Set
	public Animais(int idade, float tamanho) {
		this.tamanho = tamanho;
		this.idade = idade;
	}
	//Construtor vazio
	public Animais () {
		
	}
	
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getTamanho() {
		return tamanho;
	}

	public void setTamanho(float tamanho) {
		this.tamanho = tamanho;
	}

	
}
