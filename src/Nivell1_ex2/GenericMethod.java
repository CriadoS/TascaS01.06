package Nivell1_ex2;

public class GenericMethod <T> { // tipus de dada que pot utilitzar 

    private T variable1;
    private T variable2; 
    private T variable3;
	
    
	public GenericMethod(T variable1, T variable2, T variable3) {
		
		this.variable1 = variable1;
		this.variable2 = variable2;
		this.variable3 = variable3;
	}


	@Override
	public String toString() {
		
		return "Aquest mètode genèric imprimeix el tipus: "+ variable1.getClass()+ " : " + variable1 + ", el tipus " + variable2.getClass() +" :" +variable2
				+ ", i finalment el tipus " +variable3.getClass() +": "+ variable3 + "]";
	}



	
	
	
	
	
	
}
