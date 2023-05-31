package Nivell2_ex1;

public class GenericMethodN2 <T>{
	
	 	private T variable1;
	    private T variable2; 
	    private int numero;
	      
	    public GenericMethodN2(T variable1, T variable2, int numero) {
			
			this.variable1 = variable1;
			this.variable2 = variable2;
			this.numero = numero;
		}
	    
		@Override
		public String toString() {
			
			return "Aquest mètode genèric imprimeix el tipus: "+ variable1.getClass()+ " : " + variable1 + ", el tipus " + variable2.getClass() +" :" +variable2
					+ ", i finalment el tipus int " + numero + "]";
		}

	
		

	    

}
