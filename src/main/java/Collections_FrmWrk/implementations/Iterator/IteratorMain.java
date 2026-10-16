package collections_frmwrk.implementations.iterator;

import java.util.Iterator;

public class IteratorMain {
	public static void main(String[] args) {
		MyContainer names= new MyContainer();
		collections_frmwrk.implementations.iterator.MyContainer.MyIterator it=names.getIterator();
		System.out.println(it);
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
	


}
