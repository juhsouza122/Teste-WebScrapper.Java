package pool;
/**
 * @author Julia
 *Classe main, onde armazena os dados e imprime
 */
import java.util.Scanner;

public class Input {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//Objetos
		Mamiferos morcego = new Morcego();
		Aves galinha = new Galinha();
		Mamiferos vaca = new Vaca();
		Aves pato = new Pato();
		
		//Pato	
		System.out.println("Digite a idade do Pato: ");
		pato.setIdade(entrada.nextInt());
		System.out.println("Digite o tamanho do Pato: ");
		pato.setTamanho(entrada.nextFloat());
		System.out.println("Digite a cor da pena do Pato: ");
		pato.setCorPena(entrada.next());
			
		//Morcego
		System.out.println("Digite a idade do Morcego: ");
		morcego.setIdade(entrada.nextInt());
		System.out.println("Digite o tamanho do Morcego: ");
		morcego.setTamanho(entrada.nextFloat());
		System.out.println("Digite a cor do pelo do Morcego: ");
		morcego.setCorPelo(entrada.next());
			
			
		//Galinha
		System.out.println("Digite a idade da Galinha: ");
		galinha.setIdade(entrada.nextInt());
		System.out.println("Digite o tamanho da Galinha: ");
		galinha.setTamanho(entrada.nextFloat());
		System.out.println("Digite a cor da pena da Galinha: ");
		galinha.setCorPena(entrada.next());
		
		//Vaca
		System.out.println("Digite a idade da Vaca: ");
		vaca.setIdade(entrada.nextInt());
		System.out.println("Digite o tamanho da Vaca: ");
		vaca.setTamanho(entrada.nextFloat());
		System.out.println("Digite a cor do pelo da Vaca: ");
		vaca.setCorPelo(entrada.next());
		
		//Imprimir
		//Pato
		System.out.println();
		System.out.println("A idade do Pato �: " + pato.getIdade());
		System.out.println("O tamanho do Pato �: " + pato.getTamanho());
		System.out.println("A cor da pena do Pato �: " + pato.getCorPena());
		System.out.print("O som do Pato �: ");
		pato.emitirSom();
		pato.botarOvo();
		
		//Morcego
		System.out.println();
		System.out.println("A idade do Morcego �: " + morcego.getIdade());
		System.out.println("O tamanho do Morcego �: " + morcego.getTamanho());
		System.out.println("A cor do pelo do Morcego �: " + morcego.getCorPelo());
		System.out.print("O som do Morcego �: ");
		morcego.emitirSom();
		morcego.amamentar();
		
		//Galinha
		System.out.println();
		System.out.println("A idade da Galinha �: " + galinha.getIdade());
		System.out.println("O tamanho da Galinha �: " + galinha.getTamanho());
		System.out.println("A cor da pena da Galinha �: " + galinha.getCorPena());
		System.out.print("O som da Galinha �: ");
		galinha.emitirSom();
		galinha.botarOvo();
		
		//Vaca
		System.out.println();
		System.out.println("A idade da Vaca �: " + vaca.getIdade());
		System.out.println("O tamanho da Vaca �: " + vaca.getTamanho());
		System.out.println("A cor do pelo da Vaca �: " + vaca.getCorPelo());
		System.out.print("O som da Vaca �: ");
		vaca.emitirSom();
		vaca.amamentar();
		
		entrada.close();
	}
}
