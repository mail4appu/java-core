package hashing;



public class MainClass {
	public static void main(String args[]){
		String s="alex";
		String s1=s;
		HashingExample he=new HashingExample();
		he.add("alex");
		System.out.println("hascode of s: "+s.hashCode());
		he.add("alice");
		System.out.println("hascode of s : "+s.hashCode());
		System.out.println("hascode of s1: "+s1.hashCode());
		if(s1==s){
			System.out.println("hi");
		}
		int size=5;
		String a[]= new String[size];
		for(int i=0;i<5;i++){
			++size;
			System.out.println("arraylength"+a.length);
		}
		System.out.println("e04e32439f695aedb0f397de2b7349de976307f63740b6e69d357a2ecb6759e0".length());
		
	}

}
