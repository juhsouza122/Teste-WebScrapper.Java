package webScraper;
//usei o amazon como meu e-commerce extrai os elementos de cada livro usando o Jsoup  
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.Jsoup;

public class Amazon {
	public static void main(String[] args) throws IOException {
		String url = "https://www.amazon.com/best-sellers-books-Amazon/zgbs/books/ref=zg_bs_nav_0"; //extraindo informações da url do site
		Document pagina = Jsoup.connect(url).userAgent("Jsoup Scraer").get();
		
		String livrosSelecionados = ".aok-inline-block.zg-item > .a-link-normal";
		Elements livrosElementos = pagina.select(livrosSelecionados);
		ArrayList<String> livrostitulos = new ArrayList<>();
		
		for(Element l1: livrosElementos) {
			livrostitulos.add(l1.text());
		}
		
		for(String l2: livrostitulos) {
			System.out.println(l2);
		}
	}
}
