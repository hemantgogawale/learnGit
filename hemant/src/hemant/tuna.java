package hemant;

public class tuna {
	private String girlName;
	
	public tuna(String name){
		girlName = name;
	}
	public void setName(String name){
		girlName = name;
	}
	
	public String getName(){
		return girlName;
	}
	
	public void message(){
		System.out.printf("girl name is: %s\n", getName());
	}
}
