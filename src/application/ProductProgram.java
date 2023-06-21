/**
 * 
 */
package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Product;
import model.services.CalculationService;

/**
 * @author Matos
 *
 */
public class ProductProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product> listaProdutos = new ArrayList<>();
		
		String path = "C:\\Temp\\Lista Produtos2.csv";
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			
			while(line != null) {
				String[] produtos = line.split(";");
				listaProdutos.add(new Product(produtos[0], Double.parseDouble(produtos[1])));
				line = br.readLine();
			}
			
			Product product =  CalculationService.max(listaProdutos);
			System.out.println("MAX: ");
			System.out.println(product);
			
		} catch(IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}

		sc.close();
	}

}
