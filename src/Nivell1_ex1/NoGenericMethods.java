package Nivell1_ex1;

public class NoGenericMethods  { 
	
		private String objecte1; 
		private String objecte2; 
		private String objecte3;
		
		public NoGenericMethods(String nomS1, String nomS2, String nomS3) {
			
			this.objecte2= nomS2;
			this.objecte1 = nomS1;
			this.objecte3= nomS3;
		}

		public String getobjecte1() {
			return  objecte1;
		}

		public void setobjecte1(String nomS1) {
			this.objecte1 = nomS1;
		}


		public String getobjecte2() {
			return  objecte2;
		}


		public void setobjecte2(String nomS2) {
			this.objecte2 = nomS2;
		}


		public String getobjecte3() {
			return  objecte3;
		}


		public void setobjecte3(String nomS3) {
			this.objecte3 = nomS3;
		}


		@Override
		public String toString() {
			return "NoGenericMethods [nomS1= " + this.objecte1 + ", nomS2=" + this.objecte2 + ", nomS3=" +  this.objecte3 + "]";
		} 
		
		
		
		

}
