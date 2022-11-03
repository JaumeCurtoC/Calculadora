package JUnit.Calculadora;

public class Calculos {

	public String suma(double i1, double i2) {
		String result = String.valueOf(i1+i2);
		return result;
	}
	
	public String resta(double i1, double i2) {
		String result = String.valueOf(i1-i2);
		return result;
	}
	
	public String multiplicacion(double i1, double i2) {
		String result = String.valueOf(i1*i2);
		return result;
	}
	
	public String division(double i1, double i2) {
		String result = String.valueOf(i1/i2);
		return result;
	}
}
