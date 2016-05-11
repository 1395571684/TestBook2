package threepchapter.five;

public abstract  class  Vehicle implements Comparable<Vehicle>{
	private String name;
   Vehicle(String name) {
	// TODO Auto-generated constructor stub
    this.name=name;
   }
	public String getName() {
		return name;
	}
	
	
	@Override
	public int compareTo(Vehicle o) {
		// TODO Auto-generated method stub
		int res;
		if(name>o.getName())
			res=-1;
		else if(name<o.getName())
			res=1;
		return res;
	}


}
