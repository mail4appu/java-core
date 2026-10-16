package collections_frmwrk.arraylist;

import java.util.Arrays;

public class MyArrayListMain {
	public static void main(String[] args) {

		String[] myarr= new String[50];
		myarr[0]="10";
		myarr[12]="34";
		System.out.println(myarr[2]);
		System.out.println(Arrays.toString(myarr));
		System.out.println(myarr.length);
		MyArrayList myList= new MyArrayList();
		myList.add("alex");
		myList.add("maddy");
		myList.add("raj");
		myList.add("blake");
		System.out.println("List size: "+myList.size());
		
		myList.add(2, "daniel");
		System.out.println("List size: "+myList.size());
		System.out.println(myList.get(4));
		System.out.println(""+myList.remove(1));
		System.out.println(myList.get(1));
		
	}

}
