/**
 * 
 */
package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Matos
 *
 */
public class NumberProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
		List<Double> myDoubles = Arrays.asList(3.14, 6.28);
		List<Object> myObjs = new ArrayList<Object>();
		
		copy(myInts, myObjs);
		printList(myObjs);
		
		copy(myDoubles, myObjs);
		printList(myDoubles);
	}
	
	//Princípio get/put - covariância (? extends ...) 
	//Princípio get/put - contravariância (? super ...)
	public static void copy(List<? extends Number> source, List<? super Object> destiny) {
		for(Number number: source) {
			destiny.add(number);
		}
	}
	
	
	public static void printList(List<?> list) {
		for(Object obj: list) {
			System.out.print(obj + " ");
		}
		System.out.println();
	}
	

}
