package nivell3;

public class Generica <T> {
	
	// Ha de tenir dos mètodes 
	
	public <T extends ITelefon> void trucar(T argument) { // El tipus ha de ser heretat de telèfon i entra per parametre
	       
			argument.trucar();
    }
	
	public <T extends Smartphone> void ferFotos(T argument) {
		    
			argument.trucar();
			argument.ferFotos();
	}

}
