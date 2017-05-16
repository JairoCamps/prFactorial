package prFactorial;

public class Factorial {

	public static int calcular (int entrada){
		if (entrada == 1 || entrada == 0) {
			return 1;
		}else{
			return entrada*calcular(entrada-1);
		}
	}
}
