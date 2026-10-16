package oops.staticblock;

public class MainClass {
	public static void main(String[] args) {
	    try { 
	      System.out.println("The first time calls forName:");
	      Class c   = Class.forName("oops.staticblock.DemoClass"); 
	      DemoClass a = (DemoClass)c.newInstance();

	      System.out.println("The second time calls forName:");
	      Class c1 = Class.forName("oops.staticblock.DemoClass");

	    } catch (ClassNotFoundException e) {
	           
	    } catch (InstantiationException e) {
	           
	    } catch (IllegalAccessException e) {
	           
	    }
	        
	  }
}
