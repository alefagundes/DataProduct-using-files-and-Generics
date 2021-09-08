package service;

import java.util.List;

public class calculationServise {
	
	public static <T extends Comparable<? super T>> T max(List<T> elemento) {
		if(elemento.isEmpty()) {
			throw new IllegalStateException("List can't be empty!");
		}else {
			T max = elemento.get(0);
			for(T item : elemento) {
				if(item.compareTo(max) > 0) {
					max = item;
				}
				
			}
			return max;
		}
	}
	

}
