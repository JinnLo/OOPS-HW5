package fcu.iecs.oops.hw5;

public class Pokemon {
     
	  private final String name ;
	  private int cp ;

	  
	public  Pokemon(String name , int cp){
		this.name = name;
		//super();
		this.cp = cp;
	   
	}	
	public String getName() {
		return name;
	}
	
	public int getCp() {
		return cp;
	}
	public void setCp(int cp) {
		this.cp += cp;
	}
	
}
