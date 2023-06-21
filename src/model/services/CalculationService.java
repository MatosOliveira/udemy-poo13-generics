/**
 * 
 */
package model.services;

import java.util.List;

/**
 * Classe de servico - Produto
 * 
 * @author Matos - 20.06.2023
 *
 */
public class CalculationService<T> {
	
	public static <T extends Comparable<T>> T max(List<T> list) {
		if(list.isEmpty()) {
			throw new IllegalStateException("List can't be empty.");
		}
		
		T max = list.get(0);
		for(T item: list) {
			if(item.compareTo(max) > 0) {
				max = item;
			}
		}
		return max;
	}
}
