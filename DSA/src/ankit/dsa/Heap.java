package ankit.dsa;
import java.util.ArrayList;
public class Heap <T extends Comparable>{
	
	private ArrayList<T> list = new ArrayList<>();

	public Heap(ArrayList<T> list) {
		this.list = list;
	}
	
	private void swap(int first, int second) {
		T temp = list.get(first);
		list.set(first, list.get(second)) ;
		list.set(second, temp);
		
		
	}
	
	
	

}
